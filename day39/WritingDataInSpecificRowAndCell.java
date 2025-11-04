package day39;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\filespecrow_cell.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(1).setCellValue("Java");
		row1.createCell(2).setCellValue("Python");
		row1.createCell(3).setCellValue("Automation");
		
		workbook.write(file);;//Attach workbok to the file
		workbook.close();
		file.close();
		
		System.out.println("File is created..........");

	}

}
