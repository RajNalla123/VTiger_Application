package datadriven;

import org.testng.annotations.Test;

public class ReadDataFromCMDTest {
	@Test
	public void readDataTest()
	{
		String URL = System.getProperty("url");
		String UN = System.getProperty("un");
		System.out.println("----->"+URL);
		System.out.println("----->"+UN);
		
	}

}
