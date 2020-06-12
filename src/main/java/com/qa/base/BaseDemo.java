package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDemo {

	// we are going to intialize our driver, properties, details of browsers
	
	public static WebDriver driver;
	
	// properties object 
	
	public static Properties prop;
	
	
	public BaseDemo() throws IOException
	{
		
		// Load our property file
		
		prop= new Properties();
		
		// provide the details of location of your property file
		
		
			FileInputStream ip= new FileInputStream("C:\\Users\\vishal mittal\\workspace\\POMFramework\\src\\main\\java\\com\\qa\\config\\configuration.properties");
		
		// load the property file,so as to read the keys and values
		
		prop.load(ip);
	}
		
	// provide all the browser details, use them as needed in test classes
	public static void initialization()
	{
		
		// fetch the key and value for browser from property file
		
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			//System.serProperty and path o driver
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FF"))
		{
			//System.serProperty and path of gecko driver
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
	}
		
		
		
		
		
	}
	
	


