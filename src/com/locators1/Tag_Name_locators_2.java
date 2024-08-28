package com.locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tag_Name_locators_2 {
	WebDriver driver;
	@Test
public void Tagname_locators() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://auth.hollandandbarrett.com/u/login");
	 driver.manage().window().maximize();
	 

	 String tagname=driver.findElement(By.id("username")).getTagName();
	 System.out.println(tagname);
	 Thread.sleep(4000);
	 driver.quit(); 
}
}
