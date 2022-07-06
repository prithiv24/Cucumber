package org.fb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
public static Map<String,String> getData() throws IOException{
	Map<String, String> data = new HashMap<String, String>();
	try {
		FileInputStream fileinput= new FileInputStream("C:\\Users\\Prithiv\\eclipse-workspace\\Cucumber\\ExcelSheet\\FaceBook.xlsx");
		Workbook workbook = new XSSFWorkbook(fileinput);
		Sheet sheet= workbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		
		
		
		for(int i =0;i<=lastRowNum;i++) {
		Row row= sheet.getRow(i);
		Cell keycell = row.getCell(0);
		String key= keycell.getStringCellValue().trim();
		Cell valuecell = row.getCell(1);
		String value = valuecell.getStringCellValue().trim();
		data.put(key, value);
		}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	return data;
	
}
}
