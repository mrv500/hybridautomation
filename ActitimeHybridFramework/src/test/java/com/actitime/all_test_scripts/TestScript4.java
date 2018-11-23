package com.actitime.all_test_scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript4 extends SuperTestScripts {
	@Test
	public void testTestScript4() throws Exception {
		String un = ExcelLibrary.readData("Sheet3", 1, 0);
		String pwd = ExcelLibrary.readData("Sheet3", 1, 1);
		String exptitle = ExcelLibrary.readData("Sheet3", 1, 2);
		String hom_exptitle = ExcelLibrary.readData("Sheet3", 1, 5);

		String acttitle = driver.getTitle();
		ExcelLibrary.writeData("Sheet3", 1, 3, acttitle);
		String status = 	ValidationLibrary.verifyTitle(acttitle, exptitle);
	    ExcelLibrary.writeData("Sheet3", 1, 4, status);


		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String hom_acttitle = driver.getTitle();
		ExcelLibrary.writeData("Sheet3", 1, 6, hom_acttitle);
		String status1 = ValidationLibrary.verifyTitle(hom_exptitle, hom_acttitle);
		

		driver.findElement(By.className("logoutImg")).click();
	    ExcelLibrary.writeData("Sheet3", 1, 7, status1);

	}
}
