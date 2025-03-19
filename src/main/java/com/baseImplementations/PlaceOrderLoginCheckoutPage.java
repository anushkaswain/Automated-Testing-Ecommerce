package com.baseImplementations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.basePage.BasePage;

public class PlaceOrderLoginCheckoutPage extends BasePage {

	WebDriver webdriver;
    private WebDriverWait wait;
    Actions action;
    JavascriptExecutor js; 
    

    public PlaceOrderLoginCheckoutPage(WebDriver webdriver) {
        super(webdriver);
        this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10));
        this.action= new Actions(webdriver);
        this.js= (JavascriptExecutor) webdriver;
        
        PageFactory.initElements(webdriver, this);
       
        
    }

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement signupLoginButton;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmailField;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement loginPasswordField;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    WebElement loggedInAsUser;

  
    
    @FindBy(xpath = "//a[text()=' Cart']")
    WebElement cartButton;
    
    @FindBy(xpath = "//div[@class='col-sm-4'][2]")
    WebElement elementToCartButton;
    
    @FindBy(xpath = "//u[text()='View Cart']")
    WebElement viewcartButton;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//textarea[@name='message']")
    WebElement orderCommentBox;

    @FindBy(xpath = "//a[text()='Place Order']")
    WebElement placeOrderButton;

    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement nameOnCardField;

    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumberField;

    @FindBy(xpath = "//input[@name='cvc']")
    WebElement cvcField;

    @FindBy(xpath = "//input[@name='expiry_month']")
    WebElement expiryMonthField;

    @FindBy(xpath = "//input[@name='expiry_year']")
    WebElement expiryYearField;

    @FindBy(xpath = "//button[contains(text(),'Pay and Confirm Order')]")
    WebElement payAndConfirmButton;

    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your order has been confirmed!')]")
    WebElement orderSuccessMessage;

    public void clickSignUpLogin() {
    	
    	
        js.executeScript("arguments[0].click();", signupLoginButton);
		
        //signupLoginButton.click();
    }

    public void enterLoginCredentials(String email, String password) {
        loginEmailField.clear();
        loginEmailField.sendKeys(email);
        loginPasswordField.clear();
        loginPasswordField.sendKeys(password);
    }

    public void clickLoginButton() {
    	
        js.executeScript("arguments[0].click();", loginButton);
		
        //loginButton.click();
    }

    public void verifyLoginSuccess() {
        wait.until(ExpectedConditions.visibilityOf(loggedInAsUser));
    }

    public void clickCart() throws InterruptedException {
    	
    	  js.executeScript("arguments[0].click();", cartButton);

          Thread.sleep(2000);
    
//       
//        js.executeScript("arguments[0].click();", elementToCartButton);
//
//        Thread.sleep(2000);
//
//       
//        
//        js.executeScript("arguments[0].click();", viewcartButton);
//
//        Thread.sleep(4000);
    	
//    	
//        
//		action.moveToElement(elementToCartButton);
//		wait.until(ExpectedConditions.elementToBeClickable(elementToCartButton)).click();
//		Thread.sleep(2000);
//		
//		action.moveToElement(viewcartButton);
//		wait.until(ExpectedConditions.elementToBeClickable(viewcartButton));
//		action.click()
//		      .perform();
//		
//		Thread.sleep(2000);
//    	
    }

    public void clickProceedToCheckout() throws InterruptedException {
    	
    	
        js.executeScript("arguments[0].click();", proceedToCheckoutButton);
        Thread.sleep(4000);
		
        //proceedToCheckoutButton.click();
    }

    public void enterOrderComment(String comment) {
        orderCommentBox.sendKeys(comment);
    }

    public void clickPlaceOrder() {
    	
    	
        js.executeScript("arguments[0].click();", placeOrderButton);
       // placeOrderButton.click();
    }

    public void enterPaymentDetails(String name, String cardNumber, String cvc, String month, String year) {
        nameOnCardField.sendKeys(name);
        cardNumberField.sendKeys(cardNumber);
        cvcField.sendKeys(cvc);
        expiryMonthField.sendKeys(month);
        expiryYearField.sendKeys(year);
    }

    public void clickPayAndConfirmOrder() {
        js.executeScript("arguments[0].click();", payAndConfirmButton);
        //payAndConfirmButton.click();
    }

    public void verifyOrderSuccess() {
        wait.until(ExpectedConditions.visibilityOf(orderSuccessMessage));
    }

//	public void verifyHomePage() {
//		// TODO Auto-generated method stub
//		
//	}

	public void verifyCheckoutDetails() throws InterruptedException {
		   

		
		    WebElement addressDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Address Details']")));
		    WebElement reviewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Review Your Order']")));

		    if (addressDetails.isDisplayed() && reviewOrder.isDisplayed()) {
		        System.out.println("Checkout details are visible.");
		    } else {
		        System.out.println("Checkout details are NOT visible!");
		    }
		 
		    Thread.sleep(2000);
		}

		
	}

