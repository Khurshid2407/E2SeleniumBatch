package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sDriver;  // only for listeners
	public SeleniumUtility sUtil=new SeleniumUtility();
	public PropertiesUtility pUtil=new PropertiesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnection()
	{
		System.out.println("DB connection created");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome")String BROWSER) throws Exception
	{
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		
		sDriver = driver;  // this sDriver is initialized and will be used in Listeners
		sUtil.implicitwait(driver, 10);
		sUtil.maximizeWindow(driver);
		String URL=pUtil.getDataFromPropertiesFile("Url");
		sUtil.navigateToUrl(driver,URL);
		System.out.println("Browser launched successfully");
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginOperation() throws Exception
	{
		String UN=pUtil.getDataFromPropertiesFile("UserName");
		String PWD=pUtil.getDataFromPropertiesFile("Password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("Login done successfully");
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutOperation()
	{
		HomePage hp=new HomePage(driver);
		hp.signoutOperation(driver);
		System.out.println("sign out done successfully");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDBConnection()
	{
		System.out.println("DB connection closed");
	}
}
