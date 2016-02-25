package com.mmt1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class MMTTestImpl implements IMMTTest
{
	WebDriver webDriver;
	
	public void executeTest()
	{
		webDriver = Initiator.launch();
		
		closeDashBoardAdd();
		selectFlightsTab();
		selectOneWayFlights();
		setSource();
		setDestination();
		selectStartDate();
		selectAirline();
		searchFlights();
		waitFor(20, getBookBtnElement());
		//wait(20);
		clickBookBtn();
		closeBrowser();
		
	}
	
	public abstract void closeDashBoardAdd();
	public abstract void selectFlightsTab();
	public abstract void selectOneWayFlights();
	public abstract void setSource();
	public abstract void setDestination();
	public abstract void selectStartDate();
	public abstract void selectAirline();
	public abstract void searchFlights();
	public abstract void wait(int seconds);
	public abstract void waitFor(int seconds, WebElement webElement);
	public abstract WebElement getBookBtnElement();
	public abstract void clickBookBtn();
	public abstract void closeBrowser();
}