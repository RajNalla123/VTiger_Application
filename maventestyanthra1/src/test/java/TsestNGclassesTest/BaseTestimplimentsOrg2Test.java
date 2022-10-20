package TsestNGclassesTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericutility.BaseclassTest;
import com.genericutility.ExcelfileUtility;
import com.genericutility.JavaUtility;
import com.genericutility.Listenersclassutility;

import Objectrepository.Homepageclass;
import Objectrepository.Neworgpageclass;
import Objectrepository.Organisationinformationclass;
import Objectrepository.Orgpageclass;

@Listeners
public class BaseTestimplimentsOrg2Test extends BaseclassTest
{
	
	@Test(groups = {"smoke","Regression","integration"})
	public void OrgwithIndustype() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		
		
		ExcelfileUtility efu=new ExcelfileUtility();
		String refvar = efu.readdatafromExcelfile("sheet1", 3, 1)+JavaUtility.generateRanNum();
		String refvar1 = efu.readdatafromExcelfile("sheet1", 4, 0);
				
		
		
		Homepageclass hpc=new Homepageclass(driver);
		hpc.orgClick();
		
		Orgpageclass opc=new Orgpageclass(driver);
		opc.getCreOrg().click();
		
		Neworgpageclass nop=new Neworgpageclass(driver);
		nop.orgTF(refvar);
		nop.sButton();
		Thread.sleep(3000);
		
		Organisationinformationclass oic=new Organisationinformationclass(driver);

		
		if(oic.headerT().contains(refvar)) {
			System.out.println("validation successfully");
		}
		else
		{
			System.out.println("validation unsuccessful");
		}
		
		//Assert.assertEquals(refvar, oic.headerT());
		
		
		
		//hpc.signout(driver);
		//driver.close();
		
	}

}
