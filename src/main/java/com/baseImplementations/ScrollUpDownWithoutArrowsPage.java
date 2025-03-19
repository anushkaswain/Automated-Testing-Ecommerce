package com.baseImplementations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ScrollingHelper;
import com.basePage.BasePage;


public class ScrollUpDownWithoutArrowsPage extends BasePage{

		WebDriver webDriver;
		public ScrollUpDownWithoutArrowsPage(WebDriver webDriver) {
			super(webDriver);
			this.webDriver = webDriver;
			PageFactory.initElements(webDriver , this);
		}
		
		@FindBy(xpath = "//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
		WebElement scrollUpWebElement;	
		public void scrollToUp() throws InterruptedException {
			
			ScrollingHelper.scrollToElement(webDriver, scrollUpWebElement);
		}
		

	}


