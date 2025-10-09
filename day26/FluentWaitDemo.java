package day26;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		FluentWait Declaration
   Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
		   .withTimeout(Duration.ofSeconds(20))
		   .pollingEvery(Duration.ofSeconds(10))
		   .ignoring(NoSuchElementException.class);
   
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		 WebElement txtUsername = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 return driver.findElement(By.xpath("//input[@placeholder='Username']"));
		     }
		   });
		
		txtUsername.sendKeys("Admin");
		
		
		
		
		

	}

}
