package com.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.ExistingRegistrationPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExistingRegistrationStepDefinition {

		
		WebDriver webDriver;  
		ExistingRegistrationPage page;
		WebDriverWait wait;
		
		@Given("I am on the home page")
		public void i_am_on_the_home_page() {
		  
			webDriver= HooksRegistration.getDriver();
			page = new ExistingRegistrationPage(webDriver);
			wait= new WebDriverWait(webDriver, Duration.ofSeconds(10));
			
			WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
			wait.until(ExpectedConditions.visibilityOf(home));
			Assert.assertTrue(home.isDisplayed());
		
		}

		@When("I clicked on the Signup\\/Login button")
		public void i_clicked_on_the_signup_login_button() throws InterruptedException {
		    
			page.clickSignup();
			Thread.sleep(2000);
			
		}

		@Then("I should see New User Signup!")
		public void i_should_see_new_user_signup() {

			WebElement newUserSignup = webDriver.findElement(By.xpath("//h2[text()='New User Signup!']"));
	        Assert.assertTrue(newUserSignup.isDisplayed());
	        
		}

		@When("I enter the name {string} and an already registered email {string}")
		public void i_enter_the_name_and_an_already_registered_email(String string, String string2) {
		   
			  page.setUsername(string);
			  page.setEmail(string2);
			
		}

		@When("I click the Signup button")
		public void i_click_the_signup_button() {
		   
			page.clickSignin();
		}

		@Then("The error message Email Address already exist! should be visible")
		public void the_error_message_email_address_already_exist_should_be_visible() throws InterruptedException 
		{
		   
			WebElement incorrectDetails = webDriver.findElement(By.xpath("//p[text() = 'Email Address already exist!']"));
	        Assert.assertTrue(incorrectDetails.isDisplayed());
	        System.out.println("Email Address already exist! displayed");
	        
	        Thread.sleep(2000);
	        
	        String expectedUrl = "https://automationexercise.com/signup";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "ExistUser2");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "NewUser2");
			}
	        
		}
		
	}


