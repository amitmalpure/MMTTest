package com.wh.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wh.actions.Utils;
import com.wh.testdata.Config;

public class RaceCardPage 
{
	public static WebElement getRaceCardElement(WebDriver webDriver, String track, int race)
	{
		WebElement webElement = Utils.findElement(webDriver, "//a[contains(@href,'" + track + "-" + race + "')]", Config.LOCATOR_TYPE.XPATH);
		return webElement;
	}
	
	public static WebElement getPricetoPlaceElement(WebDriver webDriver, String priceToPlace)
	{
		WebElement webElement = Utils.findElement(webDriver, "//a[contains(@data-link-pricetoplace,'" + priceToPlace + "')]", Config.LOCATOR_TYPE.XPATH);
		return webElement;
	}
	
	public static WebElement getBetSlipButtonElement(WebDriver webDriver)
	{
		WebElement webElement = Utils.findElement(webDriver, "//a[@id='betslipBadge']", Config.LOCATOR_TYPE.XPATH);
		return webElement;
	}
}