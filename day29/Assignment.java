package day29;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame 5
//		WebElement frame5 = driver.findElement(By.xpath("//frame[@src=\"frame_5.html\"]"));
//		driver.switchTo().frame(frame5);
//		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Postman");
//		
//		driver.switchTo().defaultContent();
		
		//click on link
		WebElement frame5Sec = driver.findElement(By.xpath("//frame[@src=\"frame_5.html\"]"));
		driver.switchTo().frame(frame5Sec);
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		
	System.out.println(driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed());
		

		
		
		
		
		
		
		
		
	}

}
