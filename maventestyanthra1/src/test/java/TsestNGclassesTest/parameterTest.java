package TsestNGclassesTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterTest {
	
	@Parameters("Raj")
	@Test
	public void passparameter(String browser)
	{
		//ChromeDriver driver = null;
		if(browser.equals("Chrome")) 
				{
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			//System.out.println(browser);
			
				}
		//if(browser.equals("firefox"))
		// {
		//	WebDriverManager.firefoxdriver().setup();
		//	driver = new FirefoxDriver();
		//}
		
		else {
			System.out.println("Invalid respone");
		}
		driver.get("https://facebook.com");
			}
}
