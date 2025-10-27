package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		//first field
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		//second field
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		//double click button
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		//clears the box1
		box1.clear();
		box1.sendKeys("WELCOME");
		
		//double click action on copy text button
		Actions act = new Actions(driver);
		act.doubleClick(btn).perform();
		
		//verify the same text is copied into the swcond box or not
		String text = box2.getAttribute("value");
		System.out.println("captured value is: "+text);
		
		if(text.equals("WELCOME")) {
			System.out.println("Text copied properly...");
		}
		else {
			System.out.println("Text not copied propely...");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
