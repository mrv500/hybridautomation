package com.actitime.all_test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drop_down2 extends SuperTestScripts
{
	@Test
	public static void testDropdown1()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       driver.findElement(By.linkText("Projects & Customers")).click();
	       driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
	       WebElement custDropdown = driver.findElement(By.name("customerId"));
		      Select r1 = new Select(custDropdown);
		      r1.selectByIndex(1);
				driver.findElement(By.name("name")).sendKeys("slime");
				driver.findElement(By.name("createProjectSubmit")).click();
	       
	       
	}
	

}
