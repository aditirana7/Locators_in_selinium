package com.locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoLocators1 {
	WebDriver driver;
	@Test
	public void ExId() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		//locators-ID,Name and Xpath-XML Path
		driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gmail.com");
		driver.findElement(By.name("password")).sendKeys("raghuBN@123");
		driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();
	}
	
	@Test
	public void WebElementsEnabled()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		//locators-ID,Name and Xpath-XML Path
		driver.findElement(By.id("username")).sendKeys("raghuastepahead@gmail.com");
		driver.findElement(By.name("password")).sendKeys("raghuBN@123");
		Thread.sleep(4000);
		driver.findElement(By.id("username")).clear();
		Boolean Enabled = driver.findElement(By.id("username")).isEnabled();
		System.out.println(Enabled);
		Thread.sleep(4000);
		driver.quit();
		}
	@Test
	public void WebElementsSelected()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		//locators-ID,Name and Xpath-XML Path
		driver.findElement(By.id("username")).sendKeys("raghuastepahead@gmail.com");
		driver.findElement(By.name("password")).sendKeys("raghuBN@123");
		Thread.sleep(4000);
		driver.findElement(By.id("username")).clear();
		Boolean Selected= driver.findElement(By.id("username")).isSelected();
		System.out.println(Selected);
		Thread.sleep(4000);
		driver.quit();
}
}
