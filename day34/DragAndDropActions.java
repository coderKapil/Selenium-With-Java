package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		//switch to frame
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameEle);
		
		Actions act = new Actions(driver);
		
		WebElement highTat1 = driver.findElement(By.xpath("//li[1]"));
		WebElement highTat2 = driver.findElement(By.xpath("//li[2]"));
		WebElement targetEle = driver.findElement(By.xpath("//div[@id='trash']"));
		
		act.dragAndDrop(highTat1, targetEle).perform();
		act.dragAndDrop(highTat2, targetEle).perform();
	}

}
