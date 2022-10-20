package com.crm.vtiger.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrganisationwithIndustrytypeTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//String data="nallaraj1";
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("nallaraj125");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("txtBox")).sendKeys("nallaraj12");
		driver.findElement(By.name("search_field")).click();
		driver.findElement(By.xpath("//select[@name='search_field']/option[2]")).click();
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		 WebElement searchTF = driver.findElement(By.xpath("//a[@title='Organizations']"));
		searchTF.sendKeys("nallaraj12");
		*/
		String ele = driver.findElement(By.className("dvHeaderText")).getText();
	
		String ele1 = "nallaraj125";
		Thread.sleep(3000);
		if(ele.contains(ele1))
		{
			System.out.println("validation successfully");
		}
		else
		{
			System.out.println("validation unsuccessfully");
		}
        WebElement ele3=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele3).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	}

}



