package com.crm.vtiger.testcases3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericutility.ExcelfileUtility;
import com.genericutility.JavaUtility;
import com.genericutility.PropertyfileUtility;
import com.genericutility.Webdriverutility;

import Objectrepository.Homepageclass;
import Objectrepository.Loginpageclass;
import Objectrepository.Neworgpageclass;
import Objectrepository.Orgpageclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMclassPractice1Test {
	

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
		
		Loginpageclass lpc=new Loginpageclass(driver);
		lpc.login(USERNAME, PWD);
		
		Homepageclass hpc=new Homepageclass(driver);
		hpc.orgClick();
		
		Orgpageclass opc=new Orgpageclass(driver);
		opc.getCreOrg().click();
		
		Neworgpageclass nop=new Neworgpageclass(driver);
		nop.orgTF(refvar);
		nop.sButton();
		Thread.sleep(3000);
		
		hpc.signout(driver);
		driver.close();
	}
}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	
		
		






