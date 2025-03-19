package com.baseImplementations;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePage.BasePage;

public class ScrollUpDownUsingArrowsPage extends BasePage{

		WebDriver webDriver;
		public ScrollUpDownUsingArrowsPage(WebDriver webDriver) {
			super(webDriver);
			this.webDriver = webDriver;
			PageFactory.initElements(webDriver , this);
		}
		

		@FindBy(xpath = "//a[@id='scrollUp']")
		WebElement arrowWebElement;
		
		public void clickArrow() {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", arrowWebElement);
	    
		}
	}


