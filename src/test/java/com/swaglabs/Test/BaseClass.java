package com.swaglabs.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.swaglabs.Utility.*;
import com.swaglabs.pages.*;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public ProductPage pp;
	public AddToCartPage ap;
	public CheckOutPage cp;
	public OrderDescriptionPage op;
	public Propfile p;
	public Excelutil excel;
	public Utility utl;
	@BeforeTest
	public void setup()
	{
	p=new Propfile(); 
	
	//driver=new ChromeDriver();
	//driver.get(Propfile.getdata("url"));	
	driver=Browserprovider.browsersetup(Propfile.getdata("bname"));
	lp=new LoginPage(driver);
	pp=new ProductPage(driver);
	ap=new AddToCartPage(driver);
	cp=new CheckOutPage(driver);
	op=new OrderDescriptionPage(driver);
	excel=new Excelutil();
	utl=new  Utility ();
	
	}
	
	
	@BeforeClass
	
	 public void pagesetup()
	 {
		// lp.dologin(Propfile.getdata("uname"),Propfile.getdata("psw"));
		lp.dologin(Excelutil.getfiledata(0, 0), Excelutil.getfiledata(0, 1));
		 staticwait();
		 Utility.screenshot(driver);
		 pp.addproducttocart(Propfile.getdata("pname"));
		 staticwait();
		 Utility.screenshot(driver);
		 ap.getcartpage();
		 staticwait();
		 Utility.screenshot(driver);
		 ap.docheckout();	
		 staticwait();
		 Utility.screenshot(driver);
		 cp.docontinue(Propfile.getdata("fname"),Propfile.getdata("lname"),Propfile.getdata("zcode"));
		 staticwait();
		 Utility.screenshot(driver);
	 }
	
	public void staticwait()
	{
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
