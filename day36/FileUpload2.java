package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/upload");
		
		//single file upload
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("C:\\Testing Demo files\\ganpati.jpg");
		driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();
		Thread.sleep(5000);
		String uploadtext = driver.findElement(By.xpath("//p[normalize-space()='1761704170635_ganpati.jpg']")).getText();
		Thread.sleep(5000);
		if(uploadtext.contains("ganpati.jpg")) {
			System.out.println("File uploaded successfully!!!");
		}
		else {
			System.out.println("Failed to uploda file!!!");
		}
	}

}
