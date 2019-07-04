package com.ActiTime.ObjectRepositiory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ActiTime.GenericLib.FileUtility;


public class LoginActiTime 
{ 
	FileUtility data = new FileUtility(); 
	@FindBy(name ="username")
    private WebElement username ;
	@FindBy(name ="pwd")
    private WebElement password ;
	@FindBy(id ="loginButton")
    private WebElement lognbtn ;
	@FindBy(xpath ="//span[text()= 'Username or Password is invalid. Please try again.']")
    private WebElement errmsg ;
	
	public void getUserName() throws IOException
	{
		
	  username.sendKeys(data.getDataFromProperty("username"));
	}
	public void getPassword() throws IOException
	{
		password.sendKeys(data.getDataFromProperty("password"));
	}
	public void getloginButton()
	{
	   lognbtn.click();
	}
	public String getErrMsg()
	{
		return errmsg.getText();
	}	
}
