package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://testautomationpractice.blogspot.com/");
      driver.manage().window().maximize();
      
      //selecting dropdown
      driver.findElement(By.xpath("//select[@id='colors']")).click();
      
      //SELECT SINGLE OPTION
//      driver.findElement(By.xpath("//option[@value='white']")).click();
      
      //select multiple options
      List<WebElement> options = driver.findElements(By.xpath("//select[@id='colors']//option"));
   
      //count number of options
      System.out.println(options.size());
      
      //select multiple options
      
      for(WebElement op: options) {
    	    String option = op.getText();
    	    if(option.equals("Red")  || option.equals("Green") || option.equals("Yellow")) {
    	    	  op.click();
    	    }
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

}
