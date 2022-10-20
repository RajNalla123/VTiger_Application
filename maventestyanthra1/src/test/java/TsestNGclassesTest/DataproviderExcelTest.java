package TsestNGclassesTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.genericutility.ExcelfileUtility;

public class DataproviderExcelTest {
	
	@Test(dataProvider = "excedata")
	public void getCred(String username,String password)
	{
		System.out.println(username+"---"+password); 
	}
	
	@DataProvider
	public Object[][] excedata() throws EncryptedDocumentException, InvalidFormatException, IOException {
		Object arr[][]=new Object[5][2];
		
		ExcelfileUtility efu=new ExcelfileUtility();
		
		for(int i=0;i<=efu.getlastRowcount("sheet2");i++)
		//for(int i=0;i<=4;i++)
		{
			arr[i][0]=efu.readdatafromExcelfile("sheet2", i, 0);
			arr[i][1]=efu.readdatafromExcelfile("sheet2", i, 1);
			
		}
		return arr;
	}
	

}
