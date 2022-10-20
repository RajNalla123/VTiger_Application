package practice1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericutility.Webdriverutility;
import com.mifmif.common.regex.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablehandlingTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Webdriverutility wdu=new Webdriverutility(driver);
		wdu.maximize();
		wdu.implicitlywait();
		
		driver.get("https://www.icc-cricket.com");
		driver.findElement(By.xpath("//button[normalize-space()='Rankings' and@class='linked-list__dropdown-label js-dropdown-btn']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Team Rankings']")).click();
		
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		
		 /*for(int i = 1;i<=rows.size();i++)
		 {
			 for(int j=1;j<=5;j++)
			 {
				 String columns = driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+j+"]")).getText();
				 System.out.print(columns+" ");
			 }
			 System.out.println(" ");
		 }*/
		 
		
		 
		 for(int i = 1;i<=rows.size();i++)
		 {
			 for(int j=1;j<=1;j++)
			 {
				 String columns = driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td[2]")).getText();
				 System.out.print(columns+" ");
			 }
			 System.out.println(" ");
		 }
	}

}
