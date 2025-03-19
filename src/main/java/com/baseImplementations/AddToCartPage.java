package com.baseImplementations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basePage.BasePage;

public class AddToCartPage extends BasePage{

	WebDriver webDriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public AddToCartPage(WebDriver webDriver) 
	{
		super(webDriver);
		
		this.webDriver = webDriver;
		 this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		 this.js = (JavascriptExecutor) webDriver;
		 
		PageFactory.initElements(webDriver , this);
	}
	

	@FindBy(xpath = "//a[@href='/products']")
	WebElement products1WebElement;
	
	public void clickonProducts() throws InterruptedException 
	{
		
        js.executeScript("arguments[0].click();", products1WebElement);
        Thread.sleep(2000);
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
	
	

	
	@FindBy(xpath="//button[text()='Continue Shopping']")
	WebElement continueButton;

	
	public void clickContinue() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", continueButton);
	}
	
	
	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]")
	WebElement hoverproductWebElement2;
	
	
	@FindBy(xpath = "//a[@data-product-id = '2']")
	WebElement productWebElement2;
	
	public void clickHoverProduct2() throws InterruptedException {
		
		Actions action = new Actions(webDriver);
		
		action.moveToElement(hoverproductWebElement2)
		.moveToElement(productWebElement2)
		.click()
		.perform();
		
		Thread.sleep(2000);
	}
	
	
	@FindBy(xpath = "//a[normalize-space()='Cart']")
	WebElement viewcartWebElement;
	
	public void clickViewCart() {
		onClick(viewcartWebElement);
	}
		
	
}