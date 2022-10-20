package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class datadrivenpropertiestest {
	public static void main(String[] args) throws Throwable {
		//convert property file into java object
		FileInputStream fis=new FileInputStream("./commondata.properties"); 
		Properties p=new Properties();
		//load java object
		p.load(fis);
		//read the data
		String value = p.getProperty("url");
		//string value = p.getProperty("username");
		System.out.println(value);
		
		
		
	}
	

}
