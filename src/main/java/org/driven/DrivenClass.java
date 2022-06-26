package org.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DrivenClass {
	public static void main(String[]args, Date dd ) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_11pm\\src\\test\\resources\\Book1.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		
	Workbook w = new XSSFWorkbook(fi);
	
	
	  Sheet s = w.getSheet("Sheet1");
	
	 Row r = s.getRow(1);
	 Cell cell = r.getCell(2);
		
	//CELL TYPE
	 int type = cell.getCellType();  //STRING----TYPE1
     System.out.println(type);   //NUMBER,DATE----TYPE2
	
    	 
   	 if(type==1) {
    		 String value = cell.getStringCellValue();
   		 System.out.println(value);
   	 }else {
   		 if(Date.isCellDateFormatted(cell)){
  			 Date dd1 = cell.getDateCellValue();
  			 
    			 
   			 SimpleDateFormat sd= new SimpleDateFormat("dd-MMM-yyyy");
   			 String value = sd.format(dd1);
   			 System.out.println(value);
    		 }else {
   			 double db = cell.getNumericCellValue();
    			 long ln=(long)db;
   			 
  			String value= String.valueOf(ln);
    			 System.out.println(value);
  		 }
   		 
  	 }}}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


