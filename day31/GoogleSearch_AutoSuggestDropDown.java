package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//click on Search box dropdown
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		//get all the options
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		//count all the options for search query
		System.out.println(options.size());
		
		//print the values of all the options
		for(WebElement op: options) {
			System.out.println(op.getText());
			String option = op.getText();
			if(option.equals("selenium")) {
				op.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
