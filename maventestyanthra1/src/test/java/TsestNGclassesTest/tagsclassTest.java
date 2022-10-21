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
	
	@Test(groups = "smoke")
	public void demo() {
	System.out.println("Test execution");
	}
	
	@Test(groups = "integration")
	public void demo1() {
	System.out.println("Test executio1n");
	}
	
	@BeforeSuite(groups = {"smoke", "integration"})
	public void beforesuit()
	{
		System.out.println("@BeforeSuite");
	}
	
	@AfterSuite(groups = {"smoke", "integration"})
	public void aftersuit() {
		System.out.println("@AfterSuite");
	}
	
	@BeforeClass(groups = {"smoke", "integration"})
	public void bc() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass(groups = {"smoke", "integration"})
	public void ac() {
		System.out.println("@AfterClass");
	}
	
	@BeforeMethod(groups = {"smoke", "integration"})
	public void bm() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod(groups = {"smoke", "integration"})
	public void am() {
		System.out.println("@AfterMethod");
	}
	
	@BeforeTest(groups = {"smoke", "integration"})
	public void bt() {
		System.out.println("@BeforeTest");
	}
	
	@AfterTest(groups = {"smoke", "integration"})
	public void at() {
		System.out.println("@AfterTest");
	}

}



