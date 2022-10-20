package TsestNGclassesTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ListenersclassTest implements ITestListener			
{

	//private static final String Amazon = null;

	
	public void onFinish(ITestContext result) {
		
		
	}

	
	public void onStart(ITestContext result) {
		
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getThrowable());
		TakesScreenshot ts = ((TakesScreenshot) AmazonTest.driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+result.getMethod().getMethodName()+".PNG");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
