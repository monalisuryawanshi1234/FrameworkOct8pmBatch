package com.swaglabs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage 
{

	private WebDriver driver;
	
	//initialize driver
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//identification
	
	private By totalproduct=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']");
	private By addtocartbtn=By.xpath("//button[text()='Add to cart']");
	private By cartbtn=By.xpath("// a[@class='shopping_cart_link']");
	//action
	
	
	public List<WebElement> getproductcount()
	{
		return driver.findElements(totalproduct);	
	}
	
	public void printproductlist()
	{
		List<WebElement> list= driver.findElements(totalproduct);
		System.out.println("********************product name*************");
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	public void addproducttocart(String pname)
	{
		//String exp="Sauce Labs Fleece Jacket";
		List<WebElement> list= driver.findElements(totalproduct);
		
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
				
			}
		}
		
		driver.findElement(addtocartbtn).click();
		System.out.println("product added to cart");
		//driver.findElement(cartbtn).click();
	}
	
	
}
