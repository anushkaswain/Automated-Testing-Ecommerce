package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.RegistrationPage;
import com.baseImplementations.SearchAndVerifyCartPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.When;


public class SeachAndVerifyCartStepDefinitions {

		WebDriver webDriver = HooksRegistration.getDriver();	
		SearchAndVerifyCartPage page = new SearchAndVerifyCartPage(webDriver);
		RegistrationPage registration=new RegistrationPage(webDriver);
		
		 @Then("I click on the signup\\/login button")
		    public void i_click_on_the_signup_login_button() {
			 registration.clickSignUp();
		        System.out.println("Clicked on the signup/login button");
		    }

		    @When("I enter a valid {string} and {string}")
		    public void i_enter_a_valid_and(String username, String password) {
		    	 username = "anushkaswain@gmail.com";
		         password = "pass";

		    	registration.enterNameandEmail(username, password);

		        System.out.println("Entered valid username: " + username + " and password: " + password);
		    }

		    @When("I click the login button")
		    public void i_click_the_login_button() {
		       registration.clickNewSignUp();
		        System.out.println("Clicked the login button");
		    }
		    
		@Then("Add those products to cart")
		public void add_those_products_to_cart() throws InterruptedException {
		    Thread.sleep(2000);
			page.clickHoverProduct1();
			page.clickContinue();
			Thread.sleep(2000);
			
			page.clickHoverProduct2();
			page.clickContinue();
			Thread.sleep(2000);
			
			page.clickHoverProduct3();
			page.clickContinue();
			Thread.sleep(2000);
			
		}

		@Then("Click Cart button and verify that products are visible in cart")
		public void click_cart_button_and_verify_that_products_are_visible_in_cart() throws InterruptedException {
		    
			page.clickCart();
			Thread.sleep(3000);
			
			WebElement table = webDriver.findElement(By.id("cart_info_table"));
			Assert.assertTrue(table.isDisplayed());
		}

		@Then("Remove all products that have been added")
		public void remove_all_products_that_have_been_added() throws InterruptedException {
		   
		   page.clickDelete1();
		   Thread.sleep(2000);
		   
		   page.clickDelete2();
		   Thread.sleep(2000);
		   
		   page.clickDelete3();
		   Thread.sleep(2000);
		}

		@Then("Verify Cart is empty! Click here to buy products. is visible")
		public void verify_cart_is_empty_click_here_to_buy_products_is_visible() {
		    
			WebElement empty = webDriver.findElement(By.xpath("//b[normalize-space()='Cart is empty!']"));
			Assert.assertTrue(empty.isDisplayed());
			
			
			String expectedUrl = "https://automationexercise.com/view_cart";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "SearchRemoveCart2");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "FailedSearchRemoveCart2");
			}
		}

	}


