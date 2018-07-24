package com.actitime.genericlib;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fileutils
{

String excelpath="./test-data/testdata.xlsx";

	 String propertyfilepath="./test-data/comman.properties";	
	 
	public Properties getpropertyobj() throws Throwable 
	{
		FileInputStream fis=new FileInputStream(propertyfilepath);
		 Properties pobj=new Properties();
		 pobj.load(fis);
		 return pobj;
	}
	
	public String getexceldata(String sheetname, int rownum, int colnum) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(excelpath);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		
		Row row=sh.getRow(1);
		String data=row.getCell(colnum).getStringCellValue();
		
		wb.close();
		
		return data;
	}
	public void setexceldata(String sheetname, int rownum, int colnum,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		
		Row row=sh.getRow(1);
		Cell cel=row.createCell(colnum);
		cel.setCellValue(data);
	
		FileOutputStream fos=new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
	
	
	}
	}
	
	
	
	
	


	 
			 


	

