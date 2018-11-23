package com.actitime.all_test_scripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class SuperTestScripts
{

	public static WebDriver driver;
	
	@BeforeMethod
	public void preconfig()
	{
		String browserType="ff";
		if(browserType.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver","./src/test/resources/driver_exe/geckodriver.exe");
			driver =new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("GC"))
		{
			System.setProperty("webdriver.chrome.driver","./src/test/resources/driver_exe/chromedriver.exe");
					driver =new ChromeDriver();	
		}
		else
		{
			System.setProperty("webdriver..driver","c:/chromedriver_win64/chromedriver.exe");
		}
		driver.get("http://desktop-v77or2o:81/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
  	@AfterMethod
	public void postconfig()
	{
		driver.close();
	}
	
	
}
