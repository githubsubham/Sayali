package element_repository;

import java.io.IOException;
import java.util.List;

import org.automation.generic_utilities.Java_Utility;
import org.automation.generic_utilities.WebDriver_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Login_Page {
	@FindBy(id = "user-input")
	public WebElement mobileNumber;
	
	@FindBy(id = "send-otp-btn-id")
	public WebElement nextBtn;
	
	@FindBy(id = "submit-otp-btn-id")
	public WebElement submitOTPButton;
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginApplication(WebDriver driver,Java_Utility utility,WebDriver_Utility webUtility) throws IOException {
		mobileNumber.sendKeys(utility.getdata("MobileNumber"));
		webUtility.waitForExplicityWait(driver, By.id("send-otp-btn-id"));
		nextBtn.click();
		List<WebElement> allOtp=driver.findElements(By.xpath("//input[@class='otp-digit-input']"));
		String otp=utility.getdata("OTP");
		for(int i=0;i<allOtp.size();i++) {
			allOtp.get(i).sendKeys(Character.toString(otp.charAt(i)));
		}
		submitOTPButton.click();
		
		Reporter.log("Successfully Login",true);
	}

}
