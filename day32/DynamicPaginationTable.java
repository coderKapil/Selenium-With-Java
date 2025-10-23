package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/TlbeVW/");
		driver.manage().window().maximize();
		
		//USERNAME
		driver.findElement(By.id("input-username")).sendKeys("demo");
		//password
		driver.findElement(By.id("input-password")).sendKeys("demo");
		
		//customer table main menu
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		//customer sub-menu
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		
		//Showing 1 to 10 of 27202 (2721 Pages)
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		//repeating pages
		for(int p=1; p<=total_pages; p++) {
			if(p>1) {
	  WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
	  active_page.click();
	  Thread.sleep(5000);//to wait after every click 
			}
//getting total number of rows count	
int no_of_rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
//reading data from particular page			
for(int r=1; r<=no_of_rows; r++) {
	//getting customer name from table
String cust_name = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
String cust_email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();	

System.out.println(cust_name+"\t"+cust_email);
		
		}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
