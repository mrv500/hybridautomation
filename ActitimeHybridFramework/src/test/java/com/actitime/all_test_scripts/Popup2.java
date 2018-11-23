package com.actitime.all_test_scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Popup2 extends SuperTestScripts

{
	@Test
	 public void testpop_up1()
	 {
		 driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
	     driver.findElement(By.cssSelector("input[type='submit']")).click();
	     driver.findElement(By.linkText("Projects & Customers")).click();
	     driver.findElement(By.cssSelector("input[type='button']")).click();
		 driver.findElement(By.name("name")).sendKeys("yooo");
	     driver.findElement(By.linkText("Archives")).click();
	     String popmsg=  driver.findElement(By.className("exitconfirmbutton")).getText();
	       System.out.println(popmsg);
		     driver.findElement(By.cssSelector("input[value='Cancel Customer Creation and Proceed']")).click();
		      driver.findElement(By.className("logoutImg")).click();




	     
	     
	     
	 }
	
	
	
	
}
