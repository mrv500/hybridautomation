package com.actitime.all_test_scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class pop_up1 extends SuperTestScripts
{
	@Test
 public void testpop_up1()
 {
	 driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.cssSelector("input[type='submit']")).click();
     driver.findElement(By.linkText("Projects & Customers")).click();
     driver.findElement(By.cssSelector("input[value='Archive Selected Customers & Projects']")).click();
      Alert rv1 = driver.switchTo().alert();
      System.out.println(rv1.getText());
      rv1.accept();
      driver.findElement(By.linkText("lilwayne")).click();
      driver.findElement(By.cssSelector("input[value='Delete This Customer']")).click();
     System.out.println(rv1.getText()); 
     rv1.accept();
     driver.findElement(By.className("logoutImg")).click();

      
 }
}



