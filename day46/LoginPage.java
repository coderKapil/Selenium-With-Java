package day46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//this approach we used here is without using page factory we create page object class
public class LoginPage {

	WebDriver driver;
	//Constructor
	LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	//Locators

     By txt_username_loc = By.xpath("//input[@placeholder='Username']");
     By txt_password_loc = By.xpath("//input[@placeholder='Password']");
     By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	//Action Methods
    public void setUsername(String user) {
    	driver.findElement(txt_username_loc).sendKeys(user);
    }
    
    public void setPassword(String pswd) {
    	driver.findElement(txt_password_loc).sendKeys(pswd);
    }
    
    public void clickLogin() {
    	driver.findElement(btn_login_loc).click();
    }
     
     
     
     
     
     
}
