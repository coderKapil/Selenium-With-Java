package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("143");
		//to make test cases execution headless
		options.addArguments("--headless");//setting for headless mode of execution

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.roboticqa.com/");
        
		String page_title = driver.getTitle();
		System.out.println(page_title);
		if(page_title.equals("Sign In - RoboticQA Cart")) {
			System.out.println("Test passed!!");
		}
		else {
			System.out.println("Test failed!!");
		}
		driver.quit();

	}

}
