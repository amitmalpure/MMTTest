package com.wh.utilities;

import com.wh.testdata.Data;

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
}