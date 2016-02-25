package com.mmt1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class MMTSample {
	
	public static void main(String []args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='appfest_container-close pull-right clearfix']")).click();

		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		driver.findElement(By.xpath("//a[@id='one_way_button1']/span")).click();
		driver.findElement(By.id("from_typeahead1")).clear();
		driver.findElement(By.id("from_typeahead1")).sendKeys("Pune");
		driver.findElement(By.id("from_typeahead1")).sendKeys(Keys.TAB);
		driver.findElement(By.id("to_typeahead1")).clear();
		driver.findElement(By.id("to_typeahead1")).sendKeys("New Delhi");
		driver.findElement(By.id("to_typeahead1")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-calendar flL']")).click();
		driver.findElement(By.id("start_date_sec")).click();
		driver.findElement(By.xpath("//td[@fare-date='30-2-2016']")).click();
		Select select = new Select(driver.findElement(By.id("prefferedAirline")));
		select.selectByVisibleText("Air India");
		driver.findElement(By.id("flights_submit")).click();
		
		System.out.println("Wait for clicking book");

		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.xpath("//a[text()='Book']")).get(0)));
		
		//WaitForPageToLoad wait = new WaitForPageToLoad();
		//wait.setTimeToWait(20);
		//Thread.sleep(20000);

		System.out.println("Before clicking book");
		
		driver.findElements(By.xpath("//a[text()='Book']")).get(0).click(); // Click on first flight Book Button and popup will be shown as confirming flight.
		
		
		driver.quit(); // will close the firefox.
	}
}
