package day25;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//get(url)-opens the url in the web browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);//it will wait till 5 sec my page gets load completley
		
		//to maximize the browser window size
		driver.manage().window().maximize();
		
		//getTitle()-returns the title of a webpage
		System.out.println(driver.getTitle());
		
		//getCurrentUrl()-returns the current url of the webpage
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()-returns page source of the webpage
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle()-returns the ID of the browser window
		
		//String windowId = driver.getWindowHandle();
		//System.out.println("window id of current win is: "+windowId);
		
		//getWindowHandles- retunrs the ID'S of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();//this will open new browser window
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("id's of window handles are: "+windowIds);
		
		
		
		
		
		
		
		
		
	}

}
