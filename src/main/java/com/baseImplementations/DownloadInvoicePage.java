package com.baseImplementations;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePage.BasePage;


public class DownloadInvoicePage extends BasePage{

		WebDriver webDriver;
		JavascriptExecutor js; 
		public DownloadInvoicePage(WebDriver webDriver) {
			super(webDriver);
			this.webDriver = webDriver;
			this.js = (JavascriptExecutor) webDriver;
			PageFactory.initElements(webDriver , this);
		}
		
		
		@FindBy(xpath = "//a[@class='btn btn-default check_out']")
		WebElement downloadWebElement;
		public void clickDownloadInvoice() {
			
		
	        js.executeScript("arguments[0].click();", downloadWebElement);
		    
		}
	}

