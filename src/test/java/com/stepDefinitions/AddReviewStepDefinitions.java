package com.stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.AddReviewPage;
import com.screenshotUtility.ScreenshotUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddReviewStepDefinitions {


		WebDriver webDriver = HooksRegistration.getDriver();
		AddReviewPage page = new AddReviewPage(webDriver);
		
		@When("Click on view product button")
		public void click_on_view_product_button() throws InterruptedException {
		    page.clickViewProduct();
		    Thread.sleep(4000);
		}

		@Then("Verify Write your review is visible")
		public void verify_write_your_review_is_visible() {
		    
			
			Assert.assertTrue( webDriver.findElement(By.xpath("//a[normalize-space()='Write Your Review']")).isDisplayed());
		}

		@When("Enter name {string} , email {string} , review {string}")
		public void enter_name_email_review(String string, String string2, String string3) throws InterruptedException {
		    
			page.setName(string);
			page.setEmail(string2);
			page.setReview(string3);
			
		}

		@When("Click submit button")
		public void click_submit_button() {
		   
			page.clickSubmit();
		}

		@Then("Verify Success message")
		public void verify_success_message() {
		    
			Assert.assertTrue( webDriver.findElement(By.xpath("//span[normalize-space()='Thank you for your review.']")).isDisplayed());
			
			String expectedUrl = "https://automationexercise.com/product_details/1";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "Review2");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "FailedReview2");
			}
			
		}

	}


