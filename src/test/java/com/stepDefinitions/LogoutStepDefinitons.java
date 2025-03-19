package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Hooks.HooksRegistration;
import com.baseImplementations.LogoutPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinitons {
	
	
    WebDriver webdriver;
	
	LogoutPage log;


@Given("User is in Home page")
public void user_is_in_home_page() {
	
	webdriver= HooksRegistration.getDriver();
	webdriver = new EdgeDriver();
	log= new LogoutPage(webdriver);
	
	webdriver.get("http://automationexercise.com");
	
	System.out.println("user is on home page");
   
}

@When("User clicked on signup\\/login button")
public void user_clicked_on_signup_login_button() {
	
	log.clickSignUp();
    
}

@When("User entered {string} and {string}")
public void user_entered_and(String string, String string2) throws InterruptedException {
    
	log.enterEmail(string);
	log.enterPassword(string2);
	Thread.sleep(1000);
	log.clickLoginButton();
}

@Then("User logged in")
public void user_logged_in() {
	
	
	System.out.println();
	System.out.println("User successfully logged in..");
   
	
}

@Then("Logged in as username is displayed..")
public void logged_in_as_username_is_displayed() {
    
	log.loginVisibility();
	System.out.println();
	System.out.println(" logged in as username is displayed..");
	
}

@When("User clicked logout button")
public void user_clicked_logout_button() {
    
	log.logOut();
}

@Then("User redirected to home page..")
public void user_redirected_to_home_page() throws InterruptedException {

	System.out.println();
	System.out.println("Logout successfull...Redirecting to home page..");
	
	
	Thread.sleep(2000);
	  String expectedUrl = "https://automationexercise.com/login";
		
			if(webdriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webdriver, "PassLogout2");
			}else {
				ScreenshotUtility.captureFailScreenshot(webdriver, "FailLogout2");
			}
}



	   

}
