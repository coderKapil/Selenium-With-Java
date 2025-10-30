package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		//locate the first textarea
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to Selenium Java");
		
		Actions act = new Actions(driver);
		
		//Ctrl+A - select the text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Ctrl+C - copy the text into clipboard
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//Tab - shift to second box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Ctrl+V - Paste the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
