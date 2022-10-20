package com.crm.vtiger.testcases2.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.genericutility.ExcelfileUtility;
import com.genericutility.JavaUtility;
import com.genericutility.PropertyfileUtility;
import com.genericutility.Webdriverutility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilitiesPractice2Test {
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
		String refvar = efu.readdatafromExcelfile("sheet1", 3, 1)+JavaUtility.generateRanNum();
		String refvar1 = efu.readdatafromExcelfile("sheet1", 4, 0);
				
		driver.get(URL);
		//String orgname="raj solutions"+JavaUtility.generateRanNum();
		
		wdu.implicitlywait();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
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

		
		WebElement industryname=driver.findElement(By.name("industry"));
		industryname.click();
		
		WebElement selectindus=driver.findElement(By.xpath("//select[@name='industry']"));
		selectindus.sendKeys(refvar1);
		//WebElement selectindus=driver.findElement(By.xpath("//select[@name='industry']/option[3]"));
		selectindus.click();
		
		WebElement lname=driver.findElement(By.xpath("//input[@class='crmbutton small save']"));
		lname.click();
		
		String data = driver.findElement(By.className("dvHeaderText")).getText();
		String data1 = refvar;
		if(data.contains(data1))
		{
			System.out.println("validation successfully");
		}
		else
		{
			System.out.println("validation unsuccessfully");
		}
		WebElement ele=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		
		wdu.mouseoverAction(ele);
		//Actions act=new Actions(driver);
		//act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
		
		
		
		
		
	}

}



