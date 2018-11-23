package com.actitime.all_test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drop_down1 extends SuperTestScripts
{
	@Test
	public static void testDropdown()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       driver.findElement(By.linkText("Projects & Customers")).click();
	      WebElement dyDropdown = driver.findElement(By.name("selectedCustomer"));
	      Select r1 = new Select(dyDropdown);
	      r1.selectByIndex(1);
	       driver.findElement(By.xpath("//input[@value='  Show  ']")).click();


	}
	

}
