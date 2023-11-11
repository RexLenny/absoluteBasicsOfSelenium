package pageLoadingStrategies;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageLoadingdemo {

	public static void main(String[] args) throws InterruptedException {
		
//		default/NORMAL
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(chromeOptions);
//		
//		driver.get("https://www.google.com");
		
		
//		EAAGER
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(chromeOptions);
//		
//		driver.get("https://www.google.com");
		
//		NONE
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://www.google.com");
		
		driver.close();
		driver.quit();

	}

}
