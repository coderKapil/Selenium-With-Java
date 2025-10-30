package day37;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRuntime {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("143");
		File file = new File("C:\\Automation\\CRX\\SelectorsHub.crx");
		options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		

	}

}
