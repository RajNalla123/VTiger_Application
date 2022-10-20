package com.crm.vtiger.testcases;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.genericutility.ExcelfileUtility;
import com.genericutility.JavaUtility;
import com.genericutility.PropertyfileUtility;
import com.genericutility.Webdriverutility;

import Objectrepository.Loginpageclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1Test {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		Webdriverutility wdu=new Webdriverutility(driver);
		
		wdu.maximize();
		//driver.manage().window().maximize();
		
		PropertyfileUtility pfu=new PropertyfileUtility();
		String URL = pfu.readDatafrompropertyFile("url");
		String USERNAME = pfu.readDatafrompropertyFile("username");
		String PWD = pfu.readDatafrompropertyFile("password");
		
		ExcelfileUtility efu=new ExcelfileUtility();
		String refvar = efu.readdatafromExcelfile("Sheet1", 3, 1)+JavaUtility.generateRanNum();
		
		driver.get(URL);
		
		//Loginpageclass lpc=new Loginpageclass(driver);
		//lpc.login(USERNAME, refvar);
		
		//String orgname="raj solutions"+JavaUtility.generateRanNum();
		
		wdu.implicitlywait();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement un = driver.findElement(By.cssSelector("input[type='text']"));
		un.sendKeys(USERNAME);
		
		WebElement pwd=driver.findElement(By.cssSelector("input[type='password']"));
		pwd.sendKeys(PWD);
		
		WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));
		login.click();
		
		WebElement oname=driver.findElement(By.xpath("//a[text()='Organizations']"));
		oname.click();
		
		WebElement corg = driver.findElement(By.xpath("//img[@alt='Create Organization...']"));
		corg.click();
		
		WebElement aname = driver.findElement(By.name("accountname"));
		aname.sendKeys(refvar);
		
		WebElement save=driver.findElement(By.xpath("//input[@class='crmbutton small save']"));
		save.click();
		
		
		
		/*List<WebElement> ele = driver.findElements(By.xpath("//span[text()='[ ACC2 ] raj solutions pvt ltd -  Organization Information']"));
		for(WebElement ele1:ele)
		{
			String data = ele1.getText();
			System.out.println(data);
		}*/
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
		wdu.mouseoverAction(we);
		//Actions act=new Actions(driver);
		//act.moveToElement(we).perform();
		WebElement signout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		signout.click();
		
		driver.close();
		
	
		
		
	}

}



