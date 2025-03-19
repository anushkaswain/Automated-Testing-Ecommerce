package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.VerifyTestCasePage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VerifyTestCaseStepDefinitions {


		
		WebDriver webDriver;
		VerifyTestCasePage page;
		
		
		@Given("Verify I am on the Automation Exercise home page is visible")
		public void verify_i_am_on_the_automation_exercise_home_page_is_visible() {
		   
			webDriver = HooksRegistration.getDriver();
			page = new VerifyTestCasePage(webDriver);
			
			WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
			Assert.assertTrue(home.isDisplayed());
			
		}

		@When("Click on the Test Cases button")
		public void click_on_the_test_cases_button() {
		  
			page.clickTestCases();
		}

		@Then("Verify navigated to Test Cases page successfully")
		public void verify_navigated_to_test_cases_page_successfully() {
		    
			WebElement testCasePage = webDriver.findElement(By.xpath("//b[normalize-space()='Test Cases']"));
			Assert.assertTrue(testCasePage.isDisplayed());
			
			String expectedUrl = "https://automationexercise.com/test_cases";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "TestCasePage4");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "Failed4");
			}
	        
			
		}
	}

