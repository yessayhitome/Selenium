package com.Shop_Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sh = wb.getSheetAt(0);
		
		int numberrow = sh.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberrow; i++) {
			
			Row r = sh.getRow(i);
			
			int numbercell = r.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numbercell; j++) {
				
				Cell c = r.getCell(j);
				
				CellType ct = c.getCellType();
				
				if (ct.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					
				}
				
				else if (ct.equals(CellType.NUMERIC)) {
					
					double d = c.getNumericCellValue();
					
					int a = (int)d;
					
					String value = String.valueOf(a);
				}
			}
			
		}
		
		wb.close();
		
	}

}
