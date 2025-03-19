package com.stepDefinitions;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Hooks.HooksRegistration;
import com.baseImplementations.ContactUsFormPage;
import com.screenshotUtility.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsFormSelfDefinition {

    WebDriver webDriver = HooksRegistration.getDriver();
    ContactUsFormPage form = new ContactUsFormPage(webDriver);

    @Given("I am on the Automation Exercise home page")
    public void i_am_on_the_automation_exercise_home_page() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement home = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Home']")));
        Assert.assertTrue(home.isDisplayed(), "Home button is not visible!");
    }

    @When("I click on the Contact Us button")
    public void i_click_on_the_contact_us_button() {
        form.clickConatctUs();
    }

    @Then("Verify Get in Touch section is visible")
    public void verify_get_in_touch_section_is_visible() {
        WebElement section = webDriver.findElement(By.xpath("//h2[normalize-space()='Get In Touch']"));
        Assert.assertTrue(section.isDisplayed());
    }

    @When("I enter the name {string} and email {string} and subject {string} and message {string}")
    public void i_enter_the_name_and_email_and_subject_and_message(String name, String email, String subject, String message) {
        form.setName(name);
        form.setEmail(email);
        form.setSubject(subject);
        form.setMessage(message);

        System.out.println("Entered Name: " + name);
        System.out.println("Entered Email: " + email);
        System.out.println("Entered Subject: " + subject);
        System.out.println("Entered Message: " + message);
    }

    @When("I upload a file {string}")
    public void i_upload_a_file(String filePath) throws InterruptedException {
        if (filePath != null && !filePath.isEmpty()) {
            form.chooseFile(filePath);
            System.out.println("File uploaded: " + filePath);
            Thread.sleep(2000);
        } else {
            System.out.println("File path is empty or null!");
        }
    }

    @When("I click the Submit button")
    public void i_click_the_submit_button() {
        WebElement submitButton = webDriver.findElement(By.xpath("//input[@name='submit']"));

        if (submitButton.isEnabled()) {
            System.out.println("Submit button is enabled. Clicking now...");
            form.clickSubmit();
        } else {
            System.out.println("Submit button is disabled! Please check required fields.");
        }
    }

    @When("I click the OK button on the confirmation dialog")
    public void i_click_the_ok_button_on_the_confirmation_dialog() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    @Then("Verify success message is visible")
    public void verify_success_message_is_visible() {
        WebElement successMessage = webDriver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        Assert.assertTrue(successMessage.isDisplayed(), "Success message is not displayed!");
    }

    @When("I click the Home button")
    public void i_click_the_home_button() {
        form.clickHome();
    }

    @Then("I should be navigated to home page successfully")
    public void i_should_be_navigated_to_home_page_successfully() {
        String expectedUrl = "https://automationexercise.com/";
        if (webDriver.getCurrentUrl().equals(expectedUrl)) {
            ScreenshotUtility.capturePassScreenshot(webDriver, "PassContactUs2");
        } else {
            ScreenshotUtility.captureFailScreenshot(webDriver, "Failed2");
        }
    }
}
