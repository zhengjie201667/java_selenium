package com.java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalPagePO {
	public WebDriver driver;

	By invitePeopleBtn = By.xpath("//*[@class=\"close\" and @data-dismiss=\"modal\"]");
	By moreApplicationBtn = By.xpath("//*[@id=\"more-menu\"]/a");
	By knowledgeDoc = By.xpath("//a[@title=\"知识文档\"]");
	
	public PortalPagePO(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement invitePeopleBtn() {
		return driver.findElement(invitePeopleBtn);
	}
	
	public WebElement moreApplicationBtn() {
		return driver.findElement(moreApplicationBtn);
	}
	
	public WebElement knowledgeDoc() {
		return driver.findElement(knowledgeDoc);
	}
	
}
