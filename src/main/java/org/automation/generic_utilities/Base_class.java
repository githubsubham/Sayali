package org.automation.generic_utilities;

import java.io.IOException;

import org.automation.generic_utilities.Java_Utility;
import org.automation.generic_utilities.WebDriver_Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_class {
	public WebDriver_Utility webUtil = new WebDriver_Utility();
	public Java_Utility javaUtil = new Java_Utility();
	public WebDriver driver;

	@BeforeClass
	public void config_BC() throws IOException {
		driver = new ChromeDriver();
		webUtil.maximize(driver);
		webUtil.waitForImplicitly(driver);
		webUtil.accessApplication(driver, javaUtil.getdata("Base_URL"));
	}
//	@BeforeMethod
//	public void config_BM() throws IOException {
//		webUtil.accessApplication(driver, javaUtil.getdata("Base_URL"));
//	}
	@AfterClass
	public void config_AM() {
		driver.quit();
	}
}