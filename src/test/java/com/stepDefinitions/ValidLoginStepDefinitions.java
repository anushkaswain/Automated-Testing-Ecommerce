package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Hooks.HooksRegistration;
import com.baseImplementations.Login_Valid_InvalidPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidLoginStepDefinitions {
	
	WebDriver webdriver;
	
	Login_Valid_InvalidPage validLogin;

	
	@Given("User is in home page")
	public void user_is_in_home_page() {
	   
		webdriver= HooksRegistration.getDriver();
		webdriver = new EdgeDriver();
		validLogin= new Login_Valid_InvalidPage(webdriver);
		
		webdriver.get("http://automationexercise.com");
		
		System.out.println("user is on home page..");
		
	}

	@When("user clicks on signup\\/lohin button")
	public void user_clicks_on_signup_lohin_button() {
	    
		validLogin.clickSignUp();
		
	}

	@Then("user is redirected to login page")
	public void user_is_redirected_to_login_page() {
	    
		System.out.println();
		System.out.println("User redirected to login page...");
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) throws InterruptedException {
	   
		validLogin.enterEmail(string);
		
		validLogin.enterPassword(string2);
		
		Thread.sleep(1000);
		
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	  
		validLogin.clickLoginButton();
	}

	@Then("user has successfully logged in")
	public void user_has_successfully_logged_in() {
		
		System.out.println();
		System.out.println("User has successfully logged in with valid credentials...");


	}

	@Then("Logged in as username message is displayed")
	public void logged_in_as_username_message_is_displayed() throws InterruptedException {
	    
		validLogin.loginVisibility();
		System.out.println();
		System.out.println("Yes, logged in as username is visible");
		
      String expectedUrl = "https://automationexercise.com/";
		
		if(webdriver.getCurrentUrl().equals(expectedUrl)) {
			ScreenshotUtility.capturePassScreenshot(webdriver, "PassLogin1");
		}else {
			ScreenshotUtility.captureFailScreenshot(webdriver, "FailLogin2");
		}

		Thread.sleep(2000);
		
	}

	@When("user enters invalid {string} and {string}")
	public void user_enters_invalid_and(String string3, String string4) throws InterruptedException {
		
		validLogin.enterEmail(string3);
		validLogin.enterPassword(string4);
		Thread.sleep(2000);
	    
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	  
		validLogin.clickLoginButton();
	}
	
	
	@Then("Your email or password is incorrect! is visible")
	public void your_email_or_password_is_incorrect_is_visible() {
		
		validLogin.loginError();
		System.out.println();
		System.out.println("An error message is displayed: Your email or password is incorrect! is visible!");
		
		
		
       String expectedUrl = "https://automationexercise.com/";
		
		if(webdriver.getCurrentUrl().equals(expectedUrl)) {
			ScreenshotUtility.capturePassScreenshot(webdriver, "PassLogin3");
		}else {
			ScreenshotUtility.captureFailScreenshot(webdriver, "FailLogin3");
		}
	
	
	    
	}	
	
	}

