//package com.TestCases;
//
//import org.testng.annotations.Test;
//
//
//import static org.testng.Assert.assertEquals;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//
//
//import com.Base.TestBase;
//
//import com.Pages.LoginPage;
//
//
//public class AdminConfigTCs extends TestBase {
//	String NeworgName = "Organization1";
//	String NewEmail = "newemailorg1@outlook.com";
//	String NewCountry = "Tonga";
//	String NewCountryValue = "TO";
//	String unitName = "SixthUnit";
//
//	LoginPage loginObj;
//
//
//	@BeforeTest
//	public void beforeMethod() throws InterruptedException {
//
//		loginObj = new LoginPage(driver);
//		dashboardObj = new DashboardPage(driver);
//		generalInfObj = new GeneralinfoPage(driver);
//		structureObj = new StructurePage(driver);
//
//	}
//
//	@Test(priority = 1)
//	public void verifyUserEditOrganizationDetailsuccessfully() throws InterruptedException {
//		loginObj.setUsernamevalue("Admin");
//		loginObj.setPassowrdvalue("admin123");
//		loginObj.clickLogin();
//		dashboardObj.clickAdminTab();
//		dashboardObj.viewOrganizationMenu();
//		dashboardObj.chooseGeneralInfoOption();
//		generalInfObj.clickEdit();
//		// Thread.sleep(1000);
//		generalInfObj.editOrgnamevalue(NeworgName);
//		generalInfObj.editOrgemailvalue(NewEmail);
//		generalInfObj.chooseCountryvalue(NewCountry);
//		generalInfObj.clickSave();
////		String actualsuccessText = generalInfObj.verifyDataSavedSuccessfullyMsg();
////		String expectedsuccessText = "\r\n"
////				+ "            Successfully Saved        ";
//		String actualName = generalInfObj.verifyNameSavedSuccessfully();
//		String actualEmail = generalInfObj.verifymailSavedSuccessfully();
//		String actualCountry = generalInfObj.verifyCountrySavedSuccessfully();
//		Thread.sleep(1000);
//		Assert.assertEquals(actualName, NeworgName);
//		Assert.assertEquals(actualEmail, NewEmail);
//		Assert.assertEquals(actualCountry, NewCountryValue);
//
//
//	}
//
//	@Test(priority = 2)
//	public void verifyAdminAddUnitsuccessfully() throws InterruptedException {
//
//		dashboardObj.clickAdminTab();
//		dashboardObj.viewOrganizationMenu();
//
//		dashboardObj.chooseStructureOption();
//		structureObj.clickEdit();
//		structureObj.clickAddAdminstration();
//		structureObj.setUnitIDevalue("6");
//		structureObj.setUnitNamevalue(unitName);
//		structureObj.clickSave();
//
//
//		String actualText = structureObj.verifyLastAddedUnitSuccessfully();
//		Assert.assertTrue(actualText.contains(unitName));
//
//
//	}
//	@AfterTest
//	public void afterMethod() {
//		CloseBrowser();
//	}
//
//}
