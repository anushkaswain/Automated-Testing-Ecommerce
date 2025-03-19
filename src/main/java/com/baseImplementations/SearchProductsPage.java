package com.baseImplementations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePage.BasePage;


public class SearchProductsPage extends BasePage{


		WebDriver webDriver;
		JavascriptExecutor js;
		
		public SearchProductsPage(WebDriver webDriver) {
			super(webDriver);
			this.js = (JavascriptExecutor) webDriver;
			PageFactory.initElements(webDriver , this);
		}
		
		@FindBy(xpath = "//a[@href='/products']")
		WebElement productsWebElement;
		
		public void clickProducts() {
			
	        js.executeScript("arguments[0].click();", productsWebElement);
			
		}

		@FindBy(xpath = "//input[@id='search_product']")
		WebElement searchWebElement1;
		public void clickSearch1(String search) {
			enterText(searchWebElement1, search);
		}
		

		@FindBy(xpath = "//button[@id='submit_search']")
		WebElement searchWebElement2;
		public void clickSearch2() {
			
			
	        js.executeScript("arguments[0].click();", searchWebElement2);
			
			
		}
	}

