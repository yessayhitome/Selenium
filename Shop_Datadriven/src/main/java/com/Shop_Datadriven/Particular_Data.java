package com.Shop_Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sathi\\eclipse-workspace\\Shop_Datadriven\\Excel\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sl = wb.getSheetAt(0);
		
		Row ro = sl.getRow(2);
		
		Cell ce = ro.getCell(1);
		
		CellType ct = ce.getCellType();
		
		if (ct.equals(CellType.STRING)) {
			
			String value = ce.getStringCellValue();
			System.out.println(value);
			
		}
		
		else if(ct.equals(CellType.NUMERIC)) {
			
			double d = ce.getNumericCellValue();
			
			int a = (int) d;
			
			String value = String.valueOf(a);
			System.out.println(value);
		}
		
		wb.close();
		
	}

}
