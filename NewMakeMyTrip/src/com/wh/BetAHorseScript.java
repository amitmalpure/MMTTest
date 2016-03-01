package com.wh;

import com.wh.automationFramework.BetImpl;

public class BetAHorseScript {

	public static void main(String[] args) 
	{
		betAHorseScript();
	}

	private static void betAHorseScript() 
	{
		BetImpl betImpl = new BetImpl();
		betImpl.init();
		betImpl.executeTest();		
	}
}