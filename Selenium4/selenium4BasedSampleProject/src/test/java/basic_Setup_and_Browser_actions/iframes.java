package basic_Setup_and_Browser_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("globalSqa"); //Can use either index, name or UniqueId
		
		driver.findElement(By.cssSelector("#current_filter")).click();
		
		Thread.sleep(5000);
		
//		Switching back to top level
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.quit();
	}	
	
}
