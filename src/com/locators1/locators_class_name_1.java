package com.locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locators_class_name_1 {
	WebDriver driver;
	@Test
public void Locator_class_name() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.hollandandbarrett.com/basket");
	 driver.manage().window().maximize();
	 Thread.sleep(4000);
	 boolean displayed=driver.findElement(By.className("ProductCard-module_productImage__7VPgE")).isDisplayed();
	 System.out.println(displayed);
	 driver.quit();
}
}
