package com.actitime.all_test_scripts;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript3  extends SuperTestScripts
{
	@Test
	public void testTestScript3() throws Exception 
	{
		
	   String un = ExcelLibrary.readData("Sheet2", 1, 0);
	   String pwd = ExcelLibrary.readData("Sheet2", 1, 1);
	   String custName = ExcelLibrary.readData("Sheet2", 1, 2);
	   String expRes = ExcelLibrary.readData("Sheet2", 1, 3);

       driver.findElement(By.name("username")).sendKeys(un);
       driver.findElement(By.name("pwd")).sendKeys(pwd);
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       driver.findElement(By.linkText("Projects & Customers")).click();
       driver.findElement(By.cssSelector("input[type='button']")).click();
       driver.findElement(By.name("name")).sendKeys(custName);
       driver.findElement(By.name("createCustomerSubmit")).click();
       
      String actRes = driver.findElement(By.className("successmsg")).getText();
       
      ExcelLibrary.writeData("Sheet2", 1, 4, actRes);

    String status =   ValidationLibrary.verifySuccessMsg(expRes, actRes);
    ExcelLibrary.writeData("Sheet2", 1, 5, status);

       
       
       driver.findElement(By.className("logoutImg")).click();
	   
	}
}

