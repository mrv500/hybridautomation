package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomers 
{
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	@FindBy(className="successmsg")
	private WebElement successMsg;
	@FindBy(className="logoutImg")
	private WebElement logOutButton;
	
	
	
	public ActiveProjectsAndCustomers()
	{
		PageFactory.initElements(SuperTestScripts.driver, this);
	}
	
	public void clickOnAaddNewCustomerButton()
	{
		addNewCustomerButton.click();
	}
	
	public String fetchSuccessMsg()
	{
		String expmsg=successMsg.getText();
		return expmsg;
	}
	
	public void clickOnLogOutButton()
	{
		logOutButton.click();
	}

}
