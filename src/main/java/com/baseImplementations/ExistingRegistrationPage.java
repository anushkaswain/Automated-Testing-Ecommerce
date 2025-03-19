package com.baseImplementations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePage.BasePage;

public class ExistingRegistrationPage extends BasePage{

		WebDriver webDriver;
		JavascriptExecutor js;
		
		public ExistingRegistrationPage(WebDriver webDriver) {
			super(webDriver);
			this.js = (JavascriptExecutor) webDriver;
			PageFactory.initElements(webDriver , this);
		}
		
		
		@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
		WebElement signUpWebElement;
				
		@FindBy(xpath = "//input[@data-qa = 'signup-name']")
		WebElement usernameWebElement;
		
		@FindBy(xpath = "//input[@data-qa= 'signup-email']")
		WebElement emailWebElement;
	
		@FindBy(xpath = "//button[@data-qa= 'signup-button']")
		WebElement signinWebElement;
		
		
		
		
		public void clickSignup() 
		{
			
	        js.executeScript("arguments[0].click();", signUpWebElement);
			
		}
		
		public void setUsername(String uname) 
		{
			
			enterText(usernameWebElement, uname);
		}
			
			public void setEmail(String email) 
			{
				enterText(emailWebElement, email);
			}
	
			
			public void clickSignin() 
			{
				
		        js.executeScript("arguments[0].click();", signinWebElement);
			}
}
