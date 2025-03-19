package com.screenshotUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	
public static void capturePassScreenshot(WebDriver webDriver , String screenshot_name) {
		
		String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String path = System.getProperty("user.dir")+ "./NEW_PassScreenshots/" + screenshot_name + currentDate + ".jpg";
		
		TakesScreenshot ts  = (TakesScreenshot) webDriver;
		
		File source  = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void captureFailScreenshot(WebDriver webDriver , String screenshot_name) {
		
		String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String path = System.getProperty("user.dir")+ "./NEW_FailScreenshots/" + screenshot_name + currentDate + ".jpg";
		
		TakesScreenshot ts  = (TakesScreenshot) webDriver;
		
		File source  = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	}

      



