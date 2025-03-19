package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.ViewAndCartPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewAndCartStepDefinition {
	
	WebDriver webDriver = HooksRegistration.getDriver();
	ViewAndCartPage page = new ViewAndCartPage(webDriver);
	
	@Then("verify the brand are visible")
	public void verify_the_brand_are_visible() {
	    
		WebElement brands = webDriver.findElement(By.xpath("//h2[normalize-space()='Brands']"));
		Assert.assertTrue(brands.isDisplayed());
	}

	@When("Click on the any brand name")
	public void click_on_the_any_brand_name() throws InterruptedException {
	    
		page.clickPolo();
	    Thread.sleep(2000);
	    
	}

	@Then("user is navigate to brand page")
	public void user_is_navigate_to_brand_page() {
	   
		Assert.assertTrue( webDriver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed());
		
		String expectedUrl = "https://automationexercise.com/brand_products/Polo";
		if(webDriver.getCurrentUrl().equals(expectedUrl)) {
			ScreenshotUtility.capturePassScreenshot(webDriver, "PoloCategory1");
		}else {
			ScreenshotUtility.captureFailScreenshot(webDriver, "FailedPoloCategory1");
		}
		
	}

	@When("on left side bar click on any other brand link")
	public void on_left_side_bar_click_on_any_other_brand_link() throws InterruptedException {
		
		page.clickHandM();
	    Thread.sleep(2000);
	}

	@Then("verify user is navigate to that particular brand products page")
	public void verify_user_is_navigate_to_that_particular_brand_products_page() {
		Assert.assertTrue( webDriver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed());

		String expectedUrl = "https://automationexercise.com/brand_products/H&M";
		if(webDriver.getCurrentUrl().equals(expectedUrl)) {
			ScreenshotUtility.capturePassScreenshot(webDriver, "H&MCategory2");
		}else {
			ScreenshotUtility.captureFailScreenshot(webDriver, "FailedH&MCategory12");
		}
		
	}

}



