package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		field1.clear();
		field1.sendKeys("Hello World");
		
		Actions act = new Actions(driver);
		act.doubleClick(btn).perform();
		
		String text = field2.getAttribute("value");
		System.out.println("captured value is: "+text);
		
		//validate both the field has same value or not
		if(text.equals("Hello World")) {
			System.out.println("Text copied properly...");
		}
		else {
			System.out.println("Text not copied properly...");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
