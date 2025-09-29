package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		//isDisplayed()
		//WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("logo status: "+logo.isDisplayed());
		
	  //boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
      //System.out.println("logo status: "+status);
      
      //isEnabled()-this method we mostly used for the input boxes
		
//		boolean enableStatus = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		
//		System.out.println("enable status: "+enableStatus);
		
		//isSelected()- this method is used to check whether the element is selected or not
//		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		WebElement male_rd =  driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

		System.out.println("Before Selection.....");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//false
		
		
//		 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
//		
//		 System.out.println("After Selecting male radio_button......."); 
//		 System.out.println(male_rd.isSelected());//true
//		 System.out.println(female_rd.isSelected());//false
		
//		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
//		System.out.println("After selecting female radio button....");
//		System.out.println(male_rd.isSelected());//false
//		System.out.println(female_rd.isSelected());//true
		
		
		//NewsLetter methdo
		boolean newsLetterStatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("News letter checkbox status: "+newsLetterStatus);
		
		
      
	}

}
