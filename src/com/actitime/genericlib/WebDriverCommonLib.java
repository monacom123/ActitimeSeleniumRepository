package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib 
{
	public void waitForPagetoLoad()
	{
		Baseclass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	public void waitForElementPresent(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(Baseclass.driver,20);
		wait.until(ExpectedConditions.visibilityOf(wb));
		}
	
	public void select(WebElement swb,int value) {
		Select sel=new Select(swb);
		sel.selectByIndex(value);
		
	}

	public void select(WebElement swb,String  value) {
		Select sel=new Select(swb);
		sel.selectByVisibleText(value);
		
	}
}
