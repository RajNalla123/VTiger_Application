package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vtigertc2 {
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
		driver.findElement(By.name("accountname")).sendKeys("raj.nhf56");
		driver.findElement(By.name("industry")).click();
		driver.findElement(By.xpath("//select[@name='industry']/option[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		String data = driver.findElement(By.className("dvHeaderText")).getText();
		String data1 =  "raj.nhf56";
		if(data.contains(data1))
		{
			System.out.println("validation successfully");
		}
		else
		{
			System.out.println("validation unsuccessfully");
		}
		WebElement ele=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
		
		
		
		
		
	}

}

