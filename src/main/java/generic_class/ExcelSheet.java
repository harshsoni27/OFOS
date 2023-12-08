package generic_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	public String readData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		File path=new File("./src/test/resources/TestData/testData(1).xlsx");
		FileInputStream fis=new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
		System.out.println(data);
		return data;
		
	}
}
