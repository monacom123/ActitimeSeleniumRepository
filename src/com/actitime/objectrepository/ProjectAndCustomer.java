package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomer 
{
	@FindBy(xpath="//input[@value='Create New Customer']/..")
private WebElement createCustomerBtn;
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement sucMsg;
	
	public void NavigateCreateNewCustomerPage()
	{
		createCustomerBtn.click();
	}

	public WebElement getSucmsg()
	{
		return sucMsg;
		
	}
}
