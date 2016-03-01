package com.wh.actions;

import org.openqa.selenium.WebDriver;

import com.wh.pageobjects.KeyPadPage;

public class KeyPadActions 
{
	private WebDriver webDriver;
	
	public KeyPadActions(WebDriver webDriver) 
	{
		this.webDriver = webDriver;
	}
	
	public void clickQuickBtn20()
	{
		KeyPadPage.getQuickBtn20Element(webDriver).click();
	}
	
	public void clickQuickBtn10()
	{
		KeyPadPage.getQuickBtn10Element(webDriver).click();
	}
	
	public void clickQuickBtn5()
	{
		KeyPadPage.getQuickBtn5Element(webDriver).click();
	}
	
	public void clickBtnElement5()
	{
		KeyPadPage.getBtnElement5(webDriver).click();
	}
	
	public void clickQuickBtn1()
	{
		KeyPadPage.getQuickBtn1Element(webDriver).click();
	}
	
	public void clickBtnElement(String amt)
	{
		KeyPadPage.getBtnElement(webDriver, amt).click();
	}
	
	public void clickCloseKeyPadBtn()
	{
		KeyPadPage.getCloseKeyPadBtnElement(webDriver).click();
	}
}