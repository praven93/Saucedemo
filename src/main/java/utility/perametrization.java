package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class perametrization {
	 public static String getExcelData( int row ,int cell,String sheetname) throws EncryptedDocumentException, IOException {
			
		    FileInputStream file = new FileInputStream("C:\\Users\\prvee\\eclipse-workspace\\zerodhakite\\src\\main\\resources\\Testdata.xls");
		    
	      String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	         
	      return value;
}


	
}