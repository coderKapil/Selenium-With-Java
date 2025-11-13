package day46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//this approach we used here is with using page factory we create page object class
public class LoginPage2 {

	WebDriver driver;
	//Constructor
	LoginPage2(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//Locators
//	@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username;
	                       //OR
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Username']") WebElement txt_username;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement txt_password;
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement btn_login;
	//how to capture multiple web elements or group of web elements using @FindBy
//	@FindBy(tagName = "a") List<WebElement> links;
	
	//Action Methods
    public void setUsername(String user) {
    	txt_username.sendKeys(user);
    }
    
    public void setPassword(String pswd) {
    	txt_password.sendKeys(pswd);
    }
    
    public void clickLogin() {
    	btn_login.click();
    }
  
	
     
     
     
     
     
}
