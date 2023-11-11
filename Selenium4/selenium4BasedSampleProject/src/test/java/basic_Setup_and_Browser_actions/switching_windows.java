package basic_Setup_and_Browser_actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switching_windows {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Sometimes we have pop-up windows and it's required for us to switch to original window
//		In that case we can utilze the unique handles of each window to switch
		
		String originalWindow = driver.getWindowHandle();
		
		System.out.println("All window handles= "+ driver.getWindowHandles());
		System.out.println("Original window handle= "+ originalWindow);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(originalWindow);
		
//		Opening a new window and switching to it
		driver.switchTo().newWindow(WindowType.WINDOW);
		
//		Opening a new tab and switching to it
		driver.switchTo().newWindow(WindowType.TAB);
		
//		driver.quit();
	}

}
