package com.mmt1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookFlight extends MMTTestImpl
{
	public void closeDashBoardAdd()
	{
		webDriver.findElement(By.xpath(LocatorMaper.getDashboardLtr())).click();
	}
	
	public void selectFlightsTab()
	{
		webDriver.findElement(By.xpath(LocatorMaper.getFlightstabLtr())).click();
	}
	
	public void selectOneWayFlights()
	{
		webDriver.findElement(By.xpath(LocatorMaper.getOnewaybtnLtr())).click();
	}
	
	public void setSource()
	{
		WebElement webElement = webDriver.findElement(By.id(LocatorMaper.getFromtxtLtr()));
		webElement.clear();
		webElement.sendKeys(DataMaper.getSource());
		webElement.sendKeys(Keys.TAB);
	}
	
	public void setDestination()
	{
		WebElement webElement = webDriver.findElement(By.id(LocatorMaper.getTotxtLtr()));
		webElement.clear();
		webElement.sendKeys(DataMaper.getDestination());
		webElement.sendKeys(Keys.ENTER);
	}
	
	public void selectStartDate()
	{
		webDriver.findElement(By.id(LocatorMaper.getStartdatebtnLtr())).click();
		webDriver.findElement(By.xpath(LocatorMaper.getStartdatevalLtr(DataMaper.getTraveldate()))).click();
	}
	
	public void selectAirline()
	{
		Select select = new Select(webDriver.findElement(By.id(LocatorMaper.getAirlinedropdownLtr())));
		select.selectByVisibleText(DataMaper.getAirlinename());
	}
	
	public void searchFlights()
	{
		webDriver.findElement(By.id(LocatorMaper.getFlightssubmitbtnLtr())).click();
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
	
	public WebElement getBookBtnElement()
	{
		return webDriver.findElements(By.xpath(LocatorMaper.getBookbtnLtr())).get(0);
	}
	
	public void clickBookBtn()
	{
		getBookBtnElement().click(); // Click on first flight Book Button and popup will be shown as confirming flight.
	}
	
	public void closeBrowser()
	{
		webDriver.quit(); // will close the firefox.	
	}
}