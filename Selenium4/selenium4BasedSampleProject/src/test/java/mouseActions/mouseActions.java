package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement boxD = driver.findElement(By.xpath("//li[text()='D']"));
		
//		Move the mouse cursor to an element
		
		Actions actions = new Actions(driver);
		actions.moveToElement(boxA);
		actions.build().perform();
		
//		Click and hold
		actions.clickAndHold(boxA);
		actions.moveToElement(boxD);
		actions.release().perform();
		Thread.sleep(5000);
		
//		Right Click
		actions.contextClick(boxD);
		actions.release().perform();
		Thread.sleep(5000);
		
//		Double Click
		actions.doubleClick(boxD);
		actions.release().perform();
		Thread.sleep(5000);
		
//		Drag and drop
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement elem1 = driver.findElement(By.id("draggable"));
		WebElement elem2 = driver.findElement(By.id("droppable"));
		
		actions.dragAndDrop(elem1, elem2);
		actions.release().perform();
		Thread.sleep(5000);
		
		System.out.println("Done");
		driver.close();
		driver.quit();

	}

}
