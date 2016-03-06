package com.wh.actions;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wh.pageobjects.HomePage;
import com.wh.pageobjects.RaceCardPage;

public class RaceCardActions
{
	private WebDriver webDriver;
	
	public RaceCardActions(WebDriver webDriver) 
	{
		this.webDriver = webDriver;
	}

	public void clickHorseRacingTab()
	{
		HomePage.getHorseRacingTabElement(webDriver).click();
	}
	
	public boolean selectRaceCard(String track, int race)
	{
		track = track.toLowerCase();
		
		WebElement webElement = RaceCardPage.getRaceCardElement(webDriver, track, race);
		
		if(webElement == null || !webElement.isEnabled())
		{
			JOptionPane.showMessageDialog(null, track + " is not  open currently. Please selct another race.");
			return false;
		}
		
		webElement.click();
		return true;
	}
	
	public void clickPricetoPlace(String priceToPlace)
	{
		WebElement webElement = RaceCardPage.getPricetoPlaceElement(webDriver, priceToPlace);
		
		if(webElement == null || !webElement.isEnabled())
		{
			JOptionPane.showMessageDialog(null, "Price to place not found!");
		}
		
		webElement.click();
	}
	
	public void clickBetSlipButton()
	{
		RaceCardPage.getBetSlipButtonElement(webDriver).click();
	}	
}