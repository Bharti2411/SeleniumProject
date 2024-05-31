package com.crm.listerner;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtils {
	public String getDataFRomExcel(String sheetName,int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("C:\\xlsx\\DwsGiftCard.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		Sheet sheet = w1.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);  //enter coloumn number
		String value = cell.getStringCellValue();
		
		
		return value;
	}
}
