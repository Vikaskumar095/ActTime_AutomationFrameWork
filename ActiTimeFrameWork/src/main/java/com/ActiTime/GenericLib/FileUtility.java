package com.ActiTime.GenericLib;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility 
{
	public String getDataFromProperty(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./TestData/ActTime_CommonData.properties");
        Properties pro = new Properties();
        pro.load(file);
		String value = pro.getProperty(key);
		return value ;		
	}
	public String getdataFromExcel(String sheet_name, int row_no, int cell_no) throws EncryptedDocumentException, IOException
	{	
		FileInputStream file = new FileInputStream("./TestData/ActiTime.xlsx");
        Workbook  book = WorkbookFactory.create(file);
        Sheet Sheet = book.getSheet(sheet_name);
        Row row = Sheet.getRow(row_no);
        Cell cell = row.getCell(cell_no);
        return cell.getStringCellValue();
	}
}
