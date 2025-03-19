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

public class Login_Valid_InvalidPage extends BasePage {
	
	private WebDriverWait wait;

	
	public Login_Valid_InvalidPage(WebDriver webdriver) 
	{
		super(webdriver);
		PageFactory.initElements(webdriver, this);
		this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10)); 
		
	}
	
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement signupWebElement;
	
	@FindBy(xpath= "//input[@data-qa='login-email']")
	WebElement loginEmailWebElement;
	
	@FindBy(xpath= "//input[@data-qa='login-password']")
	WebElement passwordWebElement;
	
	@FindBy(xpath= "//button[@data-qa='login-button']")
	WebElement loginButtonWebElement;

	@FindBy(xpath= "//a[text()=' Logged in as ']")
	WebElement loginVisibilityWebElement;

	
	@FindBy(xpath= "//p[text()='Your email or password is incorrect!']")
	WebElement errorMessageWebElement;

	
	public void clickSignUp()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
        js.executeScript("arguments[0].click();", signupWebElement);
			
		
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
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
        js.executeScript("arguments[0].click();", loginButtonWebElement);
		
		
	}
	
	public void loginVisibility()
	{
		
		wait.until(ExpectedConditions.visibilityOf(loginVisibilityWebElement));
	}
	
	public void loginError()
	{
		
		wait.until(ExpectedConditions.visibilityOf(errorMessageWebElement));
	}
}
