package day28;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//Problem 1
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.manage().window().maximize();
//		
////		click on all checkbox at once
//List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
//
//    for(WebElement checkbox: checkboxes) {
//    	checkbox.click();
//    }

		//problem 2
		driver.get("https://mypage.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		myalert.accept();
		
		
		
		
		
		
		
		
		
		
	}

}
