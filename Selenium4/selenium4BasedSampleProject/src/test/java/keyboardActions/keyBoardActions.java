package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
//		Combinations of Keys
//		keyDown()
		
		Actions actionProvider = new Actions(driver);
		Action keydownaction = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydownaction.perform();
		
		
//		keyUp()
		
		Actions action = new Actions(driver);
		WebElement searchBox = driver.findElement(By.name("q"));
		
		action.keyDown(Keys.SHIFT).sendKeys(searchBox,"Yash").keyUp(Keys.SHIFT).sendKeys("g").perform();
		
		Thread.sleep(5000);
		
		
		driver.close();
		driver.quit();

	}

}
