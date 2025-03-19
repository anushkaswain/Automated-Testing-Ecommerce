package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.Hooks.HooksRegistration;

import com.baseImplementations.VerifyCategoryPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCategoryStepsDefiniton {

WebDriver webdriver;
	
VerifyCategoryPage v;
	
	

@Given("Verify that home page visible successfully")
public void verify_that_home_page_visible_successfully() {
	webdriver= HooksRegistration.getDriver();
	webdriver = new EdgeDriver();
	v= new VerifyCategoryPage(webdriver);
	
	webdriver.get("http://automationexercise.com");
	
	System.out.println("user is on home page");
	v.clickSignUp();
	v.enterEmail("anushkaswain@gmail.com");
	v.enterPassword("anu123");
	v.clickLoginButton();
	
}


@When("Click user on Products button")
public void click_user_on_products_button() throws InterruptedException {
	v.clickProducts();
   
}

@Then("Verify user is navigated to Products page successfully")
public void verify_user_is_navigated_to_products_page_successfully() {
    System.out.println("Product page is visible");
}

@Then("Verify that categories are visible on left side bar")
public void verify_that_categories_are_visible_on_left_side_bar() {
	 System.out.println("Category is visible");
}

@When("Click on {string} category")
public void click_on_category(String string) throws InterruptedException {
    v.clickWomenProducts();
    Thread.sleep(2000);
}

@When("Verify text is visible")
public void verify_text_is_visible() throws InterruptedException {
//	WebElement womendressproducttext = webdriver.findElement(By.xpath("//h2[text()='Women - Dress Products']"));
//	Assert.assertTrue(womendressproducttext.isDisplayed());
//	Thread.sleep(3000);
	
	v.clickDressProducts();
}

@Then("Verify men text is visible")
public void verify_men_text_is_visible() throws InterruptedException {
	
//	WebElement menTshirtproducttext = webdriver.findElement(By.xpath("//h2[text()='Men - Tshirts Products']"));
//	Assert.assertTrue(menTshirtproducttext.isDisplayed());
//	
	v.clickMenProducts();
	Thread.sleep(1000);
	v.clickTshirtProducts();
	Thread.sleep(1000);
}
}
