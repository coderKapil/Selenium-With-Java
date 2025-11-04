package day40;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
        
        String filePath = System.getProperty("user.dir")+"\\testdata\\CalData.xlsx";
     //This will return no. of rows in a Excel sheet
    int rows=ExcelUtils.getRowCount(filePath, "Sheet1");
        
    //we are starting from 1 bcs on 0th idx headers are present
     for(int i=1; i<=rows; i++) {
    	 //1)read data from excel
   //curr we are reading from first row only
    	String  principle=ExcelUtils.getCellData(filePath,"Sheet1",i,0);	 
    	String rateOfinterest = ExcelUtils.getCellData(filePath,"Sheet1",i,1);
    	String perd1 = ExcelUtils.getCellData(filePath,"Sheet1",i,2);
    	String perd2 = ExcelUtils.getCellData(filePath,"Sheet1",i,3);
    	String freq = ExcelUtils.getCellData(filePath,"Sheet1",i,4);
    	String expmatval = ExcelUtils.getCellData(filePath,"Sheet1",i,5);
    	
    	//2)pass above data into application
 driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
 driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfinterest);
 driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(perd1);
 Select perdrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
 perdrp.selectByVisibleText(perd2);
 Select frq = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
 frq.selectByVisibleText(freq);
 driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
 //validation
 
 String act_matval = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
 //we can't compare numbers in string format we have to first convert them into num then only we can compare them    
 if(Double.parseDouble(expmatval) == Double.parseDouble(act_matval)) {
    	System.out.println("Test passed");
    //updating result colum value
    	ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Passed"); 
   //updating color of the result colum
    	ExcelUtils.fillGreenColor(filePath,"Sheet1",i,7);
    }
    else {
    	System.out.println("Test failed");
    	 //updating result colum value
    	ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Failed"); 
   //updating color of the result colum
    	ExcelUtils.fillRedColor(filePath,"Sheet1",i,7);
    }
 
 Thread.sleep(7000);
 
 //clicked on clear button
 driver.findElement(By.xpath("//div[@class='MT10']//a[2]")).click();
    
     }//ending of for loop
     
     driver.quit();
        
	}

}
