package com.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.LoginPage;
import com.qa.pages.SignOnPage;

public class LoginPageTest extends Base {
	
	LoginPage loginpage;
	
	SignOnPage signOnPage;
	
	public LoginPageTest()
	{
		super();   // it will call the super class constructor.
	}
	
	@BeforeMethod()
	public void setup()
	{
		// call the initialization method from Base class, 
	//	it will also call the superkeyword and call super constructor to intialize all the properties
		
		initialization();
		
		
		loginpage = new LoginPage();
		
	}
	
	
	@Test(priority='1')
	public void title()
	{
		// this method is created in Loginpage class to validate ttiel of page
		try
		{
		String title= loginpage.validatepagetitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
		}
		catch(Exception e){
		}
	}
	
	@Test(priority='2')
	public void signinTest()
	
	{
		try
		{
		signOnPage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		}
		catch(Exception e){
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
