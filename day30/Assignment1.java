package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpCountry = new Select(drpCountryEle);
		

		
		//1) Total number of options
		List<WebElement> options = drpCountry.getOptions();
		
		//count total number of elements
		System.out.println(options.size());
		
		//2)print all the options
		
//		for(WebElement op: options) {
//			System.out.println(op.getText());
//		}
		
		//3)Select one option without select 
		driver.findElement(By.xpath("//option[@value='1']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
