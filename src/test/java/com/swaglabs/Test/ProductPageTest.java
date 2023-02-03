package com.swaglabs.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseClass
{
	// @BeforeClass
	
	 //public void pagesetup()
	 //{
	//	 lp.dologin("standard_user","secret_sauce");
	// }
	

	
  @Test(priority=1)
  public void verifyproductcount()
  {
	System.out.println("product count is:"+pp.getproductcount().size());
	  
  }
  @Test(priority=2)
  
	public void verifyproductlist()
	{
	  pp.printproductlist();
	}
  
  @Test(priority=3)
	   public void verifyproductaddedtocart()
	   {
		   pp.addproducttocart("Sauce Labs Fleece Jacket");
	   }
	  
	  
	  
	  
	  
	  
	  
  }

