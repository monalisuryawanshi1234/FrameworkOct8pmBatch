package com.swaglabs.Utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propfile 
{
	public static Properties p1;
	public Propfile ()//constructor
	{
		p1=new Properties ();
	File f1=new File("./"+"\\testdata\\config.properties");	
	try {
		FileInputStream fs=new	FileInputStream (f1);//at a time 2 exception handle
		p1.load(fs);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}
	public  static String getdata(String key)
	{
		return p1.getProperty(key);
	}
	
	
	
	
	
	
	
	
	
	
	
}
