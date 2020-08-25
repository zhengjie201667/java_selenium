package com.java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePO {
	public WebDriver driver;
	
	By username = By.xpath("//*[@id=\"username\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By submitBtn = By.xpath("//*[@id=\"loginForm\"]/div[5]/button");
	
	public LoginPagePO(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement userName() {
		return driver.findElement(username);
	}
	
	public WebElement passWord() {
		return driver.findElement(password);
	}
	
	public WebElement submitBtn() {
		return driver.findElement(submitBtn);
	}
}
