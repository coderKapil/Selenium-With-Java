package day27;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
	        //Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
//	capturing the IDS of the multiple windowIds
			Set<String> WindowIds= driver.getWindowHandles();
	
/*		Approach 1
//	converting Set into List to extract individual windowIds
			List<String> windowList = new ArrayList(WindowIds);
			
//	Now extract individual parentId AND ChildId
		
	String parentId = windowList.get(0);
	String childId = windowList.get(1);
	
//	switch to child window or switch to the Window of your choice
	driver.switchTo().window(childId);
//this statement will capture the title of the child page as the Id SWITCH TO CHILD WINDOW
	System.out.println(driver.getTitle());
	
	//switch to parent window
	driver.switchTo().window(parentId);
//this statement will capture the title of the parent page as the ID switch to parent window
	System.out.println(driver.getTitle());
	*/
			
	//Approach 2 
			for(String winId: WindowIds) {
				String title = driver.switchTo().window(winId).getTitle();
				if(title.equals( "OrangeHRM")) {
					System.out.println(driver.getCurrentUrl());
					//SOME VALIDATION ON THE PARENT WINDOW
				}
			}
			
			
			
			
			
			
			
			
			

	}

}
