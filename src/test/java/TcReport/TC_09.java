package TcReport;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

@Listeners(genericUtility.ListenersImplimentation.class)
public class TC_09 extends BaseClass{
	
	@Test()
	public void CON_01() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsHome();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		//Assert.fail();
		CreatingNewContactPage ccp=new CreatingNewContactPage(driver);
		String fName=eUtil.getDataFromExcel("Contacts", 2, 1);
		String lName=eUtil.getDataFromExcel("Contacts", 2, 2);
		String title=eUtil.getDataFromExcel("Contacts", 2, 3);
		ccp.createNewContact(fName, lName, title);
		
	}
	@Test
	public void method()
	{
		System.out.println("Method Executed");
	}

}
