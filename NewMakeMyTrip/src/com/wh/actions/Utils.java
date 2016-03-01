package com.wh.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wh.testdata.Config;

public class Utils 
{
	private WebDriver webDriver;
	
	public Utils(WebDriver webDriver) 
	{
		this.webDriver = webDriver;
	}
	
	public void wait(int seconds)
	{
		try 
		{
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void waitFor(int seconds, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(webDriver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void closeBrowser()
	{
		webDriver.quit(); // will close the firefox.	
	}
	
	public static WebElement findElement(WebDriver webDriver, String locator, Config.LOCATOR_TYPE locatorType)
	{
		By by = null;

		switch(locatorType)
		{
		case XPATH : by = By.xpath(locator); break;
		case ID : by = By.xpath(locator); break;
		case NAME : by = By.xpath(locator); break;
		case CLASS : by = By.xpath(locator); break;
		default: break;
		}
		
		try 
		{
			WebElement webElement = webDriver.findElement(by);
			return webElement;

		} catch (NoSuchElementException e) 
		{
			System.out.println("Can't find element: " + locator);
			System.out.println("Error: " + e.getMessage());
		}
		catch (Exception e) 
		{
			System.out.println("Error while locating: " + locator);
			System.out.println("Error: " + e.getMessage());
		}

		return null;
	}
}
