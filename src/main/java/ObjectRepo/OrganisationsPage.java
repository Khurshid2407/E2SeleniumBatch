package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationsPage {
		
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createNewOrganisationIcon;
	
	public OrganisationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getCreateNewOrganisationIcon() {
		return createNewOrganisationIcon;
	}
	
	/**
	 * This is a business library to click on Create New Organization Icon
	 */
	
	public void clickOnCreateNewOrganisationsIcon()
	{
		getCreateNewOrganisationIcon().click();
	}

}
