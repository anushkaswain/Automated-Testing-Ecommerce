package com.baseImplementations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePage.BasePage;



public class RegistrationWhileCheckoutPage extends BasePage{

	WebDriver webDriver;
	JavascriptExecutor js;
	public RegistrationWhileCheckoutPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
		this.js = (JavascriptExecutor) webDriver;
		PageFactory.initElements(webDriver , this);
	}
	
	@FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]")
	WebElement hoverproductWebElement1;
	@FindBy(xpath = "//a[@data-product-id = '1']")
	WebElement productWebElement1;
	public void clickHoverProduct1() throws InterruptedException {
		
		Actions action = new Actions(webDriver);
		
		action.moveToElement(hoverproductWebElement1)
		.moveToElement(productWebElement1)
		.click()
		.perform();
		
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "//*[@id='cartModal']/div/div/div[2]/p[2]/a/u")
	WebElement viewcartWebElement;
	public void clickViewCart() {
		onClick(viewcartWebElement);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	WebElement proceedToCheckoutWebElement;
	public void clickProceedToCheckout() {
		onClick(proceedToCheckoutWebElement);
	}
	
	@FindBy(xpath = "//u[normalize-space()='Register / Login']")
	WebElement registerloginWebElement;
	public void clickRegisterLogin() {
		onClick(registerloginWebElement);
	}
	
	@FindBy(xpath = "//input[@data-qa = 'signup-name']")
	WebElement usernameWebElement;
	public void setUsername(String uname) {
		enterText(usernameWebElement, uname);
	}
	
	@FindBy(xpath = "//input[@data-qa= 'signup-email']")
	WebElement emailWebElement;
	public void setEmail(String email) {
		enterText(emailWebElement, email);
	}
	
	@FindBy(xpath = "//button[@data-qa= 'signup-button']")
	WebElement signinWebElement;
	public void clickSignin() {
		onClick(signinWebElement);
	}
	

	@FindBy(id = "id_gender1")
	WebElement radioWebElement;
	public void setGender() {
		onClick(radioWebElement);
	}

	@FindBy(id = "password")
	WebElement passwordWebElement;
	public void setPassword(String password) {
		enterText(passwordWebElement, password);
	}
	
	
	@FindBy(id = "days")
	WebElement dateWebElement;
	public void setDate(String date) {
		enterText(dateWebElement, date);
	}
	

	@FindBy(id = "months")
	WebElement monthsWebElement;
	public void setMonths(String months) {
		enterText(monthsWebElement, months);
	}
	
	@FindBy(id = "years")
	WebElement yearsWebElement;
	public void setYears(String years) {
		enterText(yearsWebElement, years);
	}
	
	@FindBy(id = "newsletter")
	WebElement newsletterWebElement;
	public void clickNewsletter() {
		 js.executeScript("arguments[0].click();", newsletterWebElement);
		//onClick(newsletterWebElement);
	}
	
	@FindBy(id = "optin")
	WebElement specialWebElement;
	public void clickSpecial() {
		 js.executeScript("arguments[0].click();", specialWebElement);
		//onClick(specialWebElement);
	}
	
	@FindBy(id = "first_name")
	WebElement firstnameWebElement;
	public void setFirstname(String firstname) {
		enterText(firstnameWebElement, firstname);
	}
	
	
	@FindBy(id = "last_name")
	WebElement lastnameWebElement;
	public void setLastname(String lastname) {
		enterText(lastnameWebElement, lastname);
	}
	
	
	@FindBy(id = "company")
	WebElement companyWebElement;
	public void setCompany(String company) {
		enterText(companyWebElement, company);
	}
	
	
	@FindBy(id = "address1")
	WebElement addressWebElement1;
	public void setAddress1(String address1) {
		enterText(addressWebElement1, address1);
	}
	
	@FindBy(id = "address2")
	WebElement addressWebElement2;
	public void setAddress2(String address2) {
		enterText(addressWebElement2, address2);
	}
	
	
	@FindBy(id = "state")
	WebElement stateWebElement;
	public void setState(String state) {
		enterText(stateWebElement, state);
	}
	
	@FindBy(id = "city")
	WebElement cityWebElement;
	public void setCity(String city) {
		enterText(cityWebElement, city);
	}
	
	@FindBy(id = "zipcode")
	WebElement zipcodeWebElement;
	public void setZipcode(String zipcode) {
		enterText(zipcodeWebElement, zipcode);
	}
	
	@FindBy(id = "mobile_number")
	WebElement mobilenumberWebElement;
	public void setMobileNumber(String mobile_number) {
		enterText(mobilenumberWebElement , mobile_number);
	}
	
	@FindBy(xpath = "//button[@data-qa = 'create-account']")
	WebElement createWebElement;
	public void clickCreate() {
		 js.executeScript("arguments[0].click();", createWebElement);
		
	}
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement cartWebElement;
	public void clickCart() {
		 js.executeScript("arguments[0].click();", cartWebElement);
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Delete Account']")
	WebElement clickDeleteWebElement;
	public void clickDelete() {
		 js.executeScript("arguments[0].click();", clickDeleteWebElement);
		
	}
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement clickContinueWebElement1;
	public void clickContinue1() {
		onClick(clickContinueWebElement1);
	}
	
	@FindBy(xpath = "//textarea[@name='message']")
	WebElement descriptionWebElement;
	public void setDescription(String description) {
		enterText(descriptionWebElement , description);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	WebElement placeorderWebElement1;
	public void clickplaceorder() {
		onClick(placeorderWebElement1);
	}
	

	@FindBy(xpath = "//textarea[@name='message']")
	WebElement nameWebElement;
	public void setName(String name) {
		enterText(nameWebElement , name);
	}

	@FindBy(name = "name_on_card")
	WebElement nameOnCardElement;
	public void setCardName(String name){
		  enterText(nameOnCardElement, name);
	  }

	
	@FindBy(name = "card_number")
	WebElement cardNumberElement;
	public void setCardNumber(String cardno){
		  enterText(cardNumberElement, cardno);
	  }
	
	@FindBy(name = "cvc")
	WebElement cvcElement;
	public void setCardNumberCVC(String cardcvc){
		  enterText(cvcElement, cardcvc);
	  }
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[2]/input")
	WebElement expireMonthElement;
	public void setExpireMonth(String exp){
		  enterText(expireMonthElement, exp);
	  }
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[3]/input")
	WebElement expireYearElement;
	public void setExpireYear(String year){
		  enterText(expireYearElement, year);
	  }
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement payConfirmElement;
	public void onClickPayConfirm(){
		  onClick(payConfirmElement);
	  }
	
	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	WebElement downloadWebElement;
	public void clickDownloadInvoice() {
		
	
        js.executeScript("arguments[0].click();", downloadWebElement);
	    
	}

	

}