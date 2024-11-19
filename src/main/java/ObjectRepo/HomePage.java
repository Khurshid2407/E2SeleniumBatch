package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement LeadsMenu;
	
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Organizations']")
	private WebElement OrganisationsHome;
	
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Contacts']")
	private WebElement ContactsHome;
	
	@FindBy(xpath="//td[@class='small']/img")
	private WebElement AccountIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement LogoutIcon;
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getLeadsMenu() {
		return LeadsMenu;
	}

	public WebElement getOrganisationsHome() {
		return OrganisationsHome;
	}

	public WebElement getContactsHome() {
		return ContactsHome;
	}

	public WebElement getAccountIcon() {
		return AccountIcon;
	}

	public WebElement getLogoutIcon() {
		return LogoutIcon;
	}
	
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	
	public void clickOnOrganisationHome()
	{
		getOrganisationsHome().click();
	}
	
	public void clickOnContactsHome()
	{
		getContactsHome().click();
	}
	
	public void signoutOperation(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(getAccountIcon()).perform();
		getLogoutIcon().click();
	}
	
	

}
