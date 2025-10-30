package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
		//capturing slider
		WebElement minslider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        WebElement maxslider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
        
        System.out.println("Location of the min slider before moving : "+minslider.getLocation());//(x,y)
        act.dragAndDropBy(minslider, 100, 250).perform();
        System.out.println("Location of the min slider after moving : "+minslider.getLocation());//(x,y)
        
        System.out.println("Location of the max slider before moving: "+maxslider.getLocation());//(613, 250)
        act.dragAndDropBy(maxslider,-100, 246).perform();
        System.out.println("Location of the max slider after moving : "+maxslider.getLocation());//(513, 250)
        
        
        
        
        
        
	}

}
