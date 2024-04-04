package element_repository;

import org.automation.generic_utilities.WebDriver_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Enter_details_document_Page {
	@FindBy(xpath = "//input[@placeholder='Remarks']")
	public WebElement remarksTextField;
	
	@FindBy(xpath = "//div[text()='Generate']")
	public WebElement generateButton;
	
	@FindBy(xpath = "//h4[text()='Document generated successfully']")
	public WebElement confirmMsg;
	
	@FindBy(xpath = "//div[text()='Download']")
	public WebElement downloadButton;
	
	public Enter_details_document_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails$Validate(WebDriver driver,String expMsg,WebDriver_Utility webutility) throws InterruptedException {
		Thread.sleep(2500);
		remarksTextField.sendKeys("Update");
		generateButton.click();
		Assert.assertEquals(confirmMsg.getText(), expMsg);
		Reporter.log("Document generated successfully",true);
		
		downloadButton.click();
	}
	
	
}
