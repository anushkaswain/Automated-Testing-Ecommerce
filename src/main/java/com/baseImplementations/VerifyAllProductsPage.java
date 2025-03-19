package com.baseImplementations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyAllProductsPage {

	WebDriver webDriver;
	public VerifyAllProductsPage(WebDriver webDriver) {
		super();
		this.webDriver=webDriver;
		PageFactory.initElements(webDriver , this);
	}
	
	@FindBy(xpath = "//a[@href='/products']")
	WebElement productsWebElement;
	
	public void clickProducts()
	{
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", productsWebElement);
    
	}
	
	@FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	WebElement viewproductWebElement;
	
	public void clickViewProduct()
	{
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", viewproductWebElement);
		
	}
	
}

