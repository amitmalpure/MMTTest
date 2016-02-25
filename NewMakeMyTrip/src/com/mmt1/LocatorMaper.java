package com.mmt1;

/**
 * This is bean class for LocatorConstants, 
 * as LocatorConstants should not be invoked directly,
 * LocatorMaper getter should be called instead.
 * 
 * @author Heart BEAT'S
 *
 */
public class LocatorMaper 
{
	public static String getDashboardLtr() 
	{
		return LocatorConstants.dashBoard;
	}
	
	public static String getFlightstabLtr() 
	{
		return LocatorConstants.flightsTab;
	}
	
	public static String getOnewaybtnLtr() 
	{
		return LocatorConstants.oneWayBtn;
	}
	
	public static String getFromtxtLtr() 
	{
		return LocatorConstants.fromTxt;
	}
	
	public static String getTotxtLtr() 
	{
		return LocatorConstants.toTxt;
	}
	
	public static String getStartdatebtnLtr() 
	{
		return LocatorConstants.startDateBtn;
	}
	
	public static String getStartdatevalLtr(String travelDate) 
	{
		return LocatorConstants.startDateVal.replaceAll("##", travelDate);
	}
	
	public static String getAirlinedropdownLtr() 
	{
		return LocatorConstants.airLineDropDown;
	}
	
	public static String getFlightssubmitbtnLtr() 
	{
		return LocatorConstants.flightsSubmitBtn;
	}
	
	public static String getBookbtnLtr() 
	{
		return LocatorConstants.bookBtn;
	}
}