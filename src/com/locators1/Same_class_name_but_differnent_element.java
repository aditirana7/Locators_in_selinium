package com.locators1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Same_class_name_but_differnent_element {
	WebDriver driver;
	@Test
public void same_class_name_different_name() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.hollandandbarrett.com/basket");
	 driver.manage().window().maximize();
	 Thread.sleep(4000);
	 List<WebElement> elements=driver.findElements(By.className("ProductCard-module_productImage__7VPgE"));
	 //iterate through the elements and print their text
	 for(WebElement element:elements)
	 {
		 System.out.println(element.getText());
	 }
	 driver.quit();
}
}
