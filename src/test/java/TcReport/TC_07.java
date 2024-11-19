package TcReport;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewOrganisationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganisationsPage;
import genericUtility.BaseClass;

public class TC_07 extends BaseClass{
	
	@Test
	public void ORG_03() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganisationHome();
		OrganisationsPage op=new OrganisationsPage(driver);
		op.clickOnCreateNewOrganisationsIcon();
		CreatingNewOrganisationPage cop=new CreatingNewOrganisationPage(driver);
		String orgName=eUtil.getDataFromExcel("Organizations", 8, 1);
		String webSite=eUtil.getDataFromExcel("Organizations", 8, 2);
		String billingAddress=eUtil.getDataFromExcel("Organizations", 8, 3);
		String billingCity=eUtil.getDataFromExcel("Organizations", 8, 4);
		String billingState=eUtil.getDataFromExcel("Organizations", 8, 5);
		cop.createNewOrganisation(orgName, webSite, billingAddress, billingCity, billingState);
		
		
	}

}
