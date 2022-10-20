package com.genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Listenersclassutility implements ITestListener 
{

	
	public void onFinish(ITestContext result) {
		
		
	}

	
	public void onStart(ITestContext result) {
		
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot sh = (TakesScreenshot)BaseclassTest.sdriver;
		File src = sh.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/\"+result.getMethod().getMethodName()+\".PNG");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}


	public void onTestSkipped(ITestResult result) {
				
	}


	public void onTestStart(ITestResult result) {
				
	}

	
	public void onTestSuccess(ITestResult result) {
		
		
	}
	
	


}
