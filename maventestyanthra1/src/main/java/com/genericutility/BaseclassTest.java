package com.genericutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import Objectrepository.Loginpageclass;
import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners

public class BaseclassTest {
	public WebDriver driver;
	public static WebDriver sdriver;

	PropertyfileUtility pfu=new PropertyfileUtility();

	@BeforeSuite(groups = {"smoke","integration","regression"})
	public void connectingdatabase()
	{
		System.out.println("connecting to database");
	}



	@AfterSuite(groups = {"smoke","integration","regression"})
	public void Disconnectingdatabase()
	{
		System.out.println("Disconnecting to Database");
	}



	@BeforeClass(groups = {"smoke","integration","regression"})
	public void launchbrowser() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		Webdriverutility wdu=new Webdriverutility(driver);
		wdu.maximize();
		//driver.manage().window().maximize();
		driver.get(pfu.readDatafrompropertyFile("url"));
		wdu.implicitlywait();

	}



	@AfterClass(groups = {"smoke","integration","regression"})
	public void closebrowser()
	{
		driver.close();
	}



	@BeforeMethod(groups = {"smoke","integration","regression"})
	public void login() throws Throwable
	{
		
		String USERNAME = pfu.readDatafrompropertyFile("username");
		String PWD = pfu.readDatafrompropertyFile("password");

		//ExcelfileUtility efu=new ExcelfileUtility();
		//String refvar = efu.readdatafromExcelfile("Sheet1", 3, 1)+JavaUtility.generateRanNum();

		Loginpageclass lpc=new Loginpageclass(driver);
		lpc.login(USERNAME, PWD);

	}



	@AfterMethod(groups = {"smoke","integration","regression"})
	public void logout()
	{
		WebElement we=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Webdriverutility wdu=new Webdriverutility(driver);
		wdu.mouseoverAction(we);
		
		WebElement signout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		signout.click();
		
		//HomePageClass hpc = new HomePageClass(driver);
		//hpc.signOut(driver);

	}
}
