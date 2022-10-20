package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Organisationinformationclass {
	
	
	@FindBy(className = "dvHeaderText")
	private WebElement hText;
	
	
	public Organisationinformationclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement gethText() {
		return hText;
	}



	public String headerT() {
		return hText.getText();
	}
}
 

