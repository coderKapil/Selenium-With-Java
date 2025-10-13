package day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//visit testautomation site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		
		//provide some string and search for some element
		
         driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
         driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
	   //count number of links
         List<WebElement> links = driver.findElements(By.id("wikipedia-search-result-link"));
         
         System.out.println(links.size());
        
         
		
		
		
		
		
		
		
		
		
	}

}
