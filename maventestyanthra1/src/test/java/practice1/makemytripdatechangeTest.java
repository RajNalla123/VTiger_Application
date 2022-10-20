package practice1;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericutility.Webdriverutility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytripdatechangeTest {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		Webdriverutility wdu=new Webdriverutility(driver);
		wdu.maximize();

		wdu.implicitlywait();
		driver.get("https://www.makemytrip.com/");
		
		Date date=new Date();
		String d = date.toString();
		System.out.println(d);
		
		String[] arr = d.split(" ");
		
		String day=arr[0];
		String month=arr[1];
		String date1=arr[2];
		String year=arr[5];
		
		String exp= day+" "+month+" "+date1+" "+year;
		System.out.println(exp);
		
		driver.findElement(By.className("langCardClose")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='"+exp+"']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
		
	}

}
