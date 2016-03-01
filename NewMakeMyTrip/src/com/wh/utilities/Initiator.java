package com.wh.utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.wh.testdata.Config;

/**
 * This class has initialization routines.
 * e.g. Initialize webdriver object.
 * 
 * @author Heart BEAT'S
 *
 */
public class Initiator 
{
	public static WebDriver initWebDriver()
	{
		WebDriver driver = null;
		
		if(Config.browserName.equalsIgnoreCase("FireFox"))
		{
			driver = initFireFoxDriver();
		}
		else if(Config.browserName.equalsIgnoreCase("IE"))
		{
			driver = initInternetExplorerDriver();
		}
		else if(Config.browserName.equalsIgnoreCase("Chrome"))
		{
			driver = initChromeDriver();
		}
		else if(Config.browserName.equalsIgnoreCase("Opera"))
		{
			driver = initOperaDriver();
		}
		
		return driver;
	}
	
	private static WebDriver initFireFoxDriver()
	{
		return new FirefoxDriver();
	}
	
	private static WebDriver initInternetExplorerDriver()
	{
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		File file = new File("D:\\Softwares\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver(capabilities);
		return driver;
	}
	
	private static WebDriver initChromeDriver()
	{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromeDriver.exe");
		WebDriver webDriver = new ChromeDriver(capabilities);
		return webDriver;
	}
	
	private static WebDriver initOperaDriver()
	{
		return new FirefoxDriver();
	}
	
	public static WebDriver launch()
	{
		WebDriver webDriver = Initiator.initWebDriver();
		
		webDriver.get(DataMaper.getURL());
		webDriver.manage().timeouts().implicitlyWait(DataMaper.getGlobalwait(), TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		
		return webDriver;
	}
	
	
}