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

public class VerifyCategoryPage extends BasePage{

	
	private WebDriver webdriver;
    private WebDriverWait wait;
    JavascriptExecutor js;

    public VerifyCategoryPage(WebDriver webdriver) {
        super(webdriver);
        this.webdriver = webdriver;
        this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10)); 
        this.js = (JavascriptExecutor) webdriver;
        PageFactory.initElements(webdriver, this);
    }
    
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement signupWebElement;
	
	@FindBy(xpath= "//input[@data-qa='login-email']")
	WebElement loginEmailWebElement;
	
	@FindBy(xpath= "//input[@data-qa='login-password']")
	WebElement passwordWebElement;
	
	@FindBy(xpath= "//button[@data-qa='login-button']")
	WebElement loginButtonWebElement;

	@FindBy(xpath = "//a[@href='/products']")
	WebElement productsWebElement;

	@FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
	WebElement womenproductsWebElement;
			
	
			@FindBy(xpath = "(//a[text()='Dress '])[1]")
			WebElement dressproductsWebElement;
	
			
			
			@FindBy(xpath = "(//i[@class='fa fa-plus'])[2]")
			WebElement menproductsWebElement;
			
		
			@FindBy(xpath = "(//a[text()='Tshirts '])[1]")
			WebElement tshirtproductsWebElement;
	
			
			
			
			
			public void clickSignUp()
			{
				signupWebElement.click();
			}
			
			
			public void enterEmail(String email)
			{
				loginEmailWebElement.clear();
				loginEmailWebElement.sendKeys(email);
				
			}
			
			
			public void enterPassword(String password)
			{
				passwordWebElement.clear();
				wait.until(ExpectedConditions.elementToBeClickable(passwordWebElement));
				passwordWebElement.sendKeys(password);
			}
			
			
			public void clickLoginButton()
			{
				loginButtonWebElement.click();
			}
			
			
			
			
	public void clickProducts() throws InterruptedException{
		 js.executeScript("arguments[0].scrollIntoView(true);", productsWebElement);
		
		Thread.sleep(2000);
	}
	
	public void clickWomenProducts() {
		
		    try {
		        
		        webdriver.switchTo().defaultContent();  

		        
		       
		        js.executeScript("arguments[0].scrollIntoView(true);", womenproductsWebElement);
		        
		     
		        wait.until(ExpectedConditions.elementToBeClickable(womenproductsWebElement));

		     
		        js.executeScript("arguments[0].click();", womenproductsWebElement);

		    } catch (Exception e) {
		        System.out.println("Exception in clicking Women Products: " + e.getMessage());
		    }
		}

		
		
	
	
	public void clickDressProducts() throws InterruptedException {
		
        js.executeScript("arguments[0].click();", dressproductsWebElement);
        Thread.sleep(2000);
		
		
	}
	
	
	
	public void clickMenProducts() throws InterruptedException {
		 js.executeScript("arguments[0].scrollIntoView(true);", womenproductsWebElement);
		Thread.sleep(2000);
	}
	
	
	public void clickTshirtProducts() throws InterruptedException {
		
		 js.executeScript("arguments[0].click();", tshirtproductsWebElement);
	        Thread.sleep(2000);
		
	}
	

	
}
