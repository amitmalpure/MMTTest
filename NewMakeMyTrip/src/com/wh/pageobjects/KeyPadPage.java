package com.wh.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class KeyPadPage 
{
	private static WebElement getQuickBtnElement(WebDriver webDriver, int amt)
	{
		WebElement webElement = webDriver.findElement(By.xpath("//button[contains(@title,'Quick Bet $" + amt + "')]"));		
		return webElement;
	}

	public static WebElement getQuickBtn20Element(WebDriver webDriver)
	{
		return getQuickBtnElement(webDriver, 20);
	}
	
	public static WebElement getQuickBtn10Element(WebDriver webDriver)
	{
		return getQuickBtnElement(webDriver, 10);
	}
	
	public static WebElement getQuickBtn5Element(WebDriver webDriver)
	{
		return getQuickBtnElement(webDriver, 5);
	}
	
	public static WebElement getQuickBtn1Element(WebDriver webDriver)
	{
		return getQuickBtnElement(webDriver, 1);
	}
	
	public static WebElement getBtnElement(WebDriver webDriver, String amt)
	{
		WebElement webElement = webDriver.findElement(By.xpath("//button[text()='" + amt + "']"));
		return webElement;
	}
	
	public static WebElement getCloseKeyPadBtnElement(WebDriver webDriver)
	{
		WebElement webElement = webDriver.findElement(By.id("kpad-enter"));
		return webElement;
	}

	public static WebElement getBtnElement5(WebDriver webDriver)
	{
		WebElement webElement = webDriver.findElement(By.xpath("(//button[text()='5'])[position()=last()]"));
		
		Assert.assertEquals(webElement.getText(), "5");

		return webElement;
	}
}