package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_11pm\\src\\test\\resources\\ds.xlsx");
FileInputStream fi=new FileInputStream(f);
Workbook w= new XSSFWorkbook(fi);
Sheet s= w.getSheet("Sheet1");
Row r= s.getRow(1);
Cell c = r.createCell(1);
c.setCellValue("Chennai");

FileOutputStream fo=new FileOutputStream(f);
w.write(fo);


System.out.println("DONE");




		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
