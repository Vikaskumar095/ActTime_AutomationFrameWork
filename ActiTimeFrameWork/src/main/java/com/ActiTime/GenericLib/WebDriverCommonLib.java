package com.ActiTime.GenericLib;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib extends BaseClass 
{
   public static WebDriver driver;
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
