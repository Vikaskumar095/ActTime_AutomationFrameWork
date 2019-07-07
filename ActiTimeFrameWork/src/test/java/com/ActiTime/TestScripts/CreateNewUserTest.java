package com.ActiTime.TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ActiTime.GenericLib.BaseClass;
import com.ActiTime.ObjectRepositiory.CreateNewTask;
import com.ActiTime.ObjectRepositiory.OpenTasks;

public class CreateNewUserTest extends BaseClass
{
  @Test(priority=2)
  public void createNewCustomer() 
  {   OpenTasks task = PageFactory.initElements(driver, OpenTasks.class);
	  CreateNewTask tasks = PageFactory.initElements(driver,CreateNewTask.class);
	  task.getClickOnTasks();
	  tasks.getNewTask();
	  tasks.getCustomerId();
	  tasks.getcustomerName();
	  tasks.getProjectName();
	  tasks.getEnterTaskName();
	  tasks.getClickenewTask();
  }
}