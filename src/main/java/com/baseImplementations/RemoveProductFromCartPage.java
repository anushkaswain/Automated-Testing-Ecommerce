package com.baseImplementations;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utility.ScrollingHelper;
import com.basePage.BasePage;


public class RemoveProductFromCartPage extends BasePage{

	WebDriver webDriver;
	WebDriverWait wait;
	 JavascriptExecutor js;
	
	public RemoveProductFromCartPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		this.wait= new WebDriverWait(webDriver, Duration.ofSeconds(10));
		this.js= (JavascriptExecutor) webdriver;
		
		PageFactory.initElements(webDriver , this);
	}
	

	@FindBy(xpath = "//a[@href='/products']")
	WebElement productsWebElement;
	public void clickProducts() {
		onClick(productsWebElement);
	}
	
	
	@FindBy(xpath = "//footer[@id='footer']")
	WebElement footer;	
	public void scrollToBottom() throws InterruptedException {
		
		ScrollingHelper.scrollToElement(webDriver, footer);
		Thread.sleep(2000);
	}
	
	
	
	@FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]")
	WebElement hoverproductWebElement1;
	
	@FindBy(xpath = "//a[@data-product-id = '1']")
	WebElement productWebElement1;
	public void clickHoverProduct1() throws InterruptedException {
		
		Actions action = new Actions(webDriver);
		
		
		action.moveToElement(hoverproductWebElement1);
		Thread.sleep(2000);
		action.moveToElement(productWebElement1)
		.click()
		.perform();
		
		Thread.sleep(2000);
	}
	
	

	@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
	WebElement continueWebElement;
	public void clickContinue() {
		

		
	        js.executeScript("arguments[0].click();", continueWebElement);
		 
	}
	
	@FindBy(xpath = "//a[normalize-space()='Cart']")
	WebElement viewcartWebElement;
	public void clickViewCart() {
		onClick(viewcartWebElement);
	}
	
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	WebElement crossWebElement;
	public void clickCross() {
		onClick(crossWebElement);
	}
	
	
	
	
	
	
}
