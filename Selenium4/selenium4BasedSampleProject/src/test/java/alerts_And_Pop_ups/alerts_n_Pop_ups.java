package alerts_And_Pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts_n_Pop_ups {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//JS Alert
		WebElement element1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		element1.click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		//JS Confirm
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		//JS Prompt
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Yash Gautam");
		alert3.accept();

		driver.close();
		driver.quit();
	}

}
