package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_11pm\\src\\test\\resources\\Book1.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		
	Workbook w = new XSSFWorkbook(fi);
	
	
	     Sheet s = w.getSheet("Sheet1");
	
	 Row row = s.getRow(1);
		
	
	//int rows = s.getPhysicalNumberOfRows();
	//System.out.println(rows);
	
	
	//int cells = row.getPhysicalNumberOfCells();
	//System.out.println(cells);
		
	for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
		Cell cell = row.getCell(i);
		System.out.println(cell);
		
	}	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
