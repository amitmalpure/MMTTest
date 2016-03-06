package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.TestException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wh.actions.BetSlipActions;
import com.wh.actions.KeyPadActions;
import com.wh.actions.RaceCardActions;
import com.wh.actions.Utils;
import com.wh.automationFramework.BetImpl;

public class BetAHorseScriptUsinTNG 
{
	private BetImpl betImpl = null;

	@DataProvider
	public Object[][] testData() 
	{
		return new Object[][] 
				{
			new Object[] {"Bunbury", 8, "2.4"},
			new Object[] {"Bunbury", 9, "13"},
				};
	}

    @Parameters({"URL"})
	@BeforeTest
	public void launchBrowser(String url)
	{
		System.out.println("URL : " + url);
		betImpl = new BetImpl();
		betImpl.init(url);
	}

	@AfterTest
	public void closeBrowser() 
	{
		System.out.println("Closing Browser.");
		WebDriver webDriver = betImpl.getWebDriver();
		Utils utils = new Utils(webDriver);
		utils.closeBrowser();

	}
	
	@Test(dataProvider = "testData")
	public void selectRace(String track, int race, String priceToPlace) 
	{
		System.out.println("Track: " + track + " Race: " + race + " Price To Place: " + priceToPlace);

		WebDriver webDriver = betImpl.getWebDriver();

		RaceCardActions raceCardActions = new RaceCardActions(webDriver);

		raceCardActions.clickHorseRacingTab();
		boolean isRaceSelected = raceCardActions.selectRaceCard(track, race);

		if(!isRaceSelected)
		{
			throw new TestException(track + " is not  open currently. Please selct another race.");
		}
	}

	@Test(dependsOnMethods = {"selectRace"}, dataProvider = "testData")
	public void placeABet(String track, int race, String priceToPlace) 
	{
		WebDriver webDriver = betImpl.getWebDriver();

		RaceCardActions raceCardActions = new RaceCardActions(webDriver);
		BetSlipActions betSlipActions = new BetSlipActions(webDriver);
		KeyPadActions keyPadActions = new KeyPadActions(webDriver);

		raceCardActions.clickPricetoWin(priceToPlace);
		raceCardActions.clickBetSlipButton();

		betSlipActions.clickStakeTxtBox();
		keyPadActions.clickQuickBtn10();
		keyPadActions.clickBtnElement(".");
		keyPadActions.clickBtnElement5();
		keyPadActions.clickCloseKeyPadBtn();

		betSlipActions.clickConfirmBetBtnElement();
	}
}