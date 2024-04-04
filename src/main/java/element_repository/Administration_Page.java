package element_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Administration_Page {

	@FindBy(xpath = "//div[text()='Administration']")
	public  WebElement administration;
	
	@FindBy(linkText = "Certificates")
	public WebElement certificates;
	
	@FindBy(linkText = "ID Card")
	public WebElement idcard;
	
	@FindBy(linkText = "Admission")
	public WebElement admission;
	
	@FindBy(linkText = "Website Builder")
	public WebElement websitebuilder;
	
	public Administration_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCertificates() {
		return certificates;
	}

	public WebElement getIdcard() {
		return idcard;
	}

	public WebElement getAdmission() {
		return admission;
	}

	public WebElement getWebsitebuilder() {
		return websitebuilder;
	}
	
	public void clickOnAdmin() {
		administration.click();
		certificates.click();
		
		
	}

}
