package basic_Setup_and_Browser_actions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecutor {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        
		//Only way to access a shadow DOM element is through javaScript Executor
		
		WebElement element = driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click();", element);
		
//		To write something on console
		js.executeScript("console.log('One Down')");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
