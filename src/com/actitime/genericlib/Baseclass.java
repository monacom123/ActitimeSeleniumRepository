package com.actitime.genericlib;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.objectrepository.Comman;
import com.actitime.objectrepository.Login;

public class Baseclass
{
 public static WebDriver driver;
 Fileutils lib=new Fileutils();
 
	@Parameters("browser")
	@BeforeClass
	public void configBc() throws Throwable
	{
		Properties pobj=lib.getpropertyobj();
	String bname=pobj.getProperty("browser");
			
	if(bname.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(bname.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
	driver=new ChromeDriver();
	}
}
		@BeforeMethod
		public void confiBm() throws Throwable
		{
			System.out.println("login");
			
			Properties pobj=lib.getpropertyobj();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(pobj.getProperty("url"));
			Login lp=PageFactory.initElements(driver,Login.class);
			lp.login(pobj.getProperty("username"),pobj.getProperty("password"));
			
		}
		/*
			driver.get("http://ravi/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		}*/
		
		@AfterMethod
		public void confiAm()
		{
			System.out.println("logout");
		//driver.findElement(By.linkText("Logout")).click();
			Comman comm=PageFactory.initElements(driver,Comman.class);
			
			
		}
		
		@AfterClass
		public void confiAc()
		{
			System.out.println("close browser");
			driver.close();
		}
		

	}

