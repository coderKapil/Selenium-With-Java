package day39;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//ExcelFile -- workbook---sheet -- row-- cells
public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
	//we have to read 
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamic.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("DynamicData");
		
		int totalrow = sheet.getLastRowNum();
		int totalcell = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows: "+totalrow);//3
		System.out.println("Total number of cols: "+totalcell);//3
		
		//reading data
		for(int r=0; r<=totalrow; r++) {
		//extracting each row from sheet to access each cell present inside that row
			XSSFRow currRow=sheet.getRow(r);
			for(int c=0; c<totalcell; c++) {
		//extracting each cell from particular row
				XSSFCell cell=currRow.getCell(c);
		//after accessing cell printing value present in that cell
				System.out.print(cell.toString()+" ");
			}
			System.out.println();
		}
		
//ONCE job is completed close workbook and file because they are occupying some memory so we have to clear that memory
		workbook.close();
		file.close();
		
		
		
		
		
		
		
		

	}

}
