package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.SubscriptionPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscriptionHomePageStepDefinition {


		WebDriver webDriver = HooksRegistration.getDriver();
		SubscriptionPage page = new SubscriptionPage(webDriver);
		
		
		@Given("I am in home page and check its visible")
		public void i_am_in_home_page_and_check_its_visible() throws InterruptedException {
		   
			WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
			Assert.assertTrue(home.isDisplayed());
			Thread.sleep(2000);
		}

		@When("Scroll down to footer")
		public void scroll_down_to_footer() throws InterruptedException {
		    
			page.scrollToFooter();
			
		}

		@Then("Verify text Subscription")
		public void verify_text_subscription() {
		   
			WebElement subscription = webDriver.findElement(By.xpath("//h2[normalize-space()='Subscription']"));
			Assert.assertTrue(subscription.isDisplayed());
		}

		@When("Enter email address {string} in input and click arrow button")
		public void enter_email_address_in_input_and_click_arrow_button(String string) {
		    page.setEmail(string);
			page.clickArrow();
		}

		@Then("Verify success message")
		public void verify_success_message() {

			WebElement subscribed = webDriver.findElement(By.xpath("//div[contains(text(), 'You have been successfully subscribed!')]"));
			Assert.assertTrue(subscribed.isDisplayed());
			 String expectedUrl = "https://automationexercise.com/";
				if(webDriver.getCurrentUrl().equals(expectedUrl)) {
					ScreenshotUtility.capturePassScreenshot(webDriver, "Subscribed3");
				}else {
					ScreenshotUtility.captureFailScreenshot(webDriver, "FailSubscribed3");
				}
		}

	}

