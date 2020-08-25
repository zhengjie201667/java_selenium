package com.java.test;

import org.testng.annotations.Test;

import com.java.base.Base;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest extends Base{
  @Test
  public void f() {
	  startBrowser();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
