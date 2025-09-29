package day25;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		//open test automation page
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//capture the title of the page
		//System.out.println("Title: "+driver.getTitle());
		
		//capture the url of the page
	//	System.out.println("Url: "+driver.getCurrentUrl());
		
		//capture page source of the page
	//	System.out.println("Page source: "+driver.getPageSource());
		
		//capture Window id of single page
		//System.out.println("window Id: "+driver.getWindowHandle());
		
		//capture multiple window Id
		driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).click();
//		Set<String> winIds= driver.getWindowHandles();
//		System.out.println("multiple windows ids: "+winIds);
		
		//Conditional methods
		//isDisplayed()
//		WebElement displaystatus= driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
//		System.out.println(displaystatus.isDisplayed());
		
		//isEnabled()
//		boolean enableStatus = driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
//		System.out.println("Enable status: "+enableStatus);
		
		//isSelected()
//		System.out.println("Before Selecting....");
//		System.out.println(driver.findElement(By.xpath("//input[@id='male']")).isSelected());//false
//		System.out.println(driver.findElement(By.xpath("//input[@id='female']")).isSelected());//false
//		System.out.println("After Selecting....");
//		driver.findElement(By.xpath("//input[@id='male']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@id='male']")).isSelected());//true
//		System.out.println(driver.findElement(By.xpath("//input[@id='female']")).isSelected());//false
		
		//Browser method
//		driver.close();
		driver.quit();
		
		

	}

}
