package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//locating web element on which we have to apply mouse hover action
		WebElement computers = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		WebElement notebooks = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']"));
		
		//creating object of Actions class
		Actions act = new Actions(driver);
	//build() meth will create an action but will not complete it to compete it u have to use perform() meth
	//without build and perform meth no action will be performed
//        act.moveToElement(computers).moveToElement(notebooks).click().build().perform();
		act.moveToElement(computers).moveToElement(notebooks).click().perform();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
