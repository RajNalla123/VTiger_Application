package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepageclass {
	public Homepageclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement orgButton;
	
	@FindBy(linkText = "Contacts")
	private WebElement conButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminimg;
	
	@FindBy(linkText = "Sign Out")
	private WebElement SOButton;

	public WebElement getOrgButton() {
		return orgButton;
	}

	public WebElement getConButton() {
		return conButton;
	}

	public WebElement getAdminimg() {
		return adminimg;
	}

	public WebElement getSOButton() {
		return SOButton;
	}
	
	public void signout(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(adminimg).perform();
		SOButton.click();
	}

	public void orgClick() {
		orgButton.click();
	}
}
