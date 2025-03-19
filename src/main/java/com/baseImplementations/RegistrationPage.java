
package com.baseImplementations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basePage.BasePage;

public class RegistrationPage extends BasePage {

    private WebDriver webdriver;
    private WebDriverWait wait;

    public RegistrationPage(WebDriver webdriver) {
        super(webdriver);
        this.webdriver = webdriver;
        this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10)); 
        PageFactory.initElements(webdriver, this);
    }

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement signupWebElement;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    WebElement newUserWebElement;

    @FindBy(xpath="//input[@data-qa = 'signup-name']")
    WebElement nameWebElement;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailWebElement;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signupButtonWebElement;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    WebElement enterAccInfoWebElement;

    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement titleWebElement;

    @FindBy(xpath = "//input[@data-qa='password']")
    WebElement passwordWebElement;

    @FindBy(id = "days")
    WebElement daysWebElement;

    @FindBy(id = "months")
    WebElement monthWebElement;

    @FindBy(xpath = "//select[@data-qa='years']")
    WebElement yearWebElement;

    @FindBy(id = "newsletter")
    WebElement newsLetterWebElement;

    @FindBy(id = "optin")
    WebElement optionWebElement;

    @FindBy(id = "first_name")
    WebElement firstnameWebElement;

    @FindBy(id = "last_name")
    WebElement lastnameWebElement;

    @FindBy(id = "address1")
    WebElement addressWebElement;

    @FindBy(id = "country")
    WebElement countryWebElement;

    @FindBy(id = "state")
    WebElement stateWebElement;

    @FindBy(id = "city")
    WebElement cityWebElement;

    @FindBy(id = "zipcode")
    WebElement zipcodeWebElement;

    @FindBy(id = "mobile_number")
    WebElement mobileWebElement;

    
    @FindBy(xpath="//button[@data-qa='create-account']")
    WebElement creatAccountButtonWebElement;

    
    
    @FindBy(xpath="//a[@data-qa='continue-button']")
    WebElement continueButtonWebElement;

    @FindBy(xpath="//b[text()='anushka']")
    WebElement loggedinasUsernameElement;

    @FindBy(xpath="//a[contains(@href, 'delete_account')]")
    WebElement deleteAccountButtonElement;
    
    @FindBy(xpath="//a[text()='Continue']")
    WebElement continueButtonElement;
    
    
    
    public void clickSignUp() {
        signupWebElement.click();
    }

    public boolean isNewUserSignUpVisible() {
        return newUserWebElement.isDisplayed();
    }

    public void enterNameandEmail(String name, String email) {
    	JavascriptExecutor js = (JavascriptExecutor) webdriver;

    	WebElement nameWebElement = webdriver.findElement(By.xpath("//input[@data-qa = 'signup-name']"));
    	WebElement emailWebElement = webdriver.findElement(By.xpath("//input[@data-qa='signup-email']"));

    	
    	js.executeScript("arguments[0].value='anushka';", nameWebElement);
    	js.executeScript("arguments[0].value='anushkaswain0@gmail.com';", emailWebElement);

    }

    public void clickNewSignUp() {
        signupButtonWebElement.click();
    }

    public boolean isEnterAccountVisible() {
        return enterAccInfoWebElement.isDisplayed();
    }

    public void entertitle() 
    {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(optionWebElement)).click();
        
    }

    public void enterPassword(String pass) 
    {
//        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(passwordWebElement)); 
        JavascriptExecutor js = (JavascriptExecutor) webdriver;
        js.executeScript("arguments[0].click();", passwordWebElement);
        js.executeScript("arguments[0].value='anu123';", passwordWebElement);
    }

    public void clickNews() {
    	   wait.until(ExpectedConditions.elementToBeClickable(newsLetterWebElement)).click();
    }

    public void clickoptionWebElement() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(optionWebElement)).click();
    }

    public void enterUserDetails(String day, String month, String year, String firstname, String lastname, String address, String country, String state, String city, String zipcode, String mobNo) {
        
    	daysWebElement.sendKeys("15");
        monthWebElement.sendKeys("May");
        yearWebElement.sendKeys("2000");
        firstnameWebElement.sendKeys("Anushka");
        lastnameWebElement.sendKeys("Swain");
        addressWebElement.sendKeys("123 Main St");
        countryWebElement.sendKeys("India");
        stateWebElement.sendKeys("Odisha");
        cityWebElement.sendKeys("Bhubaneshwar");
        zipcodeWebElement.sendKeys("90001");
        mobileWebElement.sendKeys("1234567890");
    }

    public void clickCreateAccount() {
    	
    	 JavascriptExecutor js = (JavascriptExecutor) webdriver;
         js.executeScript("arguments[0].click();", creatAccountButtonWebElement);
      
    }
    
    
    public void clickContinue() {
//    	wait.until(ExpectedConditions.elementToBeClickable(continueButtonWebElement));
    	 JavascriptExecutor js = (JavascriptExecutor) webdriver;
         js.executeScript("arguments[0].click();", continueButtonWebElement);
      
    	
    }
    
    public void clickDelAcc()
    
    {
    	
    	 JavascriptExecutor js = (JavascriptExecutor) webdriver;
         js.executeScript("arguments[0].click();", deleteAccountButtonElement);
      
    	//wait.until(ExpectedConditions.elementToBeClickable(deleteAccountButtonElement));
    	//deleteAccountButtonElement.click();
    }
    
    public void clickContinueButton()
    {
    	JavascriptExecutor js = (JavascriptExecutor) webdriver;
        js.executeScript("arguments[0].click();", continueButtonElement);
//    	wait.until(ExpectedConditions.elementToBeClickable(continueButtonElement));
    	//continueButtonElement.click();
    }
}





