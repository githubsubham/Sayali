package org.automation.generic_utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
    public void accessApplication(WebDriver driver, String url) {
    	driver.get(url);
    }
    public void maximize(WebDriver driver) {
    	driver.manage().window().maximize();
    }
    public void waitForImplicitly(WebDriver driver) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public WebElement findElement(WebDriver driver, By locator) {
    	return driver.findElement(locator);
    }
    
    public void waitForExplicityWait(WebDriver driver,By locator) {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public void waitForExplicityWait(WebElement element,WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
