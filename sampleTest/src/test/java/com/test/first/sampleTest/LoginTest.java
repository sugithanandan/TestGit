package com.test.first.sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	LoginPage login;

	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://stackoverflow.com/");	

	}
	
	@Test
	public void disptitle()
	{
		login = new LoginPage(driver);
	    login.clickquestion();
	}

	@AfterTest
	public void close()
	{
		driver.close();
		driver.quit();
	}
}
