package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameter {
	public static String getExelDeta(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new FileInputStream("F:\\WorkSpace\\KhanAcademy\\src\\test\\resources\\SwagLabsTestCases.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	
	return value;
	
	

}
}