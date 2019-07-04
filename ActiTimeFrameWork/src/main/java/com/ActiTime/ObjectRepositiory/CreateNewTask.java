package com.ActiTime.ObjectRepositiory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.ActiTime.GenericLib.WebDriverCommonLib;
public class CreateNewTask
{
	@FindBy(css= "input[value='Create New Tasks']")
	 private WebElement createnewtask;
	 @FindBy(name="customerId")
	 private WebElement customerid; 
	 @FindBy(name= "customerName")
	 private WebElement customername;
	 @FindBy(name="projectName")
	 private WebElement projectname;
	 @FindBy(xpath ="((//td[@class ='listtblcell'])/input[@type='text'])[1]")
	 private WebElement entertaskname; 
	 @FindBy(css="input[value='Create Tasks']")
	 private WebElement createtask;
	 public void getNewTask()
	 {
		 createnewtask.click();
	 }
	 public void getCustomerId()
	 {
		 //WebDriverCommonLib lib = new WebDriverCommonLib();
		  WebElement wb =  customerid ;
		 Select select = new Select(customerid);
		 select.selectByVisibleText("-- new customer --");
	 }
	 public void getcustomerName()
	 {
		 customername.sendKeys("bhima");
	 }
	 public void getProjectName()
	 {
		 projectname.sendKeys("mtv");
	 }
	 public void getEnterTaskName()
	 {
		 entertaskname.sendKeys("splitsvilla");
	 }
	 public void getClickenewTask()
	 {
		 createtask.click();
	 } 
	}

