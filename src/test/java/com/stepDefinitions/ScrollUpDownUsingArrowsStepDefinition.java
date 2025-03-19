package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.ScrollUpDownUsingArrowsPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollUpDownUsingArrowsStepDefinition {

	
	WebDriver webDriver = HooksRegistration.getDriver();
	ScrollUpDownUsingArrowsPage page = new ScrollUpDownUsingArrowsPage(webDriver);
	
	@When("Click on arrow at bottom right side to move upward")
	public void click_on_arrow_at_bottom_right_side_to_move_upward() throws InterruptedException {
	    Thread.sleep(2000);
		page.clickArrow();
	}

	@Then("Verify that page is scrolled up and full fledged practice website is visible")
	public void verify_thae_page_is_scrolled_up_and_full_fledged_practice_website_is_visible() throws InterruptedException {
	   
		Thread.sleep(2000);
		WebElement subscribed = webDriver.findElement(By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]"));
		Assert.assertTrue(subscribed.isDisplayed());
		
		Thread.sleep(2000);
		
		String expectedUrl = "https://automationexercise.com/";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "ScrollUpUsingArrow11");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "FailScrollUpUisngArrow11");
			}
	}

	
	
	
	
}
