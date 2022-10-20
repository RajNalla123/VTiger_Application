package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("searchDropdownBox")).click();
		List<WebElement> str = driver.findElements(By.name("url"));
		//driver.findElement(By.xpath("//select[@name='url']/option[9]")).click();
		for(WebElement ele:str)
		{
			String data = ele.getText();
			System.out.println(data);
		}
		driver.findElement(By.xpath("//select[@name='url']/option[9]")).click();
		

	}

}
