package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	static void selectDate(WebDriver driver, String requireddate, String requiredmonth, String requiredyear) {
		//SELECTING YEAR FROM YEAR DROP DOWN
		WebElement yeardrpdown = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select selectyear = new Select(yeardrpdown);
		selectyear.selectByVisibleText(requiredyear);
		
		//SELECTING MONTH FROM MONTH DROP DOWN
		WebElement monthdrpdown = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select allmonths = new Select(monthdrpdown);
		allmonths.selectByVisibleText(requiredmonth);
		
		//selecting date
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		//traverse over all the dates to match the exact date
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
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
	//Choose the correct option:
		driver.findElement(By.xpath("//input[@id='product_549']")).click();
		
//Passenger details
	
	driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("John");
	driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Doe");
	driver.findElement(By.xpath("//textarea[@id='order_comments']")).sendKeys("Special order");
	
	//input DOB
	String requiredyear = "1991";
	String requiredmonth = "Jun";
	String requireddate = "1";
	
	//departure date inputs
	String deptyear = "2025";
	String deptmonth = "Dec";
	String deptdate = "25";
	
	driver.findElement(By.xpath("//input[@id='dob']")).click();//click to open calendar
	
	selectDate(driver, requireddate, requiredmonth, requiredyear);
	
	//gender
	driver.findElement(By.xpath("//input[@id='sex_1']")).click();
	
	//from city
	driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Delhi");
	//to city
	driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Dehradun");
	
	//departure date
	driver.findElement(By.xpath("//input[@id='departon']")).click();//open departure date calendar
	selectDate(driver, deptdate, deptmonth, deptyear);
	
	//Delivery options
	WebElement deliverydrpdown = driver.findElement(By.xpath("//select[@id='reasondummy']"));
	Select deliveryopt = new Select(deliverydrpdown);
	deliveryopt.selectByIndex(8);
	//How will you like to receive the dummy ticket (optional)
	driver.findElement(By.xpath("//input[@id='deliverymethod_3']")).click();
	
	//Billing Details
	driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("John");
	driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("xyz@example.com");
	WebElement countrydrpdown = driver.findElement(By.xpath("//select[@id='billing_country']"));
	Select country = new Select(countrydrpdown);
	country.selectByVisibleText("India");
	driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("123 xyz road");
	driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Delhi");
	
	WebElement statedrp = driver.findElement(By.name("billing_state"));
	Select state = new Select(statedrp);
	state.selectByIndex(0);
	driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("114455");
	driver.findElement(By.xpath("//button[@id='place_order']")).click();
	

	
	
	
	
	
	
	
	
	}

}
