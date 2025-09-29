package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//opening Swag Labs website
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//locate username field using single attribute
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("standard_user");
		
		//locate password field using multiple attribute
		
		driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");
		
		//locate login button
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		//Add to cart sauclab bagpack 
driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' and @name='add-to-cart-sauce-labs-bike-light']")).click();
     
//locating second xpath 

	}

}
