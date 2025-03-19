package com.baseImplementations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basePage.BasePage;


public class VerifyTestCasePage extends BasePage {

	private WebDriverWait wait;

	public VerifyTestCasePage(WebDriver webdriver) 
	{
		super(webdriver);
		PageFactory.initElements(webdriver, this);
		this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10)); 
		
	}
	

		@FindBy(xpath = "//a[contains(text(),'Test Cases')]")
		WebElement testCasesWebElement;
		public void clickTestCases() {
			onClick(testCasesWebElement);
		}
		
	}
	

