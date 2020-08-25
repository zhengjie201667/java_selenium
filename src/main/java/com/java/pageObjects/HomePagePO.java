package com.java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePO {
	public WebDriver driver;
	By loginBtn = By.xpath("//*[@id=\"top-btn-login\"]");
	
	public HomePagePO(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * @author Justin
	 * @登录界面
	 */
	public WebElement loginBtn(WebDriver driver) {
		
		return driver.findElement(loginBtn);
	}
}
