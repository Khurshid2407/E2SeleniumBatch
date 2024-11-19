package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyName;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement designation;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployees;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement save;
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getDesignation() {
		return designation;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getSave() {
		return save;
	}
	
	/**
	 * 
	 * @param fName
	 * @param lName
	 * @param company
	 */
	
	public void createNewLead(String fName, String lName, String company)
	{
		getFirstName().sendKeys(fName);
		getLastName().sendKeys(lName);
		getCompanyName().sendKeys(company);
		getSave().click();
	}
	
	/**
	 * 
	 * @param fName
	 * @param lName
	 * @param company
	 * @param title
	 * @param mobile
	 * @param phone
	 * @param email
	 * @param noofEmployees
	 * @param street
	 * @param poBox
	 * @param postalCode
	 * @param city
	 * @param country
	 * @param state
	 */
	
	public void createNewLead(String fName, String lName, String company, String designation, String mobile, String phone,
			String email, String noofEmployees, String street, String poBox, String postalCode, String city, 
			String country, String state)
	{
		getFirstName().sendKeys(fName);
		getLastName().sendKeys(lName);
		getCompanyName().sendKeys(company);
		getDesignation().sendKeys(designation);
		getMobile().sendKeys(mobile);
		getPhone().sendKeys(phone);
		getEmail().sendKeys(email);
		getNoOfEmployees().sendKeys(noofEmployees);
		getStreet().sendKeys(street);
		getPoBox().sendKeys(poBox);
		getPostalCode().sendKeys(postalCode);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSave().click();
	}
		
	    /**
	     * 
	     * @param fName
	     * @param lName
	     * @param company
	     * @param designation
	     * @param mobile
	     * @param phone
	     * @param email
	     * @param noOfEmployees
	     */
		public void createNewLead(String fName, String lName, String company, String designation, String mobile, 
				String phone, String email, String noOfEmployees)
		{
			getFirstName().sendKeys(fName);
			getLastName().sendKeys(lName);
			getCompanyName().sendKeys(company);
			getDesignation().sendKeys(designation);
			getMobile().sendKeys(mobile);
			getPhone().sendKeys(phone);
			getEmail().sendKeys(email);
			getNoOfEmployees().sendKeys(noOfEmployees);
		}
		
		/**
		 * 
		 * @param fName
		 * @param lName
		 * @param company
		 * @param street
		 * @param poBox
		 * @param postalCode
		 * @param city
		 * @param country
		 * @param state
		 */
		
		public void createNewLead(String fName, String lName, String company,String street, String poBox, 
				String postalCode, String city, String country, String state)
		{
			getFirstName().sendKeys(fName);
			getLastName().sendKeys(lName);
			getCompanyName().sendKeys(company);
			getStreet().sendKeys(street);
			getPoBox().sendKeys(poBox);
			getPostalCode().sendKeys(postalCode);
			getCity().sendKeys(city);
			getCountry().sendKeys(country);
			getState().sendKeys(state);
		}


}
