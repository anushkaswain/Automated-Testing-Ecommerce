package com.baseImplementations;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basePage.BasePage;

public class ContactUsFormPage extends BasePage{

		WebDriver webDriver;
		
		public ContactUsFormPage(WebDriver webDriver) {
			super(webDriver);
			PageFactory.initElements(webDriver , this);
		}
		
		
		
		@FindBy(xpath = "//a[normalize-space()='Contact us']")
		WebElement contactUsWebElement;

		@FindBy(xpath = "//input[@placeholder='Name']")
		WebElement nameWebElement;
		
		@FindBy(xpath = "//input[@placeholder='Email']")
		WebElement emailWebElement;
		
		@FindBy(xpath = "//input[@placeholder='Subject']")
		WebElement subjectWebElement;
		
		@FindBy(xpath = "//textarea[@id='message']")
		WebElement messageWebElement;
		
		@FindBy(xpath = "//input[@name='upload_file']")
		WebElement uploadWebElement;
			
		@FindBy(xpath = "//input[@data-qa='submit-button']")
		WebElement submitWebElement;
		
		@FindBy(xpath = "//span[normalize-space()='Home']")
		WebElement homeWebElement;
		
		
		
		public void clickConatctUs() 
		{
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	         js.executeScript("arguments[0].click();", contactUsWebElement);
	      
			
		}
		
		public void setName(String name) 
		{
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	         
	         js.executeScript("arguments[0].value='anushka11';", nameWebElement);
		
		}
		
		public void setEmail(String email) 
		{
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	         
	         js.executeScript("arguments[0].value= 'anushkaswain11@gmail.com';", emailWebElement);
		
		}
		
		public void setSubject(String subject)
		{
			
		
			enterText(subjectWebElement, subject);
		}
		
		public void setMessage(String message) 
		{
			enterText(messageWebElement, message);
		}
		
		public void chooseFile(String path) throws InterruptedException 
		{
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	         js.executeScript("arguments[0].click();", uploadWebElement);
	      
			//uploadWebElement.click();
			Thread.sleep(1000);
			enterText(uploadWebElement, path);
		}
		
		public void clickSubmit() 
		{
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
	         js.executeScript("arguments[0].click();", submitWebElement);
	      
			
			//onClick(submitWebElement);
		}
		
		public void clickHome() 
		{
			onClick(homeWebElement);
		}
		
	}


