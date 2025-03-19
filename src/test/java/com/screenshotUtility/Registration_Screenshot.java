package com.screenshotUtility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Hooks.HooksRegistration;

public class Registration_Screenshot extends HooksRegistration {

	
WebDriver webdriver ;
	
	@BeforeClass
	public void setup()
	{
		webdriver= getDriver();
	}
    
	@Test
	public  void screenshotMethod() {
    TakesScreenshot screenshot = (TakesScreenshot) webdriver;
    
    File source= screenshot.getScreenshotAs(OutputType.FILE);
    
    File destination = new File("src\\test\\java\\screenshots\\RegistrationScreenshot.jpg");
    
    try {
        FileUtils.copyFile(source, destination);
        System.out.println("Screenshot saved: " + destination.getAbsolutePath());
    } catch (IOException e) {
        System.out.println("Failed to save screenshot: " + e.getMessage());
    }

   
    webdriver.quit();
}

}
