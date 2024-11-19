package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility {
	
	/**
	 * This Method is use to provide time
	 * @param driver
	 * @param maxTime
	 */
	public void implicitwait(WebDriver driver , int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	/**
	 * This Method is use to select drop down by using index value
	 * @param dropdownElement
	 * @param index
	 */
	public void selectOptionByValue(WebElement dropdownElement , int index)
	{
		Select sel=new Select(dropdownElement);
		sel.selectByIndex(index);
	}
	
	/**
	 * This Method is use to select drop down by using string value
	 * @param dropdownElement
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownElement , String value)
	{
		Select sel=new Select(dropdownElement);
		sel.selectByValue(value);
	}
	
	/**
	 * This Method is use to select drop down by using visible text
	 * @param dropdownElement
	 * @param text
	 */
	public void selectOptionByVisibleText(WebElement dropdownElement , String text)
	{
		Select sel=new Select(dropdownElement);
		sel.selectByValue(text);
	}
	
	/**
	 * This Method is use to accept the alert 
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This Method is use to dismiss the alert
	 * @param driver
	 */
	public void cancleAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public String getAlertMessage(WebDriver driver)
	{
		String value=driver.switchTo().alert().getText();
		return value;
	}
    
	/**
	 * 
	 * @param driver
	 * @param value
	 */
	public void sendAlertMessage(WebDriver driver , String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void navigateToUrl(WebDriver driver,String url)
	{
		driver.navigate().to(url);
	}
	
	/**
	 * 
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException 
	 * @throws Exception
	 */
	
	public String captureScreenshot(WebDriver driver , String screenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+screenshotName+".png");
		Files.copy(src,dest);
		return dest.getAbsolutePath();
	}
	

}
