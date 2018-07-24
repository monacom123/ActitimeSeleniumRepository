package com.actitime.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Comman 
{
	@FindBy(linkText="Logout")
	private WebElement logout;
	public void logout()
	{
		logout.click();
	}

}
