package com.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.SearchProductsPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SearchPrudctStepDefintions {


		WebDriver webDriver;
        WebDriverWait wait;
		SearchProductsPage page1;
		
		@Given("I am on the homepage and check its visible")
		public void i_am_on_the_homepage_and_check_its_visible() throws InterruptedException {
		    
			
			webDriver = HooksRegistration.getDriver();
			page1 = new SearchProductsPage(webDriver);
			wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
			
			WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
			
			wait.until(ExpectedConditions.visibilityOf(home));
			Assert.assertTrue(home.isDisplayed());
			Thread.sleep(2000);
			
		}

		@When("Click on the products button")
		public void click_on_the_products_button() {
		    
			page1.clickProducts();
		}

		@Then("Check on the user is navigated to all produtcs page")
		public void check_on_the_user_is_navigated_to_all_produtcs_page() {
		    
			String expectedUrl = "https://automationexercise.com/products";
			Assert.assertEquals(webDriver.getCurrentUrl(), expectedUrl);
		}

		@Then("Enter product name in search input and click search button")
		public void enter_product_name_in_search_input_and_click_search_button() throws InterruptedException {
		    page1.clickSearch1("top");
		    page1.clickSearch2();
		    Thread.sleep(2000);
		}

		@Then("Check the search product is visible")
		public void check_the_search_product_is_visible() throws InterruptedException {
		   
			WebElement searched = webDriver.findElement(By.xpath("//h2[@class='title text-center']"));
			Assert.assertTrue(searched.isDisplayed());
			
			Thread.sleep(2000);
			String expectedUrl = "https://automationexercise.com/products?search=top";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "SearchedProduct2");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "FailedSearchedProduct2");
			}
		}



	}


