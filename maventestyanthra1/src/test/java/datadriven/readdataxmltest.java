package datadriven;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class readdataxmltest {
	@Test
	public void readdatafromTest(XmlTest xml)
	{
		String value = xml.getParameter("url");
		String value1=xml.getParameter("un");
		String Value2=xml.getParameter("pwd");
		System.out.println(value);
		System.out.println(value1);
		System.out.println(Value2);
	}

}
