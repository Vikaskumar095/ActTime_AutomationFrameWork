package com.ActiTime.GenericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends BaseClass implements ITestListener 
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("failed testcase:-");
		 String testmethod = result.getName();
		 System.out.println(testmethod);
		 //EventFiringWebDriver ef = new EventFiringWebDriver(BaseClass.driver);
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destination = new File("./ScreenShots/"+testmethod+".png");
			try 
			{
			   FileUtils.copyFile(source, destination);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
}
