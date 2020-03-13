package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utilities.Testutil;

public class Base {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	//constructor
	public Base()
	{
		
		prop= new Properties();
		try {
			FileInputStream file= new FileInputStream("C:\\Users\\vishal mittal\\workspace\\POMFramework\\src\\main\\java\\com\\qa\\config\\config.properties");
		try {
			
			// this will load the file present at above location
			
			prop.load(file);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
		public static void initialization()
		{
			try
			{
				
				// fetch the details of browser from my properties file
		String browsername= prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
	/*	if(browsername.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\vishal mittal\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}*/
			
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Testutil.Page_load_Timeout,TimeUnit.SECONDS );
		
		driver.manage().timeouts().implicitlyWait(Testutil.implicet_wait_timepout,TimeUnit.SECONDS);	
		// open the url on the browser
		
		driver.get(prop.getProperty("url"));
		
			}
			catch(Exception e){
			}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
