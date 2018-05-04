package com.ohrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orhm.basePakage.BaseClass;

public class LoginPage extends BaseClass
{
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	@FindBy(id="openIdLogin")
	WebElement redLoginButton;
	
	
	public String title()
	{
		return driver.getTitle();
		
	}
	
	public boolean loginButton()
	{
		return redLoginButton.isDisplayed();
	}
	
	public HomePage login(String uname,String pwd) throws IOException
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
		return new HomePage();
	}

}
