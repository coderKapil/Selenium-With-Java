package day28;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");;
		driver.manage().window().maximize();
//		it will capture Normal alert with ok button and click on it to make it pop up
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
//		Thread.sleep(5000);
// this will switch to the alert window and accept() method will close the alert window which is open
//		driver.switchTo().alert().accept();
		
//		Alert myalert = driver.switchTo().alert();
//		String alert_txt = myalert.getText();
//		System.out.println(alert_txt);
//		System.out.println(myalert.getText());
//valdating whether the alert box text is matching with the desired text or nit
//		if(alert_txt.equals("I am an alert box!")) {
//			System.out.println("Test case passed!!!");
//		}else {
//			System.out.println("Test case failed!!!");
//		}
//		myalert.accept(); 
		
		
//Confirmation alert - OK and Cancel button in it
		
//	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//	
//	Thread.sleep(2000);
//	Alert myalert = driver.switchTo().alert();

	//if u want to close the alert window with the help of Ok button use accept() method
	
//	myalert.accept();
	
	//if u want to close the alert box with the cancel button then use dismiss() method
//		myalert.dismiss();
		
//Prompt alert box- which has input box in it
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		Alert myalert = driver.switchTo().alert();
		myalert.sendKeys("i am prompt alert box!!!");
		myalert.accept();
		
		
		
		
		
		

	}

}
