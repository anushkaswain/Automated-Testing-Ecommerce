package com.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Hooks.HooksRegistration;
import com.Utility.ScrollingHelper;
import com.baseImplementations.DownloadInvoicePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DownloadInvoiceAfterPurchaseStepDefinition {


		WebDriver webDriver = HooksRegistration.getDriver();
		DownloadInvoicePage page = new DownloadInvoicePage(webDriver);
		JavascriptExecutor js =(JavascriptExecutor)webDriver;
		ScrollingHelper scroll= new ScrollingHelper();
		
		 @Then("Handle pop-ups if any")
		    public void handle_popups_if_any() {
		        ScrollingHelper.closePopUps(webDriver);   
		        ScrollingHelper.dismissAlert(webDriver);  
		        ScrollingHelper.clickOutside(webDriver); 
		    }

		    @Then("Scroll down to avoid advertisements")
		    public void scroll_down_to_avoid_advertisements() throws InterruptedException {
		        scroll.scrollDownByPixel(webDriver, 500); 
		        Thread.sleep(2000);
		    }
		
		
		@Given("Click Download Invoice button and verify invoice is downloaded successfully")
		public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() throws InterruptedException {
		   
			scroll.scrollDownByPixel(webDriver, 800);
			handle_popups_if_any();
			
			page.clickDownloadInvoice();
			Thread.sleep(3000);
		}
	}


