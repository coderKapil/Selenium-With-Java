package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shorturl.at/TWJmS");
		driver.manage().window().maximize();
		//opens drop down option
	    driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	    
	    //select single option from a bootstrap dropdown
	    driver.findElement(By.xpath("//li[4]//a[1]//label[1]")).click();
	    
	    //capture all the options and then find out the size
/*Here we have write our own xpath //label says we are skipping and directly jump to the label tag
which contains input tag and options values here we are saying ui tag which have the class that contains
multiselect as name
*/
	   List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
//	   System.out.println("Number of options:" +options.size());
	   
	   //print options from the drop down using normal for loop
//	   for(int i=0; i<options.size(); i++) {
//		   System.out.println(options.get(i).getText());
//	   }
		
	   //print options from the drop down using for each loop
	   
//	   for(WebElement op: options) {
//		   System.out.println(op.getText());
//	   }
	   
	   
	   //select multiple options
	   for(WebElement op : options) {
		   String option = op.getText();
		   if( option.equals("SQL") || option.equals("PHP")) {
			   op.click();
		   }
	   }
	   
	   
	   
	   
	   
	   
	   

	}

}
