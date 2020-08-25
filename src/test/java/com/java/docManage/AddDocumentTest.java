package com.java.docManage;

import org.testng.annotations.Test;

import com.java.base.Base;
import com.java.pageLibraries.LoginPageLib;
import com.java.pageObjects.HomePagePO;
import com.java.pageObjects.LoginPagePO;
import com.java.pageObjects.PortalPagePO;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class AddDocumentTest extends Base{
  @Test
  public void addDocument() {
	  //点击登录按钮
	  HomePagePO homePagePO = new HomePagePO(driver);
	  homePagePO.loginBtn(driver).click();
	  
	  LoginPageLib loginPageLib = new LoginPageLib(driver);
	  loginPageLib.login();
	  
	  PortalPagePO portalPagePO = new PortalPagePO(driver);
	  portalPagePO.invitePeopleBtn().click();
	  
	  Actions actions = new Actions(driver);
	  actions.moveToElement(portalPagePO.moreApplicationBtn()).perform();
	  
	  actions.moveToElement(portalPagePO.knowledgeDoc()).click().perform();
  }
  @BeforeClass
  public void beforeClass() {
	  startBrowser();
  }

  @AfterClass
  public void afterClass() {
  }

}
