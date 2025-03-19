package com.baseImplementations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ScrollingHelper;
import com.basePage.BasePage;

public class SubscriptionPage extends BasePage{

    WebDriver webDriver;
	public SubscriptionPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver , this);
	}
	
	@FindBy(xpath = "//footer[@id='footer']")
	WebElement footer;	
	public void scrollToFooter() throws InterruptedException {
		
		ScrollingHelper.scrollToElement(webDriver, footer);
	}
	

	@FindBy(xpath = "//input[@id='susbscribe_email']")
	WebElement emailWebElement1;
	public void setEmail(String email) {
		enterText(emailWebElement1, email);
	}
	
	@FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
	WebElement arrowWebElement;
	
	public void clickArrow() {
		
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", arrowWebElement);
		
	}
}

