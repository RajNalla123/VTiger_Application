package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Contactspageclass {
	public Contactspageclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText = "Contacts")
	private WebElement conButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createcon;
	
	@FindBy(name = "salutationtype")
	private WebElement Mrname;
	
	public void surname() {
	Select s1=new Select(Mrname);
	s1.selectByIndex(1);
	}
	
	@FindBy(name = "firstname")
	private WebElement fname;
	
	@FindBy(name = "lastname")
	private WebElement lname;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement selectorg;
	
	@FindBy(name = "search_text")
	private WebElement searchtxt;
	
	@FindBy(name = "search")
	private WebElement searchbtn;
	
	@FindBy(id = "1")
	private WebElement companynameclk;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement signimg;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signout;

	public WebElement getClickcontact() {
		return conButton;
	}

	public WebElement getCreatecon() {
		return createcon;
	}

	public WebElement getMrname() {
		return Mrname;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getSelectorg() {
		return selectorg;
	}

	public WebElement getSearchtxt() {
		return searchtxt;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	

	public WebElement getCompanynameclk() {
		return companynameclk;
	}

	public WebElement getSignimg() {
		return signimg;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	
	
	public void firstNameType(String value) {
//		wdu.selectByvalue(nameType, value);
//		Select select=new Select(nameType);
//		select.selectByValue(value);
	}
	
	public void contactbutton() {
		conButton.click();
	}
	
	public void createcontact() {
		createcon.click();
	}
	
	public void mistername() {
		Mrname.click();
	}
	
	
		
	
	public void firstName(String fname1) {
		fname.sendKeys(fname1);
	}
	public void lastName(String lname1) {
		lname.sendKeys(lname1);
	}
	public void orgClick() {
		selectorg.click();
	}
	public void searchClick(String value) {
		searchbtn.sendKeys(value);
	}
	public void orgNameClick() {
		companynameclk.click();
	}
	
	public void searchbutton() {
		searchbtn.click();
	}
	public WebElement getConButton() {
		return conButton;
	}
	
	public void searchtext(String value1) {
		searchtxt.sendKeys(value1);
	}
	
	public void companynameclick() {
		companynameclk.click();
	}

	//public void sBtn() {
	//saveButton.click();
	//}
	
	public void signout(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(signimg).perform();
		signout.click();
		
	}
	
	
	

}


