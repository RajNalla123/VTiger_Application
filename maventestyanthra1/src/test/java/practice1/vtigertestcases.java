package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vtigertestcases {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("raj solutions pvtt");
		
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		
		
		List<WebElement> ele = driver.findElements(By.xpath("//span[text()='[ ACC2 ] raj solutions pvt ltd -  Organization Information']"));
		for(WebElement ele1:ele)
		{
			String data = ele1.getText();
			System.out.println(data);
		}
		WebElement we=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
		
	
		
		
	}

}
