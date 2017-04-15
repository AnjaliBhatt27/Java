package excelprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelprogram1 {
	
	public static void main(String[] args) throws IOException {
	
	File f = new File("A:\\Book1.xlsx");
	FileInputStream fs = new FileInputStream(f);
	XSSFWorkbook wk = new XSSFWorkbook(fs);
	XSSFSheet s1 = wk.getSheet("Sheet1");
	System.out.println(s1.getPhysicalNumberOfRows());
	XSSFRow r1	 = s1.getRow(5);
	System.out.println(r1.getPhysicalNumberOfCells());
	XSSFCell c1 = r1.getCell(1);
	System.out.println(c1.getStringCellValue());
		
	
}
}
		
	


