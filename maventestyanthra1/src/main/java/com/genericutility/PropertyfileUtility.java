package com.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyfileUtility {

	public String readDatafrompropertyFile(String key) throws Throwable
	{
	FileInputStream fis=new FileInputStream("./CommonData/commonD.properties");
	Properties p=new Properties();
	p.load(fis);
	String value=p.getProperty(key);
	return value;
	

}
}
