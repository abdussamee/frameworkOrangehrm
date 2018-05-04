package com.orhm.basePakage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() throws IOException
	{
		prop=new Properties();
		FileInputStream fio12=new FileInputStream("C:\\Users\\AS SAMI\\Desktop\\As sami\\orangehrm\\src\\main\\java\\configFolder\\config.properties");
		prop.load(fio12);
	}
	
	public static void initilize()
	{
		
		String browserName=prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AS SAMI\\Desktop\\As sami\\chromedriver.exe");
			driver=new ChromeDriver();
		}else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

}
