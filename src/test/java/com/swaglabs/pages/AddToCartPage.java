package com.swaglabs.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{

	
	private WebDriver driver;
	
	//initialize driver
	
	public  AddToCartPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	//identification//locator
	private By cartbtn=By.xpath("// a[@class='shopping_cart_link']");
	private By removebtn=By.xpath("// button[text()='Remove']");
	private By contbtn=By.xpath("// button[text()='Continue Shopping']");
	private By checkbtn=By.xpath("// button[text()='Checkout']");
	
	
	
	//action
	//open addtocartpage
	public void getcartpage()
	{
		driver.findElement(cartbtn).click();
	}
	
	
	public void docontinueshopping()
	{
	     driver.findElement(contbtn).click();
	}
	
	public void doremove()
	{
		driver.findElement(removebtn).click();
	}
	
	public void docheckout()
	{
		driver.findElement(checkbtn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
