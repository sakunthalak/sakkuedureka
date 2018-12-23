package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static String[][] getData(String filePath,String fileName,String sheetName) throws IOException
	{
		File file=new File(fileName);
		FileInputStream input=new FileInputStream(file);
		Workbook Wb=new XSSFWorkbook(input);
		Sheet sh=Wb.getSheet(sheetName);
		int rowNum = sh.getLastRowNum() + 1;
		int colNum = sh.getRow(0).getLastCellNum();
		String[][] data = new String[rowNum][colNum];

		for (int i = 0; i < rowNum; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < colNum; j++) {
				Cell cell = row.getCell(j);				
				String value = new DataFormatter().formatCellValue( cell);
				data[i][j] = value;
			}
		}
		return data;
		
	}
	
}
