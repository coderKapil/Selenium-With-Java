package day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//visit testautomation site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
		
		//provide some string and search for some element
		
//		WebElement search_box = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
//		search_box.sendKeys("Selenium");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//find all links
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("total number of links on page are: "+links.size());
		
		//get windowId for each browser window
		
		Set <String> win_id=driver.getWindowHandles();
//		Approach 1
//		//capture individual window Id
//		List<String> win_list = new ArrayList(win_id);
//		
//		String parent_id = win_list.get(0);
//		String child_id = win_list.get(1);
//		
//		//close specific browser window
//		driver.switchTo().window(child_id);
//		driver.close();
		
		//Approach 2
		for(String id: win_id) {
			String title = driver.switchTo().window(id).getTitle();
			
			//validation 
			if(title.equals("Automation Testing Practice")) {
				driver.close();
				System.out.println("susccessfully closed the page!!!");
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
