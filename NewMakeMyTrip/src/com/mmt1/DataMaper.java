package com.mmt1;

/**
 * This is bean class for Data Constants, 
 * as Data should not be invoked directly,
 * DataMaper getter should be called instead.
 * 
 * @author Heart BEAT'S
 *
 */
public class DataMaper 
{
	public static int getGlobalwait() 
	{
		return Data.globalWait;
	}
	
	public static String getURL()
	{
		return Data.url;
	}
	
	public static String getAirlinename() 
	{
		return Data.airlineName;
	}
	
	public static String getSource()
	{
		return Data.source;
	}
	
	public static String getDestination() 
	{
		return Data.destination;
	}
	
	public static String getTraveldate() 
	{
		return Data.travelDate;
	}
}