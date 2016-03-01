package com.wh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WHSample {

	public static void main(String []args) throws InterruptedException{

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.williamhill.com.au/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='local-nav']/div/ul[1]/li[2]/a")).click();
		//driver.findElement(By.linkText("/horse-racinggrid"));
		//driver.findElement(By.xpath("//a[text()='Horse Racing']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//a[contains(@href,'caulfield-3')]")).click();

		Thread.sleep(3000);


		driver.findElement(By.xpath("//a[contains(@data-link-pricetoplace,'1.85')]")).click();
		//driver.findElement(By.xpath("//a[text()='7.50']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@id='betslipBadge']")).click();

		driver.findElement(By.id("UnitStake-1")).clear();
		driver.findElement(By.id("UnitStake-1")).click();
		driver.findElement(By.xpath("//button[contains(@title,'Quick Bet $10')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='.']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[text()='5'])[position()=last()]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("kpad-enter")).click();

		//driver.findElement(By.id("UnitStake-1")).sendKeys("10.5");
		driver.findElement(By.id("bs_confirm")).click();
	}
}
