package com.swaglabs.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserprovider
{
    public static  WebDriver driver;
	public static WebDriver browsersetup(String bname)
	
	{
		if(bname.equalsIgnoreCase("chrome"))
		  {
			  driver=new ChromeDriver();
		  }else if(bname.equalsIgnoreCase("edge"))
		  {
			  driver=new EdgeDriver(); 
			  
		  }else if(bname.equalsIgnoreCase("firefox"))
		 {
			  driver=new FirefoxDriver();
	     }
		driver.get(Propfile.getdata("url"));
		return driver;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
