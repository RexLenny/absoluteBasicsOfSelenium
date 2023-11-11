package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class initial_Selenium_Test {

	public static void main(String[] args) {

//      I am not using webDriver Manager Here so i have to create a deriver object for my specific browser and imports.
//		I already have the default property set into path so I don't need the next line, 
//		neither do I have to define webdriver manager for browser setup. But let's do it for good practice.
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
//		We can also define the browser version using webDriver like this
//		WebDriverManager.chromedriver().driverVersion("92.0").setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

//		Earlier Timeouts were defined like the commented version
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

//		driver.close(); //Closes the current window
		driver.quit(); //Closes the whole session
	}
}
