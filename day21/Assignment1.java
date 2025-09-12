package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Test Cases
 1) Launch Browser (Chrome)
 2) Open URL https://demo.nopcommerce.com/
 3)Validate title should be "nopCommerce demo store"
 4) close page
 */

public class Assignment1 {

	public static void main(String[] args)  {
//	1)Launch chrome browser
	WebDriver driver = new ChromeDriver();
	
// 2)Open URL https://demo.nopcommerce.com/
	driver.get("https://demo.nopcommerce.com/");
	
// 3) Validate title should be "nopCommerce demo store"
	
	String act_title = driver.getTitle();
	
	if(act_title.equals("nopCommerce demo store. Home page title")) {
		System.out.println("Test Passed!!");
	}
	else {
		System.out.println("Test Failed!!");
	}
	
//4) close page
	
	driver.quit();
		
	
	
	
	
	
	
	

	}

}
