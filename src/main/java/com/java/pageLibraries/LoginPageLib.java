package com.java.pageLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.java.pageObjects.LoginPagePO;

public class LoginPageLib extends LoginPagePO{

	public LoginPageLib(WebDriver driver) {
		super(driver);
	}
	
	public void login() {
		File file = new File("Configs\\GlobalData.properties");
		Properties properties = null;
		InputStream inStream;
			try {
				inStream = new FileInputStream(file);
				properties = new Properties();
				properties.load(inStream);
			} catch (Exception e) {
				e.printStackTrace();
			}
		userName().sendKeys(properties.getProperty("username"));
		passWord().sendKeys(properties.getProperty("password"));
		submitBtn().click();
	}
}
