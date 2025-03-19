package com.baseImplementations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basePage.BasePage;

public class LogoutPage extends BasePage{

private WebDriverWait wait;

	public LogoutPage(WebDriver webdriver) 
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
	
	@FindBy(xpath= "//a[text()=' Logout']")
	WebElement logoutButtonWebElement;
	
	
	public void clickSignUp()
	{
		signupWebElement.click();
	}
	
	
	public void enterEmail(String email)
	{
		loginEmailWebElement.clear();
		loginEmailWebElement.sendKeys("anushkaswain@gmail.com");
		
	}
	
	
	public void enterPassword(String password)
	{
		passwordWebElement.clear();
		wait.until(ExpectedConditions.elementToBeClickable(passwordWebElement));
		passwordWebElement.sendKeys("anu123");
	}
	
	
	public void clickLoginButton()
	{
		loginButtonWebElement.click();
	}
	
	public void loginVisibility()
	{
		
		wait.until(ExpectedConditions.visibilityOf(loginVisibilityWebElement));
	}
	
	public void logOut()
	{
		
		wait.until(ExpectedConditions.visibilityOf(logoutButtonWebElement));
		logoutButtonWebElement.click();
	}
	
	
	
}
