package TsestNGclassesTest;

import org.testng.annotations.Test;

public class tagsTest {
	@Test(priority = 2)
	public void demo() {
	System.out.println("Test execution");
	}
	
	@Test(priority = 1 )
	public void demo1() {
	System.out.println("Test execution1");
	}

	@Test(enabled = true)
	public void test1 (){
	System.out.println("Test execution3");
	}
	
	@Test(invocationCount = 3)
	public void test2 (){
	System.out.println("Test execution4");
	}
	
	@Test(alwaysRun = true)
	public void test3 (){
	System.out.println("Test execution5");
	}
}
