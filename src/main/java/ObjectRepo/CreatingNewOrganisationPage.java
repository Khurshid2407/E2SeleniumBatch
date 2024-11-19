package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganisationPage {
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organisationName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement website;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement employees;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherPhone;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement billingCity;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billingState;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewOrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getOrganisationName() {
		return organisationName;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getOtherPhone() {
		return otherPhone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * 
	 * @param orgName
	 * @param website
	 * @param employees
	 */
	
	public void createNewOrganisation(String orgName, String website, String employees)
	{
		getOrganisationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getSaveButton().click();
	}
	
	/**
	 * 
	 * @param orgName
	 * @param website
	 * @param employees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 */
	
	public void createNewOrganisation(String orgName, String website, String employees,String phone, 
			String otherPhone, String email)
	{
		getOrganisationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getSaveButton().click();
	}
	
	/**
	 * 
	 * @param orgName
	 * @param website
	 * @param billingAddress
	 * @param billingCity
	 * @param billingState
	 */
	
	public void createNewOrganisation(String orgName, String website, String billingAddress, String billingCity, 
			String billingState)
	{
		getOrganisationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getBillingAddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		getSaveButton().click();
	}
	
	/**
	 * 
	 * @param orgName
	 * @param website
	 * @param employees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 * @param billingAddress
	 * @param billingCity
	 * @param billingState
	 */
	
	public void createNewOrganisation(String orgName, String website, String employees,String phone,
			String otherPhone, String email, String billingAddress, String billingCity, String billingState )
	{
		getOrganisationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getBillingAddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		getSaveButton().click();
		
	}
	

}
