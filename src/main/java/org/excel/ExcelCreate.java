package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate {
	public static void main(String[] args) throws  IOException {
		
		//file loc
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_11pm\\src\\test\\resources\\ds.xlsx");
		Workbook w= new XSSFWorkbook();
		Sheet s = w .createSheet("Sheet1");
		
		Row r = s.createRow(1);

		
		Cell cell = r.createCell(0);
		
		cell.setCellValue("Gayathri");
		FileOutputStream f0=new FileOutputStream(f);
		w.write(f0);
		
		System.out.println("DONE");
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
