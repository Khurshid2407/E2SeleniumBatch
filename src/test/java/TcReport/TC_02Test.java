package TcReport;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_02Test extends BaseClass{
	
	@Test
	public void LE_02() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage leP=new LeadsPage(driver);
		leP.clickOnCreateNewLeadIcon();
		CreatingNewLeadPage clp=new CreatingNewLeadPage(driver);
		String fName=eUtil.getDataFromExcel("Leads", 5, 1);
		String lName=eUtil.getDataFromExcel("Leads", 5, 2);
		String Company=eUtil.getDataFromExcel("Leads", 5, 3);
		String title=eUtil.getDataFromExcel("Leads", 5, 4);
		String phone=eUtil.getDataFromExcel("Leads", 5, 5);
		String mobile=eUtil.getDataFromExcel("Leads", 5, 6);
		String email=eUtil.getDataFromExcel("Leads", 5, 7);
		String noOfEmployees=eUtil.getDataFromExcel("Leads", 5, 8);
		String street=eUtil.getDataFromExcel("Leads", 5, 9);
		String poBox=eUtil.getDataFromExcel("Leads", 5, 10);
		String postalCode=eUtil.getDataFromExcel("Leads", 5, 11);
		String city=eUtil.getDataFromExcel("Leads", 5, 12);
		String country=eUtil.getDataFromExcel("Leads", 5, 13);
		String state=eUtil.getDataFromExcel("Leads", 5, 14);
		clp.createNewLead(fName, lName, Company, title, mobile, phone, email, noOfEmployees, street, poBox, postalCode, city, country, state);
		
	}

}
