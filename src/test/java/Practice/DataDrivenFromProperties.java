package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class DataDrivenFromProperties {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		PropertiesUtility p=new PropertiesUtility();
		String Url=p.getDataFromPropertiesFile("Url");
		String Un=p.getDataFromPropertiesFile("UserName");
		System.out.println(Url);
		System.out.println(Un);
		driver.get(Url);

	}

}
