package basic_Setup_and_Browser_actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic_Webpage_actions {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		Method 1:Using driver.get()
		driver.get("https://google.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
//		Method 2:Using driver.navigate().to()
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
//		For getting the current URL driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
//		For getting the page title driver.getTitle();
		System.out.println(driver.getTitle());
		
//		For performing backward/forward and refresh actions
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.close();
	}

}
