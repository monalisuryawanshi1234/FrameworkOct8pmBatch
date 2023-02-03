package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDescriptionPage
{
	
private	WebDriver driver;
	

//initialize driver
	
  public OrderDescriptionPage(WebDriver driver)
  {
	this.driver=driver;
	
  }
	
  //identi  locator
  
  private By desc=By.id("checkout_summary_container");
  private By cancelbtn=By.id("Cancel");
  private By finishbtn=By.id("finish");
  private By msg=By.xpath("//h2[contains(text(),'THANK')]");
  
  //action
  
  public void dofinish()
  {
  System.out.println("***********product overview**********");
	String text= driver.findElement(desc).getText();
	System.out.println(text);
	
	driver.findElement(finishbtn).click();
	String res=driver.findElement(msg).getText();
	System.out.println(res);
  }
  
  public void docancel()
  {
	  driver.findElement(cancelbtn).click();  
  }
  
  public String getapptitle()
  {
	 return  driver.getTitle();
  }
  

  public String getappcurrenturl()
  {
	  return driver.getCurrentUrl();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
