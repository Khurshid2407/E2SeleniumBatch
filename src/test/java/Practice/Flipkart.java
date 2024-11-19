package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']")); 
		element.sendKeys("i phone 14");
		driver.navigate().refresh();
	    element.sendKeys("i phone 14");

	}

}
