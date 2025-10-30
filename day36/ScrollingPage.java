package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1) scroll down the page by pixel number
//		js.executeScript("window.scrollBy(0,3000)","");
//		System.out.println(js.executeScript("return window.pageYOffset"));
		
		//2) scroll the page till the element is visible
	/*	WebElement serbia = driver.findElement(By.xpath("//td[normalize-space()='Serbia']"));
//scrollIntoView()- scroll down the page till serbia element is visible
		js.executeScript("arguments[0].scrollIntoView()",serbia);
		System.out.println(js.executeScript("return window.pageYOffset"));
		
	*/
		
	//3) scroll page till the end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		
	//go back to the initial position
	//- will reverse to the initial position
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		
		
		
		
		
		
	}

}
