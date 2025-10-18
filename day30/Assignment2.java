package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//login steps
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//select and open PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//Selecting dropdown
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		
		//selecting single value for Employee status
		//driver.findElement(By.xpath("//span[normalize-space()='Full-Time Permanent']")).click();
		
		//get all the options and count total number of options present in hidden drop down
		
		List<WebElement>options = driver.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
		
		//count total number of options
		System.out.println(options.size());
		
		//print values of all the options present
		for(WebElement op: options) {
			System.out.println(op.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
