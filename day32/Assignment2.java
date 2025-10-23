package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//login 
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//Admin panel
		driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
		
		//total number of row count
	int no_of_rows = driver.findElements(By.xpath("//div[@role='rowgroup']//div//div[@role='row']")).size();
	int col = driver.findElements(By.xpath("//div[@role='table']//div[@role='columnheader']")).size();
	//reading data from each row
	for(int r=1; r<=no_of_rows; r++) {
		//extract username
	String username = driver.findElement(By.xpath("//div[@role='rowgroup']//div[2]//div[1]//div["+col+"]//div[1]")).getText();
	String userRole = driver.findElement(By.xpath("//div[@role='rowgroup']//div[2]//div[1]//div["+col+"]//div[1]")).getText();
	System.out.println(username+"\t"+userRole);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
