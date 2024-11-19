package TcReport;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewOrganisationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganisationsPage;
import genericUtility.BaseClass;

public class TC_06 extends BaseClass{
	
	@Test
	public void ORG_02() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganisationHome();
		OrganisationsPage op=new OrganisationsPage(driver);
		op.clickOnCreateNewOrganisationsIcon();
		CreatingNewOrganisationPage cop=new CreatingNewOrganisationPage(driver);
		String orgName=eUtil.getDataFromExcel("Organizations", 5, 1);
		String webSite=eUtil.getDataFromExcel("Organizations", 5, 2);
		String employees=eUtil.getDataFromExcel("Organizations", 5, 3);
		String phn=eUtil.getDataFromExcel("Organizations", 5, 4);
		String otherPhn=eUtil.getDataFromExcel("Organizations", 5, 5);
		String email=eUtil.getDataFromExcel("Organizations", 5, 6);
		cop.createNewOrganisation(orgName, webSite, employees, phn, otherPhn, email);
		
		
	}

}
