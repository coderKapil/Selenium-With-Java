package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//drag and drop 
		//source
		WebElement accsrc = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement accdest = driver.findElement(By.xpath("//table[@id='table4']//ol[@id='bank']//li[@class='placeholder']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(accsrc, accdest);
		
		
		
		
		
		
		
		
	}

}
