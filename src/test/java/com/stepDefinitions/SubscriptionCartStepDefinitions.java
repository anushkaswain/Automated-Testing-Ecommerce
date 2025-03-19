package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.SubscriptionCartPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscriptionCartStepDefinitions {

	WebDriver webDriver = HooksRegistration.getDriver();
	SubscriptionCartPage page = new SubscriptionCartPage(webDriver);

	@Given("verify the current page is home page")
	public void verify_the_current_page_is_home_page() {
	   
		WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
		Assert.assertTrue(home.isDisplayed());
	}

	@When("Click the cart button")
	public void click_the_cart_button() {
	   page.clickCart();
	}

	@When("Scroll down to the footer")
	public void scroll_down_to_the_footer() throws InterruptedException {
	  
		page.scrollToFooter();
	}

	@Then("Verify the text Subscription")
	public void verify_the_text_subscription() {
		
		WebElement subscription = webDriver.findElement(By.xpath("//h2[normalize-space()='Subscription']"));
		Assert.assertTrue(subscription.isDisplayed());
	}

	@When("Enter email address {string} in input text and click arrow button to subsribe")
	public void enter_email_address_in_input_text_and_click_arrow_button_to_subsribe(String string) {
	   
		 page.setEmail(string);
		 page.clickArrow();
	}

	@Then("Verify the success message is visible")
	public void verify_the_success_message_is_visible() {
	   
		WebElement subscribed = webDriver.findElement(By.xpath("//div[contains(text(), 'You have been successfully subscribed!')]"));
		Assert.assertTrue(subscribed.isDisplayed());
		 String expectedUrl = "https://automationexercise.com/view_cart";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "SubscribedCart2");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "FailSubscribed2");
			}
	}


}