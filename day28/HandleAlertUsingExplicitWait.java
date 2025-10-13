package day28;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Handle alert without using switchTo().alert()
//using explicit wait only
public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver = new ChromeDriver();
       //Explicit wait declaration
       WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");;
		driver.manage().window().maximize();
//		it will capture Normal alert with ok button and click on it to make it pop up
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);

		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());//thhis beomes true when alert popup
		System.out.println(myalert.getText());
		myalert.accept();

	}

}
