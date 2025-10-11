package day27;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/");//accepts url only in the string format
//		functionality wise it is similar to driver.get() method
		//object of URL class
//		URL myurl = new URL("https://demo.nopcommerce.com/");
//		driver.navigate().to(myurl);
		
		//accepts the url in the string format and in url obj
	driver.navigate().to("https://demo.nopcommerce.com/");
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
