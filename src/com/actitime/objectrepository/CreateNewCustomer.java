package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer 
{
	 @FindBy(name="name")
	 private WebElement customerNameEdit;
	 
	 @FindBy(name="description")
	 private WebElement customerdescription;
	 
	 @FindBy(name="createCustomerSubmit")
	 private WebElement createCustomerbtn;

	 //overloaded mtd
	 
public void createCustomer(String custName)
{
	customerNameEdit.sendKeys(custName);
	createCustomerbtn.click();
}

public void createCustomer(String custName,String desc)
{
	customerNameEdit.sendKeys(custName);
	customerdescription.sendKeys(desc);
	createCustomerbtn.click();
	
}


}
