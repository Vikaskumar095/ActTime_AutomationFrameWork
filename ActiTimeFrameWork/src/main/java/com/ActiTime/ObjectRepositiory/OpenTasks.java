package com.ActiTime.ObjectRepositiory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;
//import com.ActiTme.GenericLib.WebDriverCommonLib;
public class OpenTasks 
{
 @FindBy(xpath="//div[text()='Tasks']")
 private WebElement tasks; 
 @FindBy(xpath="//td[contains(text(),'Open Tasks')]")
 private WebElement opentask;
 
 public void getClickOnTasks()
 {
	 tasks.click();
 }
 public String getValidteOpenTask()
 {
	 return opentask.getText();
 }
}
