package com.ohrm.testPakage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.HomePage;
import com.ohrm.pages.LoginPage;
import com.orhm.basePakage.BaseClass;

public class HomePageTest extends BaseClass
{
	LoginPage lop;
	HomePage hp;
	public HomePageTest() throws IOException 
	{
		super();
		
	}
	
	@BeforeMethod
	public void homePageLaunch() throws IOException
	{
		initilize();
		lop=new LoginPage();
		hp=new HomePage();
		lop.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=0,enabled=false)
	public void welcomeLinkCheckTest()
	{
		boolean bolwelcome=hp.homePageWelcomeLink();
		Assert.assertTrue(bolwelcome);
	}
	@Test(priority=2,enabled=false)
	public void logouTest() throws InterruptedException
	{
		Thread.sleep(6000);
		hp.clickLogout();
	}
	
	@Test(priority=1,enabled=true)
	public void pimpLinkClick() throws IOException
	{
		hp.clickPimLinkOnHomePage();
	}
	@AfterMethod
	public void homePageClose()
	{
		driver.quit();
	}

}
