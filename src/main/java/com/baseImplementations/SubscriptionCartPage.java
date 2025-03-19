package com.baseImplementations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ScrollingHelper;
import com.basePage.BasePage;

public class SubscriptionCartPage extends BasePage {
	
	
	WebDriver webDriver;
	public SubscriptionCartPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver , this);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement cartWebElement;
	public void clickCart() {
		onClick(cartWebElement);
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
