package com.locators1;

public class Demo_clearlocators {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		//locators ID,Name and path
		driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gmail.com");
		driver.findElement(By.id("username")).clear();
		driver.quit();
 
	}
 
}
}
