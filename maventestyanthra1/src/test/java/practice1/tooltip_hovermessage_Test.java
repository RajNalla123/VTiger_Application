package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tooltip_hovermessage_Test {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.lenskart.com");
		
		//String Title = driver.findElement(By.xpath("getGaData")).getAttribute("title");
        //System.out.println(Title);
		
		driver.findElement(By.name("q")).click();
		Thread.sleep(3000);
		
		List<WebElement> allele = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']/li/a"));
	
		//for(WebElement ele1:allele)
		//{
		//	String ele2 = ele1.getText();
		//	System.out.println(ele2);
		//}
		for(int i=0;i<allele.size();i++)
		{
			String name = allele.get(i).getText();
			System.out.println(name);
		}
	}

}
