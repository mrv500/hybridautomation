package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsAndTasks 
{ 
	@FindBy(linkText=("Projects & Customers"))
	private WebElement projectsAndCustomers;
	
	public ProjectsAndTasks()
	{
		PageFactory.initElements(SuperTestScripts.driver, this);
	}
	
	public void selectProjectsAndCustomers()
	{
		projectsAndCustomers.click();
	}
	

}
