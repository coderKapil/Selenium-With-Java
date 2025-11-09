package day44;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ParamTest {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String url) throws InterruptedException {
switch (br.toLowerCase()) {
case "chrome":driver = new ChromeDriver();break;
case "edge":driver = new EdgeDriver();break;
case "firefox":driver = new FirefoxDriver();break;
default:
    System.out.println("Invalid browser"); return;
		 }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
	}
	@Test(priority=1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	    AssertJUnit.assertEquals(status,true);
	}
	@Test(priority=2)
	void testTitle() {
		AssertJUnit.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@Test(priority=3)
	void testUrl() {
	AssertJUnit.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
