package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.Utility.ScrollingHelper;
import com.baseImplementations.RegistrationWhileCheckoutPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_WhileCheckoutStepDefinition {
	
	WebDriver webDriver = HooksRegistration.getDriver();
	RegistrationWhileCheckoutPage page = new RegistrationWhileCheckoutPage(webDriver);
	ScrollingHelper scroll= new ScrollingHelper();

	@Given("Verifies that home page is visible successfully")
	public void verifies_that_home_page_is_visible_successfully() {
		WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
		Assert.assertTrue(home.isDisplayed());
	}
	@When("Add product item to cart")
	public void add_product_item_to_cart() throws InterruptedException  {
		page.clickHoverProduct1();
		Thread.sleep(3000);
	}
	@When("Clicked the cart button and verify that cart page is displayed")
	public void clicked_the_cart_button_and_verify_that_cart_page_is_displayed() throws InterruptedException {
		   Thread.sleep(5000);
			page.clickViewCart();
			
			WebElement table = webDriver.findElement(By.id("cart_info_table"));
			Assert.assertTrue(table.isDisplayed());
	}
	@When("Click proceed to checkout")
	public void click_proceed_to_checkout() throws InterruptedException {
	    
		page.clickProceedToCheckout();
		Thread.sleep(2000);
	}
	@When("Click RegisterLogin button")
	public void click_register_login_button() {
		page.clickRegisterLogin();
	}
	@When("Checked the New User Signup!is diplayed")
	public void checked_the_new_user_signup_is_diplayed() {
		WebElement newUserSignup = webDriver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(newUserSignup.isDisplayed());
	}
	@When("I entered {string} and {string}")
	public void i_entered_and(String string, String string2) {
		page.setUsername(string);
		page.setEmail(string2);
	}
	@When("I clicks signup button")
	public void i_clicks_signup_button() {
		page.clickSignin();
	}
	@When("Verify Enter Account Information is displayed")
	public void verify_enter_account_information_is_displayed() {
		Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b")).isDisplayed());
		System.out.println("Enter Account Information displayed");
	}
	@When("I filled the required to enter title and {string} and {string} and {string} and {string}")
	public void i_filled_the_required_to_enter_title_and_and_and_and(String string, String string2, String string3, String string4) throws InterruptedException {
		 
		  page.setGender();
		  page.setPassword(string);
		  page.setDate(string2);
		  Thread.sleep(1000);
		  page.setMonths(string3);
		  Thread.sleep(1000);
		  page.setYears(string4);
	}
	@When("Clicked newsletter and special offers checkboxes")
	public void clicked_newsletter_and_special_offers_checkboxes() {
		page.clickNewsletter();
		 page.clickSpecial();
	}
	@When("I next entered {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void i_next_entered_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
		page.setFirstname(string);
		page.setLastname(string2);
		page.setCompany(string3);
		page.setAddress1(string4);
		page.setAddress2(string5);
		page.setState(string6);
		page.setCity(string7);
		page.setZipcode(string8);
		page.setMobileNumber(string9);
	}
	@When("I clicked create")
	public void i_clicked_create() {
		page.clickCreate();
	}
	@When("Verify that Logged in as username is displayed")
	public void verify_that_logged_in_as_username_is_displayed() throws InterruptedException {

			//Assert.assertTrue(webDriver.findElement(By.xpath("//li[10]//a[1]")).isDisplayed());
			System.out.println("Logged in as username");
			Thread.sleep(2000);
	}
	@When("Clicked the cart button")
	public void clicked_the_cart_button() {
		page.clickCart();
	}
	@When("verify address detailes and review your order")
	public void verify_address_detailes_and_review_your_order() {
		Assert.assertTrue(webDriver.findElement(By.xpath("//h2[normalize-space()='Address Details']")).isDisplayed());
		Assert.assertTrue(webDriver.findElement(By.xpath("//h2[normalize-space()='Review Your Order']")).isDisplayed());

	}
	@When("Enter description in comment text area and click place order")
	public void enter_description_in_comment_text_area_and_click_place_order() {
		page.setDescription("First Order");
		  page.clickplaceorder();
	}
	@When("Enter payment detailes NameOnCard {string} , cardNumber {string} , cvc {string} , expireyMonth {string} , expireYear {string}")
	public void enter_payment_detailes_name_on_card_card_number_cvc_expirey_month_expire_year(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
			   
			
			page.setCardName(string);
			
			page.setCardNumber(string2);
			
			page.setCardNumberCVC(string3);
			
			page.setExpireMonth(string4);
			
			page.setExpireYear(string5);
	}
	@When("Click pay and confirm order button")
	public void click_pay_and_confirm_order_button() {
		page.onClickPayConfirm();
	}
	@Then("check the success message displayed")
	public void check_the_success_message_displayed() {
		Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id='form']/div/div/div/p")).isDisplayed());
	}
	@When("click the continue button after payment done")
	public void click_the_continue_button_after_payment_done() {
		page.clickContinue1();
		
	}
	@Then("Click the Download Invoice button and verify invoice is downloaded successfully")
	public void click_the_download_invoice_button_and_verify_invoice_is_downloaded_successfully() throws InterruptedException {
		 
		scroll.scrollDownByPixel(webDriver, 800);
	
		page.clickDownloadInvoice();
		Thread.sleep(3000);
	}
		
	
	
	@When("Clicked the delete account button")
	public void clicked_the_delete_account_button() {
		page.clickDelete();
	}
	@Then("Checked the ACCOUNT DELETED! is visible")
	public void checked_the_account_deleted_is_visible() {
		Assert.assertTrue(webDriver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed());
		System.out.println("Account Deleted");
	}
	@Then("Clicked the continue button")
	public void clicked_the_continue_button() {
		page.clickContinue1();
		   
		   String expectedUrl = "https://automationexercise.com/";
			if(webDriver.getCurrentUrl().equals(expectedUrl)) {
				ScreenshotUtility.capturePassScreenshot(webDriver, "RegisterwhileCheckout1");
			}else {
				ScreenshotUtility.captureFailScreenshot(webDriver, "FailRegisterwhileCheckout1");
			}
	}


	

}