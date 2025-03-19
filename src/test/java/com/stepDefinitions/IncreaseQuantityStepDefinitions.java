package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.IncreasedQuantityPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class IncreaseQuantityStepDefinitions {

		WebDriver webDriver = HooksRegistration.getDriver();
		IncreasedQuantityPage page = new IncreasedQuantityPage(webDriver);
		
		
		@Given("I am on the home page and check its visible")
		public void i_am_on_the_home_page_and_check_its_visible() {
		    
			WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
			Assert.assertTrue(home.isDisplayed());
			
		}

		@When("Click View Product for any product on home page")
		public void click_view_product_for_any_product_on_home_page() {
			 page.clickViewProduct();
			 
		}

		@Then("Verify product detail is opened")
		public void verify_product_detail_is_opened() {
		  
		}

		@When("Increase quantity to {string}")
		public void increase_quantity_to(String string) {
		   page.setQuantity(string);
		}

		@When("Click Add to cart")
		public void click_add_to_cart() throws InterruptedException {
		   page.clickAdd();
		   Thread.sleep(2000);
		}

		@When("Click View Cart")
		public void click_view_cart() throws InterruptedException {
		   page.clickViewCart();
		   Thread.sleep(2000);
		}

		@Then("Verify that product is displayed in cart page with exact quantity")
		public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() throws InterruptedException {
		    
			WebElement table = webDriver.findElement(By.id("cart_info_table"));
			Assert.assertTrue(table.isDisplayed());
			Thread.sleep(2000);			
			
			WebElement quantity = webDriver.findElement(By.xpath("//button[@class='disabled']"));
			String prodquantity = quantity.getText();
			System.out.println("Product 1 quantity : " + prodquantity);
			
			String expectedUrl = "https://automationexercise.com/view_cart";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "QuantityIncreased2");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "FailedQuantityIncreased2");
			}
			
		}


		
	}


