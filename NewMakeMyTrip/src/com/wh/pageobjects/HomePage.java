package com.wh.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	public static WebElement getHorseRacingTabElement(WebDriver webDriver)
	{												
		WebElement webElement = webDriver.findElement(By.xpath("//a[@data-gaq-id='Horse Racing']"));
		return webElement;
	}
}
