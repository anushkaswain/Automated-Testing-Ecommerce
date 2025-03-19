package com.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.TestRunner.Registration_TestRunner;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class HooksRegistration {
	
	public static WebDriver webdriver;
	
	
	@Before
	public void setup() {

		
		System.out.println("Launching browser..");
	String browser=Registration_TestRunner.browser;
	String url=Registration_TestRunner.appUrl;
	
	switch(browser.toLowerCase()) {
	case "edge":
		webdriver=new EdgeDriver();
		break;
	case "chrome":
		webdriver=new ChromeDriver();
		break;
	case "firefox":
		webdriver= new FirefoxDriver();
		break;
	default :
		throw new IllegalArgumentException(browser+" Browser not supported");
	}
	webdriver.get(url);
	
	}
	
	@After
	public void tearDown() {
		webdriver.close();
	}

	public static WebDriver getDriver() {
		
		return webdriver;
	}


	@AfterStep
	public void oneByOne() throws InterruptedException
	{
		Thread.sleep(1000);
	}
	
	
	
	}

	



