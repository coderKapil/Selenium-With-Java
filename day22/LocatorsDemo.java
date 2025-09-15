package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");

		//id
		//boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);
		
		//linktext and partialLinkText
		
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tab")).click();
		
		//className
		//List<WebElement> headerLinks = driver.findElements(By.className("dropdown"));
		//System.out.println("total number of header links: "+headerLinks.size());
		
		//TagName
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("total number of link elements are: "+links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("total number of images on webpage is: "+images.size());
		
		
		
		
		
	}

}
