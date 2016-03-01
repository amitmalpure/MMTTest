package com.wh.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BetSlipPage 
{
	public static WebElement getStakeTxtElement(WebDriver webDriver)
	{
		WebElement webElement = webDriver.findElement(By.id("UnitStake-1"));
		return webElement;
	}

	public static WebElement getConfirmBetBtnElement(WebDriver webDriver)
	{
		WebElement webElement = webDriver.findElement(By.id("bs_confirm"));
		return webElement;
	}
}
