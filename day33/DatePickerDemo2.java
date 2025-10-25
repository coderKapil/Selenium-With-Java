package day33;


import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	//userDefined method for converting month from string--> month object
	static Month convertMonth(String month) {
		HashMap<String,Month> monthMap = new HashMap<String,Month>();
		monthMap.put("January",Month.JANUARY);
		monthMap.put("February",Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth = monthMap.get(month);
		
		if(vmonth == null) {
			System.out.println("Invalid month");
		}
		return vmonth;
	}
	
	static void selectDate(WebDriver driver, String requireddate,String requiredyear, String requiredmonth) {
		//select the year
		WebElement yeardpdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear = new Select(yeardpdown);
		selectYear.selectByVisibleText(requiredyear);
		
		//select month
		while(true) {
		//this is the displayed month in our date picker now we have to compare it with our actual nonth
		String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		//convert requiredMonth and displayMonth into Month object
		Month reqMonthObj = convertMonth(requiredmonth);
		Month displayMonthObj = convertMonth(displayMonth);
		
		//compare
		int result = reqMonthObj.compareTo(displayMonthObj);
		//0 - months are equal
		//>0 - Future month
		//<0 - past month
		
		if(result < 0) {
			//past month
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		else if(result > 0) {
			//future month
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		else {
			break;
		}
		}
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt: allDates) {
			if(dt.getText().equals(requireddate)) {
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://date-picker.tiiny.site/");
		driver.manage().window().maximize();
		
		//input DOB
		String requiredyear = "2016";
		String requiredmonth = "August";
		String requireddate = "27";
		
		driver.switchTo().frame("calendarFrame");
		driver.findElement(By.xpath("//span[@id='calendarIcon']")).click();
		
	
	
	//date
	selectDate(driver, requireddate, requiredyear, requiredmonth);
	
	
	
	
	
	
	
	
	
	
	
	}
}
