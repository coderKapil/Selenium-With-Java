package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)find total number of rows in a table
		//use this if u have multiple tables in ur webpage
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//		driver.findElements(By.tagName("tr")).size();
//		System.out.println("Number of rows: "+rows);
		
		//2)find total number of columns in a table
		//this approach will be useful if u have multiple table in ur webpage
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//this approach is useful if ur having a single table in ur webpage
//		int cols = driver.findElements(By.tagName("th")).size();
//         System.out.println("Number of columns: "+cols);
		
		//3)Read data from specific row and column(ex: 5th row and 1st column)
//		String bookName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[4]//td[1]")).getText();
//		String bookName =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[7]//td[3]")).getText();
//         System.out.println(bookName);
		
		//read data from from all rows and column
		//here r and c are indexes of rows and cols
		//header
//		System.out.print("Book Name"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
//		System.out.println();
	//bcs 1st row is header we are skipping it thats why we are starting loop from second row	
//		for(int r=2; r<=rows; r++) {
//			for(int c=1; c<=cols; c++) {
//	String values =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();	
//	      System.out.print(values+"\t");
//			}
//			System.out.println();
//		}
//         
         
        //print book name whose author is Mukesh
		
		/*for(int r=2; r<=rows; r++) {
   String authorName =  driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	    
	    if(authorName.equals("Mukesh")) {
	String bookName = driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
	System.out.println(bookName+"\t"+authorName);
	    }
		}
		*/
		
		//find total price of all the books
		int total = 0;
		for(int r=2; r<=rows; r++) {
	String prices = driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
	//here we are converting prices from string to integer format to perform arithmetic operation
	total = total+Integer.parseInt(prices);
		}
		System.out.println("ttoal price of all books: "+total);
		
		
         
         
         
         
         
         
         
         
         
	}

}
