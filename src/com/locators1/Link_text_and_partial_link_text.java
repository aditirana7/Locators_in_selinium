package com.locators1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Link_text_and_partial_link_text {
		WebDriver driver;
		int total=0;
		@BeforeTest
		public void Setup()
		{
			 System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();

		}
		@Test
	public void Partial_link_text() throws InterruptedException
	{
		 driver.navigate().to("https://hollandandbarrett.com");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		 driver.findElement(By.linkText("Vitamins & Supplements")).click();
		 List<WebElement> links=driver.findElements(By.xpath("//a"));
		 int linkcount=links.size();
		 total=total+links.size();
		 System.out.println("Number of links"+linkcount);
		 for(int i=1;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}	 
}
	}
	
