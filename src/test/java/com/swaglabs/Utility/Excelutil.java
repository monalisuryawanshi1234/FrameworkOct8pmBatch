package com.swaglabs.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil
{
	public  static XSSFWorkbook wb;
	public Excelutil()
	{
		
		
		//path of file setup
		 File f1=new File("./"+"\\Testdata\\Data.xlsx"); 
		  
		  //file data read
		 FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			wb =new XSSFWorkbook(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  //workbook--->sheet--->row---->cell---->value
		 
		
		 
	}
	
	public static  String getfiledata(int row,int col)
	{
		return wb.getSheet("userdata").getRow(row).getCell(col).getStringCellValue();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
