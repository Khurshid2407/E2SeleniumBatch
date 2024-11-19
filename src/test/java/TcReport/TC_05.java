package TcReport;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewOrganisationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganisationsPage;
import genericUtility.BaseClass;

public class TC_05 extends BaseClass{
	
	@Test(groups = {"Smoke","Regression"})
	public void ORG_01() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganisationHome();
		OrganisationsPage op=new OrganisationsPage(driver);
		op.clickOnCreateNewOrganisationsIcon();
		CreatingNewOrganisationPage cop=new CreatingNewOrganisationPage(driver);
		String orgName=eUtil.getDataFromExcel("Organizations", 2, 1);
		String webSite=eUtil.getDataFromExcel("Organizations", 2, 2);
		String employees=eUtil.getDataFromExcel("Organizations", 2, 3);
		cop.createNewOrganisation(orgName, webSite, employees);
		
		
	}

}
