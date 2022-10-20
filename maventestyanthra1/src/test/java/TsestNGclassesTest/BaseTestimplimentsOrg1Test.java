package TsestNGclassesTest;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericutility.BaseclassTest;
import com.genericutility.ExcelfileUtility;
import com.genericutility.JavaUtility;
import Objectrepository.Homepageclass;
import Objectrepository.Neworgpageclass;
import Objectrepository.Orgpageclass;

@Listeners
public class BaseTestimplimentsOrg1Test extends BaseclassTest
{
	
	@Test(groups = {"smoke","Regression","integration"})
	public void Createorg() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		ExcelfileUtility efu=new ExcelfileUtility();
		String refvar = efu.readdatafromExcelfile("Sheet1", 3, 1)+JavaUtility.generateRanNum();
		
		
		
		Homepageclass hpc=new Homepageclass(driver);
		hpc.orgClick();
		
		Orgpageclass opc=new Orgpageclass(driver);
		opc.getCreOrg().click();
		
		Neworgpageclass nop=new Neworgpageclass(driver);
		nop.orgTF(refvar);
		nop.sButton();
		Thread.sleep(3000);

		
		
	}
}



