package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orgpageclass {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement creOrg;
	
	public Orgpageclass(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public WebElement getCreOrg() {
		return creOrg;
	}
	

	

}
