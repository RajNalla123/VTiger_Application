package amazontabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonscenarioTest {
	private static final int KeyEventVK_stroke = 0;

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ftab = driver.findElement(By.linkText("Best Sellers"));
		Actions act=new Actions(driver);
		act.contextClick(ftab).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		Actions act1=new Actions(driver);
		act1.contextClick(mobiles).perform();
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement books = driver.findElement(By.linkText("Books"));
		Actions act3=new Actions(driver);
		act1.contextClick(books).perform();
		
		Robot r3=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		String parenthandle = driver.getWindowHandle();
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String ah:allhandles)
		{
			String title = driver.switchTo().window(ah).getTitle();
			System.out.println(title);
			
		
				
			if(title.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"))
			break;
		
			if(driver.findElement(By.name("url")).equals(mobiles))
			{
			System.out.println("control is in mobiles tab");
			}
		}
			
			
		}
		
		

		
	}


