package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Login steps
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//select and open PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//for clicking on drop down
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		Thread.sleep(5000);
		
		//select single option 
//		driver.findElement(By.xpath("//span[normalize-space()='Finance Manager']")).click();
		
		//count number of options
	List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println("Number of options are: "+options.size());
		
//		printing options from dropdown
		for(WebElement op: options) {
			System.out.println(op.getText());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
