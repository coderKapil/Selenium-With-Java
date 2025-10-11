package day27;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        //Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
//	capturing the IDS of the multiple windowIds
			Set<String> WindowIds= driver.getWindowHandles();
			
			for(String winids: WindowIds) {
				String title = driver.switchTo().window(winids).getTitle();
//				System.out.println(title);
				if(title.equals("OrangeHRM")) {
					driver.close();
				}
			}

	}

}
