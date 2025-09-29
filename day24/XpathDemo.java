package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/");
		driver.manage().window().maximize();
		
		//xPath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		
		//xPath with multiple attribute
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Macbook");
	//xpath with and operator
	//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-shirts");
		
	//xpath with or operator
	 //driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("T-shirt");
		
	//xpath with inner text
	//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
	// boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		
	//System.out.println(displayStatus);
	//.getText() this meth will capture the text value of that element
//	String textVal = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
//	System.out.println(textVal);
		
	//xpath with contains()
	//driver.findElement(By.xpath("//input[contains(@placeholder,'rch')]")).sendKeys("MacBook");
		
	//xpath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("MacBook");
		
	//chained xpath
		boolean imageStatus = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(imageStatus);
		
		
		
		
		
		
	}

}
