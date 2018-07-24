package com.actitime.customertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericlib.Baseclass;
import com.actitime.genericlib.Fileutils;
import com.actitime.objectrepository.CreateNewCustomer;
import com.actitime.objectrepository.Home;
import com.actitime.objectrepository.OpenTask;
import com.actitime.objectrepository.ProjectAndCustomer;

public class CustomerDescTest extends Baseclass
{
	@Test
	public void createCustomerWithDescTest() throws Throwable
	{
		Fileutils lib=new Fileutils();
		String customerName=lib.getexceldata("sheet1", 1,2);
		String desc=lib.getexceldata("sheet1",2,3);
				
		
		//navigate to task page
Home hp=PageFactory.initElements(driver,Home.class);
hp.navigateToTaskPage();

//click on Project & customer link
OpenTask op=PageFactory.initElements(driver,OpenTask.class);
op.navigateToprojectAndCustpage();

//Step-4 click on Create new Customer page
ProjectAndCustomer pandc=PageFactory.initElements(driver,ProjectAndCustomer.class);
pandc.NavigateCreateNewCustomerPage();

//create customer
CreateNewCustomer createcust=PageFactory.initElements(driver,CreateNewCustomer.class);

createcust.createCustomer(customerName, desc);



//verify
String actmsg=pandc.getSucmsg().getText();

    String expmsg="successfully created.";
boolean stat=actmsg.contains(expmsg);
Assert.assertTrue(stat);
	}

}
