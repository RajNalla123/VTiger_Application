package com.rmgyantra_ExtentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentreportTest {
	
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	
	@Test
	public void createreport() throws IOException
	{
		reporter=new ExtentSparkReporter("./ExtentReports/SDETREPORT1.html");
		
		reporter.config().setDocumentTitle("whatsapp");
		reporter.config().setTheme(Theme.STANDARD);
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("Browser","Chrome");
		reports.setSystemInfo("Build","1.2.3");
		reports.setSystemInfo("Reporter name","Raj");
		reports.setSystemInfo("Env","QA");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		test=reports.createTest("NRR2");
		
		//reports.flush();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=("./screenshot.NRR2.png");
		File dest=new File(path);
		Files.copy(src, dest);
		
		test.addScreenCaptureFromPath(path);
		
		Assert.assertEquals(true, true);
		
		reports.flush();
		
	}
	

}
