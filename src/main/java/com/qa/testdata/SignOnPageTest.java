package com.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;
import com.qa.pages.SignOnPage;

public class SignOnPageTest extends Base {
	
	SignOnPage signOnPage;
	RegistrationPage registrationPage;
	
	LoginPage loginpage;
	
	public SignOnPageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup()
	{
		// call the initialization method from Base class, 
	//	it will also call the superkeyword and call super constructor to intialize all the properties
		
		initialization();
		
		loginpage= new LoginPage();
		signOnPage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		// create an object for SignOnPage class to access the methods
		signOnPage = new SignOnPage();
		
	}
	

	@Test(priority='1')
	public void title()
	{
		// this method is created in Loginpage class to validate ttiel of page
		try
		{
		String title= signOnPage.validatepagetitle();
		Assert.assertEquals(title, "Sign-on: Mercury Tours");
		}
		catch(Exception e){
		}
	}
	
	@Test(priority='2')
	public void signinTest()
	
	{
		try
		{
			registrationPage = signOnPage.registerclick();

		}
		catch(Exception e){
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
