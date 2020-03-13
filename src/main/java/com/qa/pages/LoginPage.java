package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;

public class LoginPage extends Base {
	
	
	// first you will create object repository and than initialize the object repository
	
	// Define PageFactory or Object repository
	
	// syntax for creating Object repository
	
	// @FindBy(locatorname="value")
	// WebElement  elementname
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement signin;
	
	// we will create a constructor here to initialize the Object repository
	
	// Use class : PageFactory, initElements
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);    // initialize the elements using driver  on 'this' page or current class Objects
		
	}

	
	// Actions on the page: to check various fetaures on the page
	
	public String validatepagetitle()
	{
	
		return driver.getTitle();
		
		
	}
	
	//login into the application
	
	public SignOnPage login(String un, String pwd)
	{
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		signin.click();
		
		// after we click on login page, sign on page is my landing page
		return new SignOnPage();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
