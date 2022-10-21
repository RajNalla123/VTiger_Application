package TsestNGclassesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsclassTest {
	@Test
	public void chromeopt()
	{
		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://amazon.in");
		System.out.println(driver.getTitle());

	}

}
