package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f=new File(".\\TESTDATA\\Testdata.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook Workbook = WorkbookFactory.create(fis);
		String testdata = Workbook.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
	    System.out.println(testdata);
		

	}

}
