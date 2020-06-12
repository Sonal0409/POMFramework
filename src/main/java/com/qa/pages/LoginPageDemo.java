package com.qa.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseDemo;

public class LoginPageDemo extends BaseDemo {



	// we have to define our Object Repository/Page Factory
	// locators, lacators values, webelement names and actions
	//@FindBy(locatorname="value")
	// WebElement uniquename
	
	
	
	@FindBy(xpath="//*[@name='userName']")
	WebElement uname;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement pswrd;
	

	@FindBy(xpath="//*[@name='login']")
	WebElement signin;
	
	// intialize of above objects or page factory
	// class -PageFactory -- method - initElements
	
	public LoginPageDemo() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	// Create Actions method for each type of action that we are going to perform
	// these methods will be called in test classes
	public String validatePageTitle()
	{
	
		return driver.getTitle();
	}
	
	public String validatePageURL()
	{
	
		return driver.getCurrentUrl();
	}
	
// landing page
	
	//login into the application
	
		public SignOnPageDemo login(String un, String pwd) throws IOException
		{
			
			uname.sendKeys(un);
			pswrd.sendKeys(pwd);
			signin.click();
			
			// after we click on login page, sign on page is my landing page
			return new SignOnPageDemo();
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
