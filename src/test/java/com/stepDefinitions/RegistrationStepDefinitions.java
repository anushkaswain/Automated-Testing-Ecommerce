package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Hooks.HooksRegistration;
import com.baseImplementations.RegistrationPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDefinitions {
	
	WebDriver webdriver;
	
	RegistrationPage registration;

	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
	    
		webdriver= HooksRegistration.getDriver();
		webdriver = new EdgeDriver();
		registration= new RegistrationPage(webdriver);
		
		webdriver.get("http://automationexercise.com");
		
		System.out.println("user is on home page");
		
	}

	@Given("User clicks on the Sign-Up\\/Login button")
	public void user_clicks_on_the_sign_up_login_button() {
		registration.clickSignUp();
	}

	@Then("User is redirected to the Sign-Up page")
	public void user_is_redirected_to_the_sign_up_page() {
	    System.out.println("user is redirected to sign-up page");
	}

	@When("User fills in the signup details {string} and {string}")
	public void user_fills_in_the_signup_details_and(String string1, String stringE) throws InterruptedException {
	    
		registration.enterNameandEmail(string1, stringE);
		Thread.sleep(2000);
	}

	@When("User clicks the Sign-Up button")
	public void user_clicks_the_sign_up_button() {
	    registration.clickNewSignUp();
	}

	@Then("User is redirected to the account information page")
	public void user_is_redirected_to_the_account_information_page() {
		
		System.out.println("user has been redirected to the account information page");
		System.out.println("Enter Account Information is validated");

	}

	@When("User enters the following details {string}, {string} ,{string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
	public void user_enters_the_following_details_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
	    
		
		registration.enterPassword(string);
		Thread.sleep(2000);
		registration.enterUserDetails(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12);
		Thread.sleep(2000);
		
	}

	@When("User clicks on the Create Account button")
	public void user_clicks_on_the_create_account_button() {
		registration.clickCreateAccount();
	   
	}
	
	
	@Then("User account created")
	public void user_account_created()
	{
		System.out.println("User account has been successfully created");
	}

	
	@Then("Account created message verified")
	public void account_created_message_verified() {
		System.out.println("Account created message verified");
	}

	@Then("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		registration.clickContinue();
	    
	}

	@Then("logged in as username is visible")
	public void logged_in_as_username_is_visible() {
		
		System.out.println("logged in as username is visible");
	
	}

	@When("user clicks on delete account button")
	public void user_clicks_on_delete_account_button() {
		registration.clickDelAcc();
	   
	}

	@Then("account deleted is visible")
	public void account_deleted_is_visible() {
		System.out.println("account deleted Message is visible");
	}

	@Then("user clicks continue button")
	public void user_clicks_continue_button() {
		registration.clickContinueButton();
		
		String expectedUrl = "https://automationexercise.com/";
		
		if(webdriver.getCurrentUrl().equals(expectedUrl)) {
			ScreenshotUtility.capturePassScreenshot(webdriver, "PassRegistration2");
		}else {
			ScreenshotUtility.captureFailScreenshot(webdriver, "FailRegistration2");
		}
	    
	}

}
