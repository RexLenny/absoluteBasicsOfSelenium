package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits_demo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
//		Implicit Wait: Polling frequency: 500ms, set for the entire life of the session
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //This will make webDriver poll DOM, if all the elements are not available immediately.
		
		driver.findElement(By.name("q")).sendKeys("Yash Gautam SDET", Keys.ENTER);
		
//		Explicit Wait: Need to wait till the element is loaded
		
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofMinutes(2));
		WebElement myLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Yash Gautam - Software Engineer in Test (SDET)")));
		myLink.click();
		
		//Don't mix implicit and explicit wait because the time adds on
		//Prefer explicit wait over implicit one
		
//		Fluent wait: This is basically explicit wait with more control,
//		Can set polling time and add ignore exceptions guidelines
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		                             .withTimeout(Duration.ofSeconds(20))
		                             .pollingEvery(Duration.ofSeconds(1))
		                             .ignoring(NoSuchElementException.class);
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Yash Gautam - Software Engineer in Test (SDET)")));
		
		driver.close();
		driver.quit();
	}
}
