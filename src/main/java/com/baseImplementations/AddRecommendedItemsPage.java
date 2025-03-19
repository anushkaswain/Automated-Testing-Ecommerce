package com.baseImplementations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ScrollingHelper;
import com.basePage.BasePage;



public class AddRecommendedItemsPage extends BasePage{

		WebDriver webDriver;
		public AddRecommendedItemsPage(WebDriver webDriver) {
			super(webDriver);
			this.webDriver = webDriver;
			PageFactory.initElements(webDriver , this);
		}
		
		
		@FindBy(xpath = "//h2[normalize-space()='recommended items']")
		WebElement recommendWebElement;	
		public void scrollToRecommended() throws InterruptedException {
			
			ScrollingHelper.scrollToElement(webDriver, recommendWebElement);
			Thread.sleep(1500);
		}
		
		@FindBy(xpath = "//div[@class='item active']//div[1]//div[1]//div[1]//div[1]//a[1]")
		WebElement addtocartWebElement;
		public void clickAddToCart() {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", addtocartWebElement);

			
		}
		
		@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
		WebElement continueWebElement;
		public void clickContinue() {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", continueWebElement);
			
		}
	}


