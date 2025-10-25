package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	//selecting future date
	static void selectFutureDate(WebDriver driver, String month, String year,String date) {
		//thsi logic will select month and year
//because we dont know how many times this loop will run thats why we have put while true condition here		
		while(true) {
	String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month
	String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual year 
//if currmonth and curryear is matching with the expected one just break with the loop for month and year selection	
	     if(currentmonth.equals(month) && currentyear.equals(year)) {
	    	     break;
	     }
//if not then go with the next button
	     driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next
		}
		//now this logic will select the date
				List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				
				for(WebElement dt:alldates) {
				//if curr date is equals to expetced date
					if(dt.getText().equals(date)) {
						dt.click();//click on that date which is equal
						break;//no further comparison needed once it matches break from the loop
					}
				}
	}
	
	//selecting the past date
		static void selectPastDate(WebDriver driver, String month, String year,String date) {
			//thsi logic will select month and year
	//because we dont know how many times this loop will run thats why we have put while true condition here		
			while(true) {
		String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month
		String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual year 
	//if currmonth and curryear is matching with the expected one just break with the loop for month and year selection	
		     if(currentmonth.equals(month) && currentyear.equals(year)) {
		    	     break;
		     }
	//if the month and year is previous year not future then click on prev button
		     driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			//now this logic will select the date
					List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
					
					for(WebElement dt:alldates) {
					//if curr date is equals to expetced date
						if(dt.getText().equals(date)) {
							dt.click();//click on that date which is equal
							break;//no further comparison needed once it matches break from the loop
						}
					}
		}

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);//bcs i have only one frame thats why 0 index
		
		//Method 1 - using sendKeys()

//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("23/10/2025");//mm/dd//yyyy
		
		//Method 2- 
//		using date picker
		//this is the expected data
		String year = "2023";
		String month = "April";
		String date = "10";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//open date picker
//		selectFutureDate(driver, month, year, date);
		selectPastDate(driver, month, year, date);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
