package day37;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//1)full page screenshot
		
    /*  TakesScreenshot ts = (TakesScreenshot)driver;
      //capture the file but dont know the location
      File sourcefile = ts.getScreenshotAs(OutputType.FILE);
      //here you will specify where u want to capture the file in ur own location
    //System.getProperty("user.dir") this command will return the current project location
      File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
	
	//copying source file to target file
      sourcefile.renameTo(targetfile);
	*/
	
      //2) capture the screenshot from the specific section
//      WebElement featuredproductsection = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//  
//      //capture the file but dont know the location
//      File sourcefile = featuredproductsection.getScreenshotAs(OutputType.FILE);
//      //here you will specify where u want to capture the file in ur own location
//    //System.getProperty("user.dir") this command will return the current project location
//      File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\specific.png");
//	
//	//copying source file to target file
//      sourcefile.renameTo(targetfile);
//	
//	driver.quit();
	
	//capture image of this logo
	WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	File sourcefile = logo.getScreenshotAs(OutputType.FILE);
	File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
	sourcefile.renameTo(targetfile);
	
	}

}
