package com.basePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	protected WebDriver webdriver;
	
	public BasePage(WebDriver webdriver)
	{
		this.webdriver= webdriver;
	}
	
	public WebElement findWebElement(By locator)
	{
		return webdriver.findElement(locator);
	}
	
	public List<WebElement> findWebElements(By locator)
	{
		return webdriver.findElements(locator);
	}
	
	
	public void enterText(WebElement element, String text)
	
	{
		element.sendKeys(text);
	}
	
	public void onClick(WebElement element)
	{
		element.click();
	}

}
