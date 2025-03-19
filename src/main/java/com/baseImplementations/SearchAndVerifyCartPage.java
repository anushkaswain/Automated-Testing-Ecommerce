package com.baseImplementations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePage.BasePage;


public class SearchAndVerifyCartPage extends BasePage{
	
		WebDriver webDriver;
		public SearchAndVerifyCartPage(WebDriver webDriver) {
			super(webDriver);
			this.webDriver = webDriver;
			PageFactory.initElements(webDriver , this);
		}
		
		
		@FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]")
		WebElement hoverproductWebElement1;
		@FindBy(xpath = "//a[@data-product-id = '1']")
		WebElement productWebElement1;
		public void clickHoverProduct1() throws InterruptedException {
			
			Actions action = new Actions(webDriver);
			
			action.moveToElement(hoverproductWebElement1)
			.moveToElement(productWebElement1)
			.click()
			.perform();
			
			Thread.sleep(2000);
		}
		
		

		@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
		WebElement continueWebElement;
		public void clickContinue() {
			
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	        js.executeScript("arguments[0].click();", continueWebElement);
			//onClick(continueWebElement);
		}
		
		
		
		@FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]")
		WebElement hoverproductWebElement2;
		@FindBy(xpath = "//a[@data-product-id = '5']")
		WebElement productWebElement2;
		public void clickHoverProduct2() throws InterruptedException {
			
			Actions action = new Actions(webDriver);
			
			action.moveToElement(hoverproductWebElement2)
			.moveToElement(productWebElement2)
			.click()
			.perform();
			
			Thread.sleep(2000);
		}
		
		
		
		@FindBy(xpath = "//div[4]//div[1]//div[1]//div[2]")
		WebElement hoverproductWebElement3;
		
		
		@FindBy(xpath = "//a[@data-product-id = '6']")
		WebElement productWebElement3;
		public void clickHoverProduct3() throws InterruptedException {
			
			Actions action = new Actions(webDriver);
			
			action.moveToElement(hoverproductWebElement3)
			.moveToElement(productWebElement3)
			.click()
			.perform();
			
			Thread.sleep(2000);
		}
		
		
		
		@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
		WebElement cartWebElement;
		public void clickCart() {
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	        js.executeScript("arguments[0].click();", cartWebElement);
			//onClick(cartWebElement);
		}
		
		
		
		@FindBy(xpath = "//tr[@id='product-1']//i[@class='fa fa-times']")
		WebElement deleteWebElement1;
		public void clickDelete1() {
			
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	        js.executeScript("arguments[0].click();", deleteWebElement1);
			//onClick(deleteWebElement1);
		}
		
		
		@FindBy(xpath = "//tr[@id='product-5']//i[@class='fa fa-times']")
		WebElement deleteWebElement2;
		public void clickDelete2() {
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	        js.executeScript("arguments[0].click();", deleteWebElement2);
			//onClick(deleteWebElement2);
		}
		
		@FindBy(xpath = "//tr[@id='product-6']//i[@class='fa fa-times']")
		WebElement deleteWebElement3;
		public void clickDelete3() {
			
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	        js.executeScript("arguments[0].click();", deleteWebElement3);
			//onClick(deleteWebElement3);
		}
		
		
		

	}


