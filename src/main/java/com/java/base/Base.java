package com.java.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver = null;
	
	public void startBrowser() {
		File file = new File("Configs\\GlobalData.properties");
		Properties properties = null;
		try {
			InputStream inStream = new FileInputStream(file);
			properties = new Properties();
			properties.load(inStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String browser = properties.getProperty("browser");
		System.out.println(browser);
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","Configs\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","Configs\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}
		
		String url = properties.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
}
