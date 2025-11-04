package day39;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
	FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamic.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook();
	
	XSSFSheet sheet = workbook.createSheet("DynamicData");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want ? ");
	int numOfRows = sc.nextInt();
	System.out.println("Enter how many cells you want ?");
	int noOfCells = sc.nextInt();
	//this loop is for creating the rows
	for(int r=0; r<=numOfRows; r++) {
		XSSFRow currRow=sheet.createRow(r);
		//this iner loop si for creating the cells in a particular row
		for(int c=0; c<noOfCells; c++) {
			XSSFCell cell=currRow.createCell(c);
			cell.setCellValue(sc.next());//next meth will capture or take everything as a string
		}
	}
	
	workbook.write(file);;//Attach workbok to the file
	workbook.close();
	file.close();
	
	System.out.println("File is created..........");
	
	}

}
