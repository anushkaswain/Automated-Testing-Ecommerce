package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.Utility.ScrollingHelper;
import com.baseImplementations.RemoveProductFromCartPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveProductFromCartStepDefiniton {
	
	WebDriver webDriver;
	RemoveProductFromCartPage page; 
	WebDriverWait wait;
	ScrollingHelper scroll;
	
	@Given("I am in the home page and its visible")
	public void i_am_in_the_home_page_and_its_visible() {
		
		webDriver= HooksRegistration.getDriver();
		page= new RemoveProductFromCartPage(webDriver);
		//scroll= new ScrollingHelper(webDriver);
		WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
		Assert.assertTrue(home.isDisplayed());
		
		page.clickProducts();
	}

	@When("I add products to cart")
	public void i_add_products_to_cart() throws InterruptedException {
		
	//	scroll.scrollDownByPixel("700");
		
		page.clickHoverProduct1();
		Thread.sleep(3000);
		
		page.clickContinue();
		Thread.sleep(2000);
	}

	@When("I click the cart button")
	public void i_click_the_cart_button() throws InterruptedException {
	  
		page.clickViewCart();
		Thread.sleep(2000);
	}

	@Then("I should see the cart page displayed")
	public void i_should_see_the_cart_page_displayed() throws InterruptedException {
	   
		WebElement table = webDriver.findElement(By.id("cart_info_table"));
		Thread.sleep(5000);
		Assert.assertTrue(table.isDisplayed());
		
	}

	@When("I clicks the cross mark button corresponding to particular product")
	public void i_clicks_the_cross_mark_button_corresponding_to_particular_product() throws InterruptedException {
	    
		page.clickCross();
		Thread.sleep(3000);
	}

	@Then("the product should be removed from the cart")
	public void the_product_should_be_removed_from_the_cart() {
		
		WebElement empty = webDriver.findElement(By.xpath("//b[normalize-space()='Cart is empty!']"));
		Assert.assertTrue(empty.isDisplayed());
		
		
		String expectedUrl = "https://automationexercise.com/view_cart";
		if(webDriver.getCurrentUrl().equals(expectedUrl)) {
			ScreenshotUtility.capturePassScreenshot(webDriver, "EmptyCart2");
		}else {
			ScreenshotUtility.captureFailScreenshot(webDriver, "FailedEmptyCart2");
		}
	}
	
	

}
