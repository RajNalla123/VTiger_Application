package TsestNGclassesTest;

import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class sampleTest extends AnnotationsTest
	
{
		
		@Test(groups = "smoke")
		public void smoke() {
		System.out.println("Test execution1");
		}
	
		@Test(groups = "Regression")
		public void Regression() {
		System.out.println("Test execution2");
		}
	
		@Test(groups = "integression")
		public void integression() {
		System.out.println("Test execution3");
		}
	
		@Test
		public void raj() {
		System.out.println("Test execution4");
		

}
}
