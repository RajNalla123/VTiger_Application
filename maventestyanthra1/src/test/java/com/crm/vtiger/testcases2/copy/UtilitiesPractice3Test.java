package com.crm.vtiger.testcases2.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericutility.ExcelfileUtility;
import com.genericutility.JavaUtility;
import com.genericutility.PropertyfileUtility;
import com.genericutility.Webdriverutility;

import Objectrepository.Loginpageclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilitiesPractice3Test {
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
		String refvar = efu.readdatafromExcelfile("Sheet1", 1, 1);
		String lName1 = efu.readdatafromExcelfile("Sheet1", 3, 0);
		String orgName1 = efu.readdatafromExcelfile("Sheet1", 2, 1);
		
		
		driver.get(URL);
		
		
		
		wdu.implicitlywait();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement uname=driver.findElement(By.cssSelector("input[type='text']"));
		uname.sendKeys(USERNAME);
		
		WebElement pword=driver.findElement(By.cssSelector("input[type='password']"));
		pword.sendKeys(PWD);
		
		WebElement login=driver.findElement(By.cssSelector("input[type='submit']"));
		login.click();
		
		WebElement contacts=driver.findElement(By.linkText("Contacts"));
		contacts.click();
		
		WebElement createcon=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createcon.click();
		
		WebElement value = driver.findElement(By.name("salutationtype"));
		wdu.SelectByValue(value, refvar);
		
		WebElement lName = driver.findElement(By.name("lastname"));
		lName.sendKeys(lName1);
		
		 WebElement orgbutton=driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
		 orgbutton.click();
		 
		//driver.findElement(By.xpath("//img[@title='Select']")).click();
		String pw = wdu.getparentHandle();
		//String parentwindow = driver.getWindowHandle();
		//System.out.println(parentwindow);
		Thread.sleep(3000);
		
		wdu.allHandles(pw);
		/*Set<String> allwindow = driver.getWindowHandles();
		
		for(String totalwindows:allwindow)
		{
			driver.switchTo().window(totalwindows);
			System.out.println(totalwindows);
		}*/
		

		WebElement orgsearch = driver.findElement(By.name("search_text"));
		orgsearch.sendKeys(orgName1);
		
		WebElement search=driver.findElement(By.name("search"));
		search.click();
		
		WebElement orgnamepresent=driver.findElement(By.id("1"));
		orgnamepresent.click();
		
	
	    //driver.switchTo().window(pw);
		wdu.allHandles(pw);
		
		WebElement button=driver.findElement(By.name("button"));
		button.click();
		
        WebElement ele=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
        Thread.sleep(3000);
		wdu.mouseoverAction(ele);
		//Actions act=new Actions(driver);
		//act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
		
		
		
		
	

}


}
