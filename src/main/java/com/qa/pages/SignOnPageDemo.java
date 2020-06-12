package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseDemo;

public class SignOnPageDemo extends BaseDemo{
	

	
	// Design the sigon page now
	// creating the object repositry
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	
	
	
	//initialize the page factory
	public SignOnPageDemo() throws IOException
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
