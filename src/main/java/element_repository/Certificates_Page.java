package element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Certificates_Page {

	@FindBy(xpath = "//div[@class='Cards_cardDetails__WsZ-E'and contains(.,'School leaving certificate')]")
	public WebElement schoolLivingCertificate;
	
	@FindBy(xpath = "//div[.='Generate']")
	public WebElement slcGenerate;
	
	public Certificates_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSchoolLivingCertificate() {
		return schoolLivingCertificate;
	}

	public WebElement getSlcGenerate() {
		return slcGenerate;
	}

	public void setSlcGenerate(WebElement slcGenerate) {
		this.slcGenerate = slcGenerate;
	}
	
	
	public void certificate() throws InterruptedException {
		getSchoolLivingCertificate().click();
		getSlcGenerate().click();
		Thread.sleep(2000);
		getSlcGenerate().click();
	}

}
