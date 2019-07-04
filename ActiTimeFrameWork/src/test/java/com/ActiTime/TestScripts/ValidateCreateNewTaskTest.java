package com.ActiTime.TestScripts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ActiTime.GenericLib.BaseClass;
import com.ActiTime.ObjectRepositiory.OpenTasks;

public class ValidateCreateNewTaskTest extends BaseClass
{
@Test(priority=1)
public void validateNewTask() throws EncryptedDocumentException, IOException
{
	OpenTasks task = PageFactory.initElements(driver, OpenTasks.class);
	task.getClickOnTasks();
	String actual = task.getValidteOpenTask();
	String expected = data.getdataFromExcel("Acti_Time", 2, 4);
	Assert.assertEquals(actual, expected);
}	
}
