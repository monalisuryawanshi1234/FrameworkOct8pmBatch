package com.swaglabs.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility
{
	//screeenshot
	public static void screenshot(WebDriver driver)
	{
		 //TakesScreenshot ts=(TakesScreenshot) driver;
			//File temp=  ts.getScreenshotAs(OutputType.FILE);//file class return store in file
			//create folder store path that folder
			 //File dest=new File("./"+"\\Screenshots\\google.png");//location of file
			  
			try {
				FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./"+"\\Screenshots\\swaglabs"+System.currentTimeMillis()+".png") );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //filehandler class
			
	}
	
	
	
	
	
	
	//Explicit wait
	public static  WebElement waitForPrsenceofElement(WebDriver driver,By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public static WebElement waitforvisibilityofElement(WebDriver driver,By locator)
	{

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
	}

	
	public static WebElement waitforElementtobeclick(WebDriver driver,By locator)
	
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	public static boolean waitForTitleToMatch(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.titleContains(title));
	}
	
	
	public static boolean waitForurlToMatch(WebDriver driver,String url)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//select based dropdown
public static void selectBaseddropd(WebElement ele,String value)
	
	{
		Select dd=new Select(ele);
		System.out.println("Is dropdown support for multiple selection:"+dd.isMultiple());
		
		//all values select
		List<WebElement> alloptions= dd.getOptions();
		
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}
	
	
	





       //javascript executer
		public static void scrollUp(WebDriver driver)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;//declare
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			
		}
		
		public static void scrollDown(WebDriver driver)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;//declare
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
		}
		
}
