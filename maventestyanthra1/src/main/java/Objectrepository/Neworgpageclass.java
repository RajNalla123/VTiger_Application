package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Neworgpageclass {
	
	@FindBy(name="accountname")
	private WebElement orgNameTF;
	
	@FindBy(name="button")
	private WebElement saveButton;
	
	@FindBy(name = "industry")
	private WebElement indtype;
	
	public Neworgpageclass(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
}

	public WebElement getOrgNameTF() {
		return orgNameTF;
	}
	public WebElement getsaveButton() {
		return saveButton;
	}
	
	
	
	public void orgTF(String orgText) {
		orgNameTF.sendKeys(orgText);
	}
	
	public void sButton() {
		saveButton.click();
		
	}
	
	public void Industrytype() {
		Select s=new Select(indtype);
		s.selectByIndex(3);
	}

	public String getIndtype() {
		return indtype.getText();
	}

		
		
	
		
		
	}

