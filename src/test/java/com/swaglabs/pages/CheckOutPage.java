package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage
{
	private WebDriver driver;
	
	//initialize driver
	public CheckOutPage(WebDriver driver)
	{
		this .driver=driver;
	}
	
	
	//identification locator

	private By firstname=By.id("first-name");
	private By lastname=By.id("last-name");
	private By zipcode=By.id("postal-code");
	private By cancelbtn=By.id("cancel");
	private By continuebtn=By.id("continue");
	
	
	
	//action
	
	public void docontinue(String fname,String lname,String zcode )
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zcode);
		System.out.println("first name,last name and zip code has entered!");
		driver.findElement(continuebtn).click();
	}
	
	public void docancel() 
	{
		
		driver.findElement(cancelbtn).click();
		
	}
	
	
	public void docancel(String fname,String lname,String zcode ) 
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zcode);
		System.out.println("first name,last name and zip code has entered!");
		driver.findElement(cancelbtn).click();
		
	}
	
	
	
	
	
	
	

}
