package com.ActiTime.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib 
{
   static WebDriver driver;
   public WebElement wb = null;
   Select select = new Select(wb);
   
public void allWebElementWait()
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
public void selectByIndex(int index)
{
	 select.selectByIndex(index);
}
public void selectByValue(String value)
{
	select.selectByValue(value);
}
public void selectByVisibleText(String text)
{
	select.selectByVisibleText(text);
}
}
