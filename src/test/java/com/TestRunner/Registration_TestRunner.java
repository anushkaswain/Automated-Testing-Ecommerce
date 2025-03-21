package com.TestRunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features= {"src/test/resources/Features"},
		glue= {"com.stepDefinitions", "com.Hooks"},
	   tags="@placeOrder",
				  plugin = {
				          "pretty",
				          "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
				  },
				  monochrome = true		
		
		)
		

public class Registration_TestRunner extends AbstractTestNGCucumberTests{

	public static String browser;
	public static String appUrl;
	
	 @BeforeTest
	    @Parameters
	    ({"browser","url"})
	    public void setup(String browserParam, String urlParam) {
	    	browser=browserParam;
	    	appUrl=urlParam;
	    	
	    }


	}

