package com.swaglabs.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OrderDescriptionPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifytitle()
  {
	  String exp="Swag";
	  if(op.getapptitle().contains(exp))
	  {
		  System.out.println("title is matching");
	  }else
	  {
		  System.out.println("title is not matching");
	  }
  }
	  @Test (priority=2)
	  
	  public void verifycurrenturl()
	  {
		 String exp="demo";
		 if(op.getappcurrenturl().contains(exp))
		 {
			 System.out.println("url is matching");
		  }else
		  {
			  System.out.println("url is not matching");
		  }
	  }
		  
 @Test (priority=3)
	  
	  public void verifyorder()
	  {
	      op.dofinish();
	  }
	  
	  
	  
	  
	 

  }	  
  


