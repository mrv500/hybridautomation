package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
@FindBy(name="username")	
private WebElement usernameTextbox;
@FindBy(name="pwd")
private WebElement passwordTextbox;
@FindBy(css="input[type='submit']")
	private WebElement loginButton;


public LoginPage()
{
	PageFactory.initElements(SuperTestScripts.driver, this);
}

public void enterUsername(String un)
{
	usernameTextbox.sendKeys(un);
	
}
public void enterPassword(String pwd)
{
	passwordTextbox.sendKeys(pwd);
}
public void clickOnLoginButton()
{
	loginButton.click();
}
	
	
	
	
	
	
	
	
	
	
}
