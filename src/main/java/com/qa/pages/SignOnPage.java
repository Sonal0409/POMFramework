package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;

public class SignOnPage extends Base {

	
	
	// Design the sigon page now
	// creating the object repositry
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	
	
	
	//initialize the page factory
	public SignOnPage()
	{
		PageFactory.initElements(driver, this);    // initialize the elements using driver  on 'this' page or current class Objects
		
	}
	
	public String validatepagetitle()
	{
	
		return driver.getTitle();	
	}
	
	public RegistrationPage registerclick()
	{
		register.click();
		return new RegistrationPage();
		
	}
	
	
}
