package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login 
{
	@FindBy(name="username")
	private WebElement usernameEdit;
	
	@FindBy(name="pwd")
	private WebElement passwordEdit;
	

	@FindBy(id="loginButton")
	private WebElement loginbtn;


	public WebElement getUsernameEdit() {
		return usernameEdit;
	}


	public WebElement getPasswordEdit() {
		return passwordEdit;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	//Reusable business lib/Action
	
	public void login(String username,String password)
	{
	usernameEdit.sendKeys(username);	
	passwordEdit.sendKeys(password);
	loginbtn.click();
	}
	
}
