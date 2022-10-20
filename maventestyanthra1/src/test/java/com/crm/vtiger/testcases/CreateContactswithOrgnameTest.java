package com.crm.vtiger.testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactswithOrgnameTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("raj nalla");
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		//driver.findElement(By.xpath("//a[text()='raj solutions']")).click();
		//driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for(String totalwindows:allwindow)
		{
			driver.switchTo().window(totalwindows);
			System.out.println(totalwindows);
		}

		WebElement orgsearch = driver.findElement(By.name("search_text"));
		orgsearch.sendKeys("raj solutions10");		
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='raj solutions10']")).click();
		driver.switchTo().window(parentwindow);
		driver.findElement(By.name("button")).click();
		Thread.sleep(3000);
        WebElement ele=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
		
		
		
		
	}

}



