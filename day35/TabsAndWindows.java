package day35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
	//From Selenium 4.x all versions this feature is available
//		driver.switchTo().newWindow(WindowType.TAB);//it will open a new tab also switch to it 
		driver.switchTo().newWindow(WindowType.WINDOW);//this will open in new browser window
		driver.get("https://www.orangehrm.com/");

	}

}
