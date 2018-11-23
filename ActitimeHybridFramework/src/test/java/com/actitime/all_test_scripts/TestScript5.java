package com.actitime.all_test_scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript5 extends SuperTestScripts {

	@Test
	public void testTestScript5() throws Exception {

		String un = ExcelLibrary.readData("Sheet4", 1, 0);
		String pwd = ExcelLibrary.readData("Sheet4", 1, 1);
		String exp_err_msg = ExcelLibrary.readData("Sheet4", 1, 2);

		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String act_err_msg = driver.findElement(By.className("errormsg")).getText();
		ExcelLibrary.writeData("Sheet4", 1, 3, act_err_msg);

		String status = ValidationLibrary.verifyErrorMsg(exp_err_msg, act_err_msg);
		ExcelLibrary.writeData("Sheet4", 1, 4, status);

	}
}
