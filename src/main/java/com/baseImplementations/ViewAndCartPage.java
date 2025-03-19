package com.baseImplementations;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePage.BasePage;

public class ViewAndCartPage extends BasePage{
	
	
		WebDriver webDriver;
		public ViewAndCartPage(WebDriver webDriver) {
			super(webDriver);
			this.webDriver = webDriver;
			PageFactory.initElements(webDriver , this);
		}

		@FindBy(xpath = "//a[@href='/brand_products/Polo']")
		WebElement poloWebElement;
		
		public void clickPolo() 
		{
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", poloWebElement);
			//onClick(poloWebElement);
		}
		
		@FindBy(xpath = "//a[@href='/brand_products/H&M']")
		WebElement hmWebElement;
		public void clickHandM() {
			
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", hmWebElement);
			//onClick(hmWebElement);
		}
		
	}

