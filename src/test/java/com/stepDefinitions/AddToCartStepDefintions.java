package com.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.AddToCartPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDefintions {

	WebDriver webDriver ;
	AddToCartPage page;
	WebDriverWait wait;

	@Given("Iam in the home page")
	public void iam_in_the_home_page() throws InterruptedException {
	    
		webDriver= HooksRegistration.getDriver();
		page = new AddToCartPage(webDriver);
		wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
		
		 
		WebElement home = webDriver.findElement(By.xpath("//a[normalize-space()='Home']"));
		wait.until(ExpectedConditions.visibilityOf(home));
		Assert.assertTrue(home.isDisplayed());
		 
		System.out.println("user is on home page");
		
		
	}

	
	
	@When("Click on the product button")
	public void click_on_the_product_button() throws InterruptedException {
		page.clickonProducts();
		Thread.sleep(2000);
	}
	
	
	@When("click on the first product to cart and click continue")
	public void click_on_the_first_product_to_cart_and_click_continue() throws InterruptedException {
		
		Thread.sleep(2000);
		
		page.clickHoverProduct1();
		Thread.sleep(1000);
		
		page.clickContinue();
		Thread.sleep(2000);
	}

	@When("Click on the second product to cart and click continue")
	public void click_on_the_second_product_to_cart_and_click_continue() throws InterruptedException {
		page.clickHoverProduct2();
		page.clickContinue();
		Thread.sleep(2000);
	}

	@When("Click on the view cart button")
	public void click_on_the_view_cart_button() throws InterruptedException {
	   Thread.sleep(3000);
		page.clickViewCart();
	}

	@Then("Check the products are added")
	public void check_the_products_are_added() {
	   
		WebElement table = webDriver.findElement(By.id("cart_info_table"));
		Assert.assertTrue(table.isDisplayed());
	}

	@Then("Check the prices and quantity and product name")
	public void check_the_prices_and_quantity_and_product_name() {
	   
		WebElement prod1 = webDriver.findElement(By.xpath("//a[normalize-space()='Blue Top']"));
		String prodname1 = prod1.getText();
		System.out.println("Product 1 name : " + prodname1);
		
		WebElement price1 = webDriver.findElement(By.xpath("//td[@class='cart_price']//p[contains(text(),'Rs. 500')]"));
		String pricetag1 = price1.getText();
		System.out.println("Product 1 price : " + pricetag1);
		
		WebElement quantity1 = webDriver.findElement(By.xpath("//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']"));
		String prodquantity1 = quantity1.getText();
		System.out.println("Product 1 quantity : " + prodquantity1);
		
		WebElement prod2 = webDriver.findElement(By.xpath("//a[normalize-space()='Men Tshirt']"));
		String prodname2 = prod2.getText();
		System.out.println("Product 2 name : " + prodname2);
		
		WebElement price2 = webDriver.findElement(By.xpath("//td[@class='cart_price']//p[contains(text(),'Rs. 400')]"));
		String pricetag2 = price2.getText();
		System.out.println("Product 2 price : " + pricetag2);
		
		WebElement quantity2 = webDriver.findElement(By.xpath("//tr[@id='product-2']//button[@class='disabled'][normalize-space()='1']"));
		String prodquantity2 = quantity2.getText();
		System.out.println("Product 2 quantity : " + prodquantity2);
		
		String expectedUrl = "https://automationexercise.com/view_cart";
		if(webDriver.getCurrentUrl().equals(expectedUrl)) {
			ScreenshotUtility.capturePassScreenshot(webDriver, "AddToCart3");
		}else {
			ScreenshotUtility
			.captureFailScreenshot(webDriver, "FailedAddToCart3");
		}
		
	}


}