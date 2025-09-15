package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		//linkText
		//List<WebElement> list = driver.findElements(By.tagName("a"));
		//System.out.println("total number of list is: "+list.size());
		
		//Total number of images
		//List<WebElement> images = driver.findElements(By.tagName("img"));
		//System.out.println("Total number of images on a webpage is: "+images.size());
		
		//click on product link using linktext/partiallinktext
		driver.findElement(By.className("hrefch")).click();
		
	}

}
