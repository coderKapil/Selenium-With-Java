package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
WebElement rightClickbtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

      Actions act = new Actions(driver);

//building / creating an action and storing it inside a variable
     Action myaction = act.contextClick(rightClickbtn).build();
     myaction.perform();//we are performing completing action

	}

}
