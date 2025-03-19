package com.stepDefinitions;


import org.openqa.selenium.WebDriver;

import com.Hooks.HooksRegistration;
import com.baseImplementations.AddRecommendedItemsPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class AddRecommendationsStepDefintions {
	


		WebDriver webDriver = HooksRegistration.getDriver();
		AddRecommendedItemsPage page = new AddRecommendedItemsPage(webDriver);
		
		@Given("Scroll to bottom of the page of recommended items")
		public void scroll_to_bottom_of_the_page_of_recommended_items() throws InterruptedException {
		    
			page.scrollToRecommended();
			
		}

		@When("Clicking on the add to cart recommended product")
		public void clicking_on_the_add_to_cart_recommended_product() throws InterruptedException {
			
			page.clickAddToCart();
			Thread.sleep(1500);
			
			page.clickContinue();
			
			String expectedUrl = "https://automationexercise.com/view_cart";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "AddRecommendatiomPass1");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "FailAddRecommendatiom1");
			}
		}
	}

