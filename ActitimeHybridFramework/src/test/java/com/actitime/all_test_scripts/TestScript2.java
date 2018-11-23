package com.actitime.all_test_scripts;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript2 extends SuperTestScripts 
{
   @Test
	public void testTestScript2() throws Exception
	{
		
	   String un = ExcelLibrary.readData("Sheet1", 1, 0);
	   String pwd = ExcelLibrary.readData("Sheet1", 1, 1);
       driver.findElement(By.name("username")).sendKeys(un);
       driver.findElement(By.name("pwd")).sendKeys(pwd);
       driver.findElement(By.xpath("//input[@type='submit']")).click();

	   
	}
	
	
	
	
	
	
}
