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

public class AddReviewPage extends BasePage{

		WebDriver webDriver;
		WebDriverWait wait;
		
		public AddReviewPage(WebDriver webDriver) {
			super(webDriver);
			this.webDriver = webDriver;
			this.wait= new WebDriverWait(webDriver, Duration.ofSeconds(10));
			PageFactory.initElements(webDriver , this);
		}
		
		@FindBy(xpath = "(//a[text()='View Product'])[1]")
		WebElement viewproductsWebElement;
		
		public void clickViewProduct() throws InterruptedException {
			
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", viewproductsWebElement);
	        Thread.sleep(3000);
	        //wait.until(ExpectedConditions.elementToBeClickable(viewproductsWebElement));
			//onClick(viewproductsWebElement);
			
	
		}
		
		
		@FindBy(xpath = "//input[@id='name']")
		WebElement nameWebElement;
		public void setName( String name) throws InterruptedException {
			enterText(nameWebElement, name);
			Thread.sleep(2000);
		}
		
		@FindBy(xpath = "//input[@id='email']")
		WebElement emailWebElement;
		public void setEmail( String email) throws InterruptedException {
			enterText(emailWebElement, email);
			Thread.sleep(2000);
		}
		
		@FindBy(xpath = "//textarea[@id='review']")
		WebElement reviewWebElement;
		public void setReview( String review) throws InterruptedException {
			enterText(reviewWebElement, review);
			Thread.sleep(2000);
		}
		
		@FindBy(xpath = "//button[@id='button-review']")
		WebElement submitWebElement;
		public void clickSubmit() {
			
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].click();", submitWebElement);
		
			
		}
		
		
		
		
		
		
	}



