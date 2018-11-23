package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage 
{
	@FindBy(name="name")
private WebElement customerNameTextBox;
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;

	
	public AddNewCustomerPage()
	{
		PageFactory.initElements(SuperTestScripts.driver, this);
	}
	
	public void enterCustomerName(String custName)
	{
		customerNameTextBox.sendKeys(custName);          
	}
	
	public void clickOnCreateCustomerButton()
	{
		createCustomerButton.click();
	}

	
	
	
	
}
