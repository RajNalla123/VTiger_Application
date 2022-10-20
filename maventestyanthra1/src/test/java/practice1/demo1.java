package practice1;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	
	Thread.sleep(3000);
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='Rings ']"));
	Thread.sleep(3000);
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
	List<WebElement> data = driver.findElements((By.className("b-price-wrapper")));
	for(WebElement data1:data)
	{
		String ele1=data1.getText();
		System.out.println(ele1);
		System.out.println();
	}
	
	
	}

}
