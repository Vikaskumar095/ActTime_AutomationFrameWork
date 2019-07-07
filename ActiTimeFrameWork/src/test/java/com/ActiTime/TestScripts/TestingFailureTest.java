package com.ActiTime.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActiTime.GenericLib.BaseClass;

@Listeners(com.ActiTime.GenericLib.CustomListener.class)
public class TestingFailureTest extends BaseClass 
{
  @Test
  public void  test1() 
  {
    Assert.assertEquals(true, false);	  
  }
}
