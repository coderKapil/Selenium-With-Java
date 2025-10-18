package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCountry = new Select(drpCountryEle);
		//select options from the drop down
//		drpCountry.selectByVisibleText("Germany");
//		drpCountry.selectByValue("france");
//		drpCountry.selectByIndex(2);
		
		//capture the options from the dropdown
		List<WebElement> options = drpCountry.getOptions();
//		find out how many options are there in select dropdown
		System.out.println("Number of options in a dropdown: "+options.size());
		
		//printing the options using normal for loop
//		for(int i=0; i<options.size(); i++) {
//			System.out.println(options.get(i).getText());
//		}
		
		//printing the options using for each loop
		for(WebElement op: options) {
			System.out.println(op.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
