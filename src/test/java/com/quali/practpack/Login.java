package com.quali.practpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Login {
	
	@BeforeMethod
	public void log()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		System.out.println("First logged in to amazon");
		driver.close();
	}

}
