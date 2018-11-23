package com.actitime.all_test_scripts;

import org.testng.annotations.Test;

public class AddNewUserTC_250 extends SuperTestScripts
{
@Test
public void testAddNewUserTC_250()
{
	String un = ExcelLibrary.readData("TC_250", 1, 0);
	String pwd = ExcelLibrary.readData("TC_250", 1, 1);
	String custName = ExcelLibrary.readData("TC_250", 1, 2);
	String expres = ExcelLibrary.readData("TC_250", 1, 3);
	 
	
	LoginPage lp = new LoginPage();
	ProjectsAndTasks pat = new ProjectsAndTasks();
	ActiveProjectsAndCustomers apac = new ActiveProjectsAndCustomers();
	AddNewCustomerPage ancp = new AddNewCustomerPage();

	lp.enterUsername(un);
	lp.enterPassword(pwd);
	lp.clickOnLoginButton();
	
	pat.selectProjectsAndCustomers();
	apac.clickOnAaddNewCustomerButton();
	ancp.enterCustomerName(custName);
	ancp.clickOnCreateCustomerButton();
	String actres = apac.fetchSuccessMsg();
	apac.clickOnLogOutButton();
	
	String status = ValidationLibrary.verifySuccessMsg(expres, actres);
	
	ExcelLibrary.writeData("TC_250", 1, 4, actres);

	ExcelLibrary.writeData("TC_250", 1, 5, status);
	
	
	
	
	
}
	
	
	
	
}
