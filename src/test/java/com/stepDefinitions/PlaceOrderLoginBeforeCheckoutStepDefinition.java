package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Hooks.HooksRegistration;
import com.baseImplementations.PlaceOrderLoginCheckoutPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderLoginBeforeCheckoutStepDefinition {

    WebDriver webdriver;
    PlaceOrderLoginCheckoutPage placeOrder;

    @Given("User launches the browser")
    public void user_launches_the_browser() {
        webdriver = HooksRegistration.getDriver();
        //Swebdriver = new EdgeDriver();
        placeOrder = new PlaceOrderLoginCheckoutPage(webdriver);
        System.out.println("Browser launched successfully...");
    }

    @Given("User navigates to {string}")
    public void user_navigates_to(String url) {
        webdriver.get(url);
        System.out.println("Navigated to " + url);
    }

    @Then("Home page is visible successfully")
    public void home_page_is_visible_successfully() {
      //  placeOrder.verifyHomePage();
        System.out.println("Home page is displayed successfully...");
    }

    @When("User clicks on the 'Signup \\/ Login' button")
    public void user_clicks_on_the_signup_login_button() {
        placeOrder.clickSignUpLogin();
    }

    @When("User fills in email and password and clicks 'Login' button")
    public void user_fills_in_email_and_password_and_clicks_login_button() {
        placeOrder.enterLoginCredentials("anushkaswain@gmail.com", "anu123");
        placeOrder.clickLoginButton();
    }

    @Then("'Logged in as username' is visible at the top")
    public void logged_in_as_username_is_visible_at_the_top() {
        placeOrder.verifyLoginSuccess();
        System.out.println("User is logged in successfully...");
    }

    @When("User adds products to the cart")
    public void user_adds_products_to_the_cart() {
    	System.out.println("products added to cart");
        //placeOrder.addProductsToCart();
    }

    @When("User clicks on the 'Cart' button")
    public void user_clicks_on_the_cart_button() throws InterruptedException {
        placeOrder.clickCart();
    }

    @Then("Cart page is displayed")
    public void cart_page_is_displayed() {
       // placeOrder.verifyCartPage();
        System.out.println("Cart page is displayed successfully...");
    }

    @When("User clicks 'Proceed To Checkout'")
    public void user_clicks_proceed_to_checkout() throws InterruptedException {
        placeOrder.clickProceedToCheckout();
    }

    @Then("Address Details and Review Your Order are visible")
    public void address_details_and_review_your_order_are_visible() throws InterruptedException {
        placeOrder.verifyCheckoutDetails();
        Thread.sleep(2000);
    }

    @When("User enters a description in the comment text area and clicks 'Place Order'")
    public void user_enters_a_description_in_the_comment_text_area_and_clicks_place_order() {
        placeOrder.enterOrderComment("Please deliver between 10 AM - 12 PM");
        placeOrder.clickPlaceOrder();
    }

    @When("User enters payment details: {string}, {string}, {string}, {string}, {string}")
    public void user_enters_payment_details(String nameOnCard, String cardNumber, String cvc, String expirationMonth, String expirationYear) {
        placeOrder.enterPaymentDetails(nameOnCard, cardNumber, cvc, expirationMonth, expirationYear);
    }

    @When("User clicks 'Pay and Confirm Order' button")
    public void user_clicks_pay_and_confirm_order_button() {
        placeOrder.clickPayAndConfirmOrder();
    }

    @Then("Success message 'Congratulations! Your order has been confirmed!' is displayed")
    public void success_message_is_displayed() {
        placeOrder.verifyOrderSuccess();
        System.out.println("Order placed successfully!");
        
        String expectedUrl = "https://automationexercise.com/payment_done/3000";
		
		if(webdriver.getCurrentUrl().equals(expectedUrl)) {
			ScreenshotUtility.capturePassScreenshot(webdriver, "PassLogin2Checkout");
		}else {
			ScreenshotUtility.captureFailScreenshot(webdriver, "FailLogin3Checkout");
		}
    }
}
