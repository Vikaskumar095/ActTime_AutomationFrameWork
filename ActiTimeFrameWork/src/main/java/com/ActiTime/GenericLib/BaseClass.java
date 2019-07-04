package com.ActiTime.GenericLib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.ActiTime.GenericLib.FileUtility;
import com.ActiTime.ObjectRepositiory.LoginActiTime;
import com.ActiTime.ObjectRepositiory.LogoutActiTime;
public class BaseClass
{
	public WebDriver driver;
	public FileUtility data = new FileUtility();
@BeforeSuite
public void databaseRunning()
{
	Reporter.log("-----db running-----");
}
@BeforeClass
public void launchBowser()  
{
	System.setProperty("webdriver.chrome.driver",
	System.getProperty("user.dir")+"//Resources//chromedriver.exe");
	driver =  new ChromeDriver();
/*
	else if (browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.Firefox.driver",
	    System.getProperty("user.dir")+"//Resources//geckodriver.exe");
		driver =  new ChromeDriver();
	}	*/
}
@BeforeMethod  
public void actiLogin()throws IOException
{
	driver.get(data.getDataFromProperty("url"));
	LoginActiTime login  = PageFactory.initElements(driver, LoginActiTime.class);
	login.getUserName();
	login.getPassword();
	login.getloginButton();
	//login.getErrMsg();
}
@AfterMethod
public void logout()
{
	LogoutActiTime logout = PageFactory.initElements(driver,LogoutActiTime.class);
	logout.getLogout();
}
@AfterClass
public void closeBrowser()
{
	driver.quit();
}
@AfterSuite
public void closeSuit()
{
	Reporter.log("----dbClosing-------");
}
}