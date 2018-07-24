package com.actitime.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask 
{
	@FindBy(linkText="Projects & Customers")
	private WebElement ProAndCustomer;
	
	public void navigateToprojectAndCustpage()
	{
		ProAndCustomer.click();
	}

}
