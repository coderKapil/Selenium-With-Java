package day36;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
//single file upload
//	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Testing Demo files\\Test1.txt");
//	
//	if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt")) {
//		System.out.println("File uploaded successfully!!!");
//	}
//	else {
//		System.out.println("Failed to upload!!!");
//	}
		
		
//Multiple file upload
	String file1 = "C:\\Testing Demo files\\Test1.txt";
	String file2 = "C:\\Testing Demo files\\Test2.txt";
	
	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);	
	int noOfFilesUploaded =  driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	
	//validation 1 - no of files
	if(noOfFilesUploaded == 2) {
		System.out.println("All files are uploaded!!!");
	}
	else {
		System.out.println("Files are not uploaded or incorrect files uploaded!!!");
	}
	
	//validating file name
	if( driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt")
		&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.txt")) {
		System.out.println("File names matching...");
	}
	else {
		System.out.println("File name not matching...");
	}
	
	
	
	
	
	
	
	
	
	
	

	}

}
