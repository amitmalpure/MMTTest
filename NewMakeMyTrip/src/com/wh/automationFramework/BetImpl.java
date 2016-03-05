package com.wh.automationFramework;

import org.openqa.selenium.WebDriver;

import com.wh.actions.BetSlipActions;
import com.wh.actions.KeyPadActions;
import com.wh.actions.RaceCardActions;
import com.wh.actions.Utils;
import com.wh.utilities.Initiator;

public class BetImpl implements IWHTest
{
	protected WebDriver webDriver;
	
	public BetImpl()
	{
		System.out.println("In Constructor!");
	}
	
	public void init()
	{
		webDriver = Initiator.launch();
	}
	
	public void executeTest()
	{
		RaceCardActions raceCardActions = new RaceCardActions(webDriver);
		BetSlipActions betSlipActions = new BetSlipActions(webDriver);
		KeyPadActions keyPadActions = new KeyPadActions(webDriver);
		Utils utils = new Utils(webDriver);
		
		raceCardActions.clickHorseRacingTab();
		boolean isRaceSelected = raceCardActions.selectRaceCard("newcastle", 3);
		
		if(isRaceSelected)
		{
			raceCardActions.clickPricetoPlace("1.55");
			raceCardActions.clickBetSlipButton();

			betSlipActions.clickStakeTxtBox();
			keyPadActions.clickQuickBtn10();
			keyPadActions.clickBtnElement(".");
			keyPadActions.clickBtnElement5();
			keyPadActions.clickCloseKeyPadBtn();

			betSlipActions.clickConfirmBetBtnElement();
		}
		
		utils.closeBrowser();
	}

	public WebDriver getWebDriver()
	{
		return webDriver;
	}
}