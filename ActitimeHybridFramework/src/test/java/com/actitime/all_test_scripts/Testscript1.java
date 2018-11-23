package com.actitime.all_test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testscript1 extends SuperTestScripts {
	@Test
	public void testTestscript1() {
		
		 driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        ProjectsAndTasks patp=new ProjectsAndTasks();
        
        patp.selectProjectsAndCustomers();
        WebElement cc=  driver.findElement(By.cssSelector("input[value='Add New Project']"));

        Actions a1=new Actions(driver);
        a1.click(cc).perform();
	}

}
