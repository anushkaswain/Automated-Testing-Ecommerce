package com.stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.VerifyAllProductsPage;
import com.screenshotUtility.ScreenshotUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VerifyAllProductsStepDefinitions {

		WebDriver webDriver = HooksRegistration.getDriver();

		VerifyAllProductsPage page = new VerifyAllProductsPage(webDriver);
		
		@Given("Verify that home page for Automation Exercise is visible successfully")
		public void verify_that_home_page_for_automation_exercise_is_visible_successfully() {

			WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
			Assert.assertTrue(home.isDisplayed());
			
		}

		@When("Click on Products button")
		public void click_on_products_button() {
		   
			page.clickProducts();
		}

		@Then("Verify user is navigated to All Products page successfully")
		public void verify_user_is_navigated_to_all_products_page_successfully() {
			
			String expectedUrl = "https://automationexercise.com/products";
			Assert.assertEquals(webDriver.getCurrentUrl(), expectedUrl);
			
		}

		@Then("The products list is visible")
		public void the_products_list_is_visible() {
		  
			WebElement productList = webDriver.findElement(By.xpath("//h2[@class='title text-center']"));
			Assert.assertTrue(productList.isDisplayed());
			
		}

		@When("Click on View Product of first product")
		public void click_on_view_product_of_first_product() {
		    
			page.clickViewProduct();
		}

		@Then("User is landed to product detail page")
		public void user_is_landed_to_product_detail_page() {
		    
			String expectedUrl = "https://automationexercise.com/product_details/1";
			Assert.assertEquals(webDriver.getCurrentUrl(), expectedUrl);
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "PoductDetails2");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "FailedProdPage2");
			}
			
		}

		@Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
		public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
			
			WebElement productName = webDriver.findElement(By.xpath("//h2[normalize-space()='Blue Top']"));
			Assert.assertTrue(productName.isDisplayed());
			
			WebElement productCategory = webDriver.findElement(By.xpath("//p[normalize-space()='Category: Women > Tops']"));
			Assert.assertTrue(productCategory.isDisplayed());
			
			WebElement productPrice = webDriver.findElement(By.xpath("//span[normalize-space()='Rs. 500']"));
			Assert.assertTrue(productPrice.isDisplayed());
			
			WebElement productAvailability = webDriver.findElement(By.xpath("//div[@class='product-details']//p[2]"));
			Assert.assertTrue(productAvailability.isDisplayed());
			
			WebElement productCondition = webDriver.findElement(By.xpath("//body//section//p[3]"));
			Assert.assertTrue(productCondition.isDisplayed());
			
			WebElement productBrand = webDriver.findElement(By.xpath("//body//section//p[4]"));
			Assert.assertTrue(productBrand.isDisplayed());
			
			
		}

	}


