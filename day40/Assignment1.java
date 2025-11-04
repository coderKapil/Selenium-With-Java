package day40;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
	String filepath = System.getProperty("user.dir")+"\\testdata\\cdcalc.xlsx";
	//row in excel sheet
	int rows=ExcelUtils.getRowCount(filepath, "Sheet1");
	
	//starting from 1st idx to avoid header 
	for(int i=1; i<=rows; i++) {
	//1) read data from excel
 String	intdepamt=ExcelUtils.getCellData(filepath, "Sheet1",i,0);
 String	len=ExcelUtils.getCellData(filepath, "Sheet1",i,1);
 String	intrate=ExcelUtils.getCellData(filepath, "Sheet1",i,2);
 String	compounding=ExcelUtils.getCellData(filepath, "Sheet1",i,3);
 String	exptotal=ExcelUtils.getCellData(filepath, "Sheet1",i,4);
 exptotal = exptotal.replace("$", "").replace(",",""); 		
  //2) pass above data into application
WebElement depamt = driver.findElement(By.xpath("//input[@id='mat-input-0']"));	
depamt.clear();
depamt.sendKeys(intdepamt);
WebElement leng = driver.findElement(By.xpath("//input[@id='mat-input-1']"));	
leng.clear();
leng.sendKeys(len);
//still clears the default value in the input box before inserting your new one.
WebElement rateInput = driver.findElement(By.id("mat-input-2"));
JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript(
    "arguments[0].value='" + intrate + "';" +
    "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
    "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
    rateInput
);


JavascriptExecutor js2 = (JavascriptExecutor) driver;
js2.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")));

//3)validation of actual data and expected data 
String act_total = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();	
act_total = act_total.replace("$","").replace(",","");
//we can't compare no. in string format so we have to make it double
if(Double.parseDouble(exptotal) == Double.parseDouble(act_total)) {
	System.out.println("Test passed");
	//updating result column
	ExcelUtils.setCellData(filepath,"Sheet1",i,6,"Passed");
}
else {
	System.out.println("Test failed");
	//updating result column
	ExcelUtils.setCellData(filepath,"Sheet1",i,6,"Failed");
}

Thread.sleep(9000);
		
	}
	
	
	
	}

}
