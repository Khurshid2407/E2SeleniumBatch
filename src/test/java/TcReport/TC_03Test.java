package TcReport;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_03Test extends BaseClass{
	
	@Test(groups = "Smoke")
	public void LE_03() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage leP=new LeadsPage(driver);
		leP.clickOnCreateNewLeadIcon();
		CreatingNewLeadPage clp=new CreatingNewLeadPage(driver);
		String fName=eUtil.getDataFromExcel("Leads", 8, 1);
		String lName=eUtil.getDataFromExcel("Leads", 8, 2);
		String Company=eUtil.getDataFromExcel("Leads", 8, 3);
		String title=eUtil.getDataFromExcel("Leads", 8, 4);
		String phone=eUtil.getDataFromExcel("Leads", 8, 5);
		String mobile=eUtil.getDataFromExcel("Leads", 8, 6);
		String email=eUtil.getDataFromExcel("Leads", 8, 7);
		String noOfEmployees=eUtil.getDataFromExcel("Leads", 8, 8);
		clp.createNewLead(fName, lName, Company, title, mobile, phone, email, noOfEmployees);
		
		
	}

}
