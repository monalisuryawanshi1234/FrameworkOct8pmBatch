package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	//encapsulation
	private WebDriver driver;
	
	//Initialize current class driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Identify By Locator
	
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By lbtn=By.id("login-button");
	
	//action 
	
	public void dologin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(lbtn).click();
	}
	
	public String getAppCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	

}
