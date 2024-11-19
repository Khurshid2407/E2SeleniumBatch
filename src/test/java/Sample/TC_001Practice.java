package Sample;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_001Practice extends BaseClass{
	
	@Test
	public void TC_01() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage leP=new LeadsPage(driver);
		leP.clickOnCreateNewLeadIcon();
		CreatingNewLeadPage clp=new CreatingNewLeadPage(driver);
		String fName=eUtil.getDataFromExcel("Leads", 2, 1);
		String lName=eUtil.getDataFromExcel("Leads", 2, 2);
		String Company=eUtil.getDataFromExcel("Leads", 2, 3);
		clp.createNewLead(fName, lName, Company);
		
	}

}
