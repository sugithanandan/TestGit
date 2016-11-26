package com.test.first.sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LoginPage {
	
	private static final Logger LOGGER =LoggerFactory.getLogger(LoginPage.class);
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
		LOGGER.info("Title of the page :"+driver.getTitle());

		
	}
	
	@FindBy(how=How.ID, using="nav-questions")
	private WebElement quest;
	
	public LoginPage clickquestion()
	{
		quest.click();
		LOGGER.info("Clicked question successfully");
		return this;
	}

}
