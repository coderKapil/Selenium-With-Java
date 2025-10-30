package day35;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act = new Actions(driver);
		
		//now open link in new tab ctrl+normal click on the register
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		//switching to registration page
		
		List<String> idList = new ArrayList<>(driver.getWindowHandles());
		//bcs parent is at 0th index i.e homepage and child registration page is at 1st idx
		String childId = idList.get(1);
		//switch to registration page
		driver.switchTo().window(childId);
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John");
		
		//again switch to parent page
		String parentID = idList.get(0);
		//switch to home page
		driver.switchTo().window(parentID);
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");
		

	}

}
