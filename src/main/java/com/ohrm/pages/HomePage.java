package com.ohrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orhm.basePakage.BaseClass;

public class HomePage extends BaseClass
{

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(id="welcome")
	WebElement welcomeLink;
	
	@FindBy(xpath="//a [text()='Logout']")
	WebElement logout;
	
	@FindBy(xpath="//b [text()='PIM']")
	WebElement pimlink;
	
	
	public boolean homePageWelcomeLink()
	{
		boolean bolwelcome=welcomeLink.isDisplayed();
		return bolwelcome;
	}
	
	public void clickLogout()
	{
		welcomeLink.click();
		logout.click();
	}
	
	public EmployeInformation clickPimLinkOnHomePage() throws IOException
	{
		pimlink.click();
		return new EmployeInformation();
	}

}
