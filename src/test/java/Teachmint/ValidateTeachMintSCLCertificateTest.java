package Teachmint;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.automation.generic_utilities.Base_class;
import org.testng.annotations.Test;

import element_repository.Administration_Page;
import element_repository.Certificates_Page;
import element_repository.Enter_details_document_Page;
import element_repository.Login_Page;
import element_repository.SelectAccountPage;

public class ValidateTeachMintSCLCertificateTest extends Base_class {
	@Test
	public void loginTest() throws IOException, InterruptedException, AWTException {
		Login_Page lp=new Login_Page(driver);
		lp.loginApplication(driver, javaUtil, webUtil);
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void selectAccountTest() throws InterruptedException, AWTException {
		SelectAccountPage sel=new SelectAccountPage(driver);
		sel.selectAccount(driver, webUtil);
		Thread.sleep(2000);
		javaUtil.refreshPage();
	}
	@Test(dependsOnMethods = "selectAccountTest")
	public void adminstTest() {
		Administration_Page ap=new Administration_Page(driver);
		ap.clickOnAdmin();
	}
	@Test(dependsOnMethods = "adminstTest")
	public void certificateTest() throws InterruptedException {
		Certificates_Page cp=new Certificates_Page(driver);
		cp.certificate();
	}
	@Test(dependsOnMethods = "certificateTest")
	public void enterDetails$ValidateTest() throws InterruptedException {
		
		Enter_details_document_Page ed=new Enter_details_document_Page(driver);
		String expMsg="Document generated successfully";
		
		ed.enterDetails$Validate(driver, expMsg, webUtil);
	}
	
	
}
