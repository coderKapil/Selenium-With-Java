package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
WebElement rightClickbtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

      Actions act = new Actions(driver);

      //Right click action
      act.contextClick(rightClickbtn).perform();
    
      //click on copy
      driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
      
      //close the alert box
      driver.switchTo().alert().accept();
      
      
      
      
      
      


	}

}
