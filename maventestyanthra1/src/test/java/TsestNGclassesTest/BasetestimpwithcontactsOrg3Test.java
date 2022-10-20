package TsestNGclassesTest;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericutility.BaseclassTest;
import com.genericutility.ExcelfileUtility;
import com.genericutility.JavaUtility;
import com.genericutility.Listenersclassutility;
import com.genericutility.PropertyfileUtility;
import com.genericutility.Webdriverutility;

import Objectrepository.Contactspageclass;
import Objectrepository.Homepageclass;
import Objectrepository.Loginpageclass;
import Objectrepository.Neworgpageclass;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners
public class BasetestimpwithcontactsOrg3Test extends BaseclassTest
{
@Test(groups = {"smoke","Regression","integration"})
public void OrgwithConType() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
		
				
		ExcelfileUtility efu=new ExcelfileUtility();
		String refvar = efu.readdatafromExcelfile("Sheet1", 3, 1)+JavaUtility.generateRanNum();
		String lName1 = efu.readdatafromExcelfile("Sheet1", 3, 0);
		String orgName1 = efu.readdatafromExcelfile("Sheet1", 2, 1);
		
		
		Contactspageclass cpc=new Contactspageclass(driver);
		cpc.contactbutton();
		cpc.createcontact();
		//cpc.firstNameType(lName1);
		cpc.lastName(lName1);
		cpc.orgClick();
		
		Webdriverutility wdu=new Webdriverutility(driver);
		String pw = wdu.getparentHandle();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
     	Thread.sleep(3000);
		
		wdu.allHandles(pw);
		Set<String> allwindow = driver.getWindowHandles();
	
		for(String totalwindows:allwindow)
	{
		driver.switchTo().window(totalwindows);
			System.out.println(totalwindows); 
	}
		
		cpc.searchtext(refvar);
		cpc.searchbutton();
		cpc.companynameclick();
		driver.switchTo().window(parentwindow);
		
		Thread.sleep(3000);
		Neworgpageclass nop=new Neworgpageclass(driver);
		nop.sButton();
		
			
				
}
}
			


