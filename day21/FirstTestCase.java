package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/*
 1) Launch Browser chrome
 2)Open Url https://magento2demo.firebearstudio.com/
 3)Validate Title should be "HomePage"
 4)close browser
 */


public class FirstTestCase {

	public static void main(String[] args) {
		
		//Launch browser (chrome)
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
//		2)Open Url https://magento2demo.firebearstudio.com/
		
		driver.get("https://magento2demo.firebearstudio.com/");
		
//	  3) Validate Title should be "Home Page"
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("Home Page")) {
			System.out.println("Test Passed!!!");
		}
		else {
			System.out.println("Test Failed");
		}
		
//		close the browser
//		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
