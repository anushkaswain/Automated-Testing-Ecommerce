package com.screenshotUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Hooks.HooksRegistration;

public class ScrollingUtilities {
	

		WebDriver driver = HooksRegistration.getDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		public void scrollToButtom() {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		public void scrollDownByPixel(String pixel) {
			js.executeScript("window.scrollBy(0, arguments[0])",pixel);
		}
		public void scrollTopOfPage() {
			js.executeScript("window.scrollTo(0,0)");
		}
		
		}
		
	


