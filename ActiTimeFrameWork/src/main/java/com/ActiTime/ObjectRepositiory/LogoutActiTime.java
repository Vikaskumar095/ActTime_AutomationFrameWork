package com.ActiTime.ObjectRepositiory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutActiTime 
{
 @FindBy(xpath = "//a[@id= 'logoutLink']")
 private WebElement logout;
	
	public void getLogout()
	{
	 logout.click();	
	}
}
