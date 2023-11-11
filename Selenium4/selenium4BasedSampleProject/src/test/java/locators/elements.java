package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Yash Gautam", Keys.ENTER);

//      Locate multiple elements
		driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element: options) {
			System.out.println(element.getText());
		}
		
//		Selenium 4 - Relative Locators
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		driver.findElement(RelativeLocator.with(By.cssSelector("button[type='submit']")).above(loginButton)).sendKeys("YashG");

		Thread.sleep(3000);

		driver.quit();

	}

}
