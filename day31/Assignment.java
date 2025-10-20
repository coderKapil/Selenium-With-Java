package day31;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//1)choose departure city drop down
		WebElement depEle = driver.findElement(By.xpath("//select[@name='fromPort']"));
		//select one city
		Select depCity = new Select(depEle);
		depCity.selectByVisibleText("Portland");
		
		//2) Choose destination city 
		WebElement destEle = driver.findElement(By.xpath("//select[@name='toPort']"));
		//select destination city
		Select destCity = new Select(destEle);
		destCity.selectByVisibleText("London");
		
		//3) click on find flights
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//4) find out the lowest price from price column in table 
//getting all thr prices from table
		List<WebElement> pricesElements = driver.findElements(By.xpath("//table[@class='table']//tr//td[6]"));
//store the prices into arraylist in double format data type
        List<Double> prices = new ArrayList<>();
   //traversing through list and replacing all the $ with ""     
        for(WebElement priceElement: pricesElements) {
        	   String priceText = priceElement.getText().replace("$", "").trim();
    //adding pricesText into arraylist by converting them from String to Double format
        	   prices.add(Double.parseDouble(priceText));
        }
		
        //sort prices in asceding order to get the lowest price value out of it
        Collections.sort(prices);
        double lowestPrice = prices.get(0);//storing the lowest price out of price col.
//        System.out.println("Lowest price: "+prices.get(0));
        if(prices.get(0) == lowestPrice) {
        	 driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
        	 //fill up form
     //name
        	 driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Jason");
     //address
        	 driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 Main street");
     //City
        	 driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Down town");
     //State
        	 driver.findElement(By.xpath("//input[@id='state']")).sendKeys("XYZ");
     //Zipcode
        	 driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("12345");
     //Card type
       driver.findElement(By.xpath("//select[@id='cardType']")).click();
       //choose aMERICAN eXPRESS
       WebElement cardType = driver.findElement(By.xpath("//select[@id='cardType']"));
       Select card = new Select(cardType);
       card.selectByVisibleText("American Express");
     //Credit card number
       driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("123456789456");
       
     //Name on card
       driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Jason");
      
       //click on purchase flight button
       driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
       
       //validate thank you message
       String bookingMsg = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
       
       if(bookingMsg.equals("Thank you for your purchase today!")) {
    	      System.out.println("Flight booking successfully done !!!");
       }
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
