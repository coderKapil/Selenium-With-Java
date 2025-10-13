package day28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) select specific checkbox
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2) selecting all the  checkboxes
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"] "));
	
//	using normal for loop
//	for(int i=0; i<checkboxes.size(); i++) {
//		checkboxes.get(i).click();
//	}
	//using enhanced for-loop
	
//	for(WebElement checkbox: checkboxes) {
//		checkbox.click();
//	}
	
	//3) select last 3 checkboxes
//total num. of checkboxes - how many checkboxes to select = starting index
//7-3 = 4
//	for(int i=4; i<checkboxes.size(); i++) {
//		checkboxes.get(i).click();
//	}
	
	//4) select first 3 check boxes
//	for(int i=0; i<3; i++) {
//		checkboxes.get(i).click();
//	}
	
	//unselect checkboxes if they are selected
	//first select checkbox
	for(int i=0; i<3; i++) {
		checkboxes.get(i).click();
	}
	
	Thread.sleep(5000);
	
	//validate and unselect checkboxes those who are selected
	
	for(int i=0; i<checkboxes.size(); i++) {
		if(checkboxes.get(i).isSelected()) {
		checkboxes.get(i).click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
