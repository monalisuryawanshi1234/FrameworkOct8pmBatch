package com.swaglabs.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseClass
{
	
	//@BeforeClass
	
	// public void pagesetup()
	// {
	//	 lp.dologin("standard_user","secret_sauce");
	//	 pp.addproducttocart("Sauce Labs Backpack");
		 	  
	// }
	
  @Test(enabled=false)
  public void verifyremoveproduct()
  
  {
	  ap.getcartpage();
	  ap.doremove();
	  
	  
  }
  @Test(enabled=false)
  public void verifyccontinueshopping()
  
  {
	  ap.getcartpage();
	  ap.docontinueshopping();
  }
  
  @Test
  public void verifycheckout()
  
  {
	ap.getcartpage();
	ap.docheckout();
  }

}

























