package com.ohrm.testPakage;

import java.io.IOException;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.LoginPage;
import com.orhm.basePakage.BaseClass;

public class LoginTest extends BaseClass
{
	LoginPage lop;
	public LoginTest() throws IOException
	{
		super();
		
	}
	
	@BeforeMethod
	public void baseClass() throws IOException
	{
		initilize();
		lop=new LoginPage();
	}
	
	@Test(priority=0)
	public void comparingTitle()
	{
		String actTitle=lop.title();
		Assert.assertEquals(actTitle, "OrangeHRM");
	}
	@Test(priority=1,enabled=true)
	public void redButton() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean bol=lop.loginButton();
		Assert.assertTrue(bol);
	}
	@Test(priority=1,enabled=true)
	public void login() throws IOException
	{
		lop.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
