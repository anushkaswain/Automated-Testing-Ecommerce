package com.baseImplementations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePage.BasePage;

public class IncreasedQuantityPage extends BasePage{

		WebDriver webDriver;
		public IncreasedQuantityPage(WebDriver webDriver) {
			super(webDriver);
			this.webDriver = webDriver;
			PageFactory.initElements(webDriver , this);
		}
		
		@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a")
		WebElement viewproductWebElement;
		public void clickViewProduct() {
			
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", viewproductWebElement);
			
		}
		
		@FindBy(xpath = "//input[@id='quantity']")
		WebElement quantityWebElement;
		public void setQuantity(String quantity) 
		{
			quantityWebElement.clear();
			enterText(quantityWebElement, quantity);
			
		}
		
		@FindBy(xpath = "//button[@type='button']")
		WebElement addWebElement;
		public void clickAdd() {
			
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", addWebElement);
			
			
		}

		@FindBy(xpath = "//*[@id='cartModal']/div/div/div[2]/p[2]/a/u")
		WebElement viewcartWebElement;
		public void clickViewCart() {
			
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", viewcartWebElement);
			
			
		}
	}


