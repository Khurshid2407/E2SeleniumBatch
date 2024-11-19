package TcReport;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewOrganisationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganisationsPage;
import genericUtility.BaseClass;

public class TC_08 extends BaseClass{
	
	@Test
	public void ORG_04() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganisationHome();
		OrganisationsPage op=new OrganisationsPage(driver);
		op.clickOnCreateNewOrganisationsIcon();
		CreatingNewOrganisationPage cop=new CreatingNewOrganisationPage(driver);
		String orgName=eUtil.getDataFromExcel("Organizations", 11, 1);
		String webSite=eUtil.getDataFromExcel("Organizations", 11, 2);
		String employees=eUtil.getDataFromExcel("Organizations", 11, 3);
		String phn=eUtil.getDataFromExcel("Organizations", 11, 4);
		String otherPhn=eUtil.getDataFromExcel("Organizations", 11, 5);
		String email=eUtil.getDataFromExcel("Organizations", 11, 6);
		String billingAddress=eUtil.getDataFromExcel("Organizations", 11, 7);
		String billingCity=eUtil.getDataFromExcel("Organizations", 11, 8);
		String billingState=eUtil.getDataFromExcel("Organizations", 11, 9);
		cop.createNewOrganisation(orgName, webSite, employees, phn, otherPhn, email, billingAddress, billingCity, billingState);
		
		
	}

}
