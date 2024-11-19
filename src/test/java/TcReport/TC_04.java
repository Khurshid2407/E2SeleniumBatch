package TcReport;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_04 extends BaseClass {
	
	@Test(groups ="Regression")
	public void LE_04() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage leP=new LeadsPage(driver);
		leP.clickOnCreateNewLeadIcon();
		CreatingNewLeadPage clp=new CreatingNewLeadPage(driver);
		String fName=eUtil.getDataFromExcel("Leads", 11, 1);
		String lName=eUtil.getDataFromExcel("Leads", 11, 2);
		String company=eUtil.getDataFromExcel("Leads", 11, 3);
		String street=eUtil.getDataFromExcel("Leads", 11, 4);
		String poBox=eUtil.getDataFromExcel("Leads", 11, 5);
		String postalCode=eUtil.getDataFromExcel("Leads", 11, 6);
		String city=eUtil.getDataFromExcel("Leads", 11, 7);
		String country=eUtil.getDataFromExcel("Leads", 11, 8);
		String state=eUtil.getDataFromExcel("Leads", 11, 9);
		clp.createNewLead(fName, lName, company, street, poBox, postalCode, city, country, state);
		
		
	}

}
