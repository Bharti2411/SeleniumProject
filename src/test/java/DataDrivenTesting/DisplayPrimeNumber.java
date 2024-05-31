package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DisplayPrimeNumber {
private int num;

@Test
	public boolean DisplayData() throws EncryptedDocumentException, IOException {
	File path= new File ("C:\\Users\\Bharti\\Desktop\\Selenium\\loginFile.xlsx");
	FileInputStream fis= new FileInputStream(path);
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sheet= wb.getSheet("Sheet2");
	int row= sheet.getPhysicalNumberOfRows();
	int column= sheet.getRow(0).getPhysicalNumberOfCells();
	for(int i=2; i<num;i++) {
		if(num% i==0) {
			return false;
		}
			
		}
	return true;

	}

}
