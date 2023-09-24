package Library_Files;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class {

	
	
	
	  public static String getDATAFROMEXCELsheet(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	  {
		  FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Application_Form\\TestData\\Test_Data_Excel_Sheet.xlsx");
		  String s1=WorkbookFactory.create(file).getSheet("Sheet12").getRow(rowindex).getCell(cellindex).getStringCellValue();
		  return s1;
	  }
}
