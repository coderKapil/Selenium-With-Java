package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//total number of pages since here is 4 so no need to do any special use it in loop
	//repeating pages
	for(int p=1; p<=4; p++) {
		Thread.sleep(1000);
		if(p>1) {
	WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//a[normalize-space()="+p+"]"));
	active_page.click();
	Thread.sleep(5000);
		}
		
	//getting total num of rows count
	int num_of_rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		
	//reading data from particular page
	for(int r=1; r<=num_of_rows; r++) {
		//getting name from table
String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
//getting price from table
String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
System.out.println(name+"\t"+price);
//sELECTING THE CHECKBOX
  driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input")).click();
	}		
		
	}
	}

}
