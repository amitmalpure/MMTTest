package com.wh.actions;

import org.openqa.selenium.WebDriver;

import com.wh.pageobjects.BetSlipPage;

public class BetSlipActions 
{
	private WebDriver webDriver;
	
	public BetSlipActions(WebDriver webDriver) 
	{
		this.webDriver = webDriver;
	}
	
	public void clickStakeTxtBox()
	{
		BetSlipPage.getStakeTxtElement(webDriver).clear();
		BetSlipPage.getStakeTxtElement(webDriver).click();
	}
	
	public void clickConfirmBetBtnElement()
	{
		BetSlipPage.getConfirmBetBtnElement(webDriver).click();;
	}
}
