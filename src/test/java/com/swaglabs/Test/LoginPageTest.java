package com.swaglabs.Test;

import org.testng.annotations.Test;
import com.swaglabs.pages.LoginPage;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifycurrenturl()
  {
	 String curl= lp.getAppCurrentUrl();
	 System.out.println(curl);
	 
	 
  }
  
  @Test (priority=2)
  public void verifylogin()
  {
	 lp.dologin("standard_user","secret_sauce");  
  }
  
  @Test (priority=3)
  public void verifypagetitle()
  {
	  System.out.println( lp.getAppTitle()); 
  }
}
