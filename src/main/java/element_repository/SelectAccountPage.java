package element_repository;

import org.automation.generic_utilities.WebDriver_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAccountPage {
	@FindBy(xpath = "//div[@class='profile-data-cont']")
	public WebElement selectAccount;
	
	
	public SelectAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectAccount(WebDriver driver,WebDriver_Utility webUtil) {
		selectAccount.click();
		webUtil.waitForExplicityWait(driver, By.xpath("//div[@class='profile-data-cont']"));
	}
}
