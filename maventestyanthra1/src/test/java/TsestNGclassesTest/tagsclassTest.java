package TsestNGclassesTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tagsclassTest {
	
	@Test
	public void demo() {
	System.out.println("Test execution");
	}
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("@BeforeSuite");
	}
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("@AfterSuite");
	}
	
	@BeforeClass()
	public void bc() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("@AfterClass");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("@AfterMethod");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void at() {
		System.out.println("@AfterTest");
	}

}



