package basic_Setup_and_Browser_actions;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windows_management {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		Window management - Size

//		Get width & height
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();

		System.out.println("Width = " + width + ", height = " + height);

//	    Store dimensions & query later
		Dimension size = driver.manage().window().getSize();
		int width1 = size.getWidth();
		int height1 = size.getHeight();

		System.out.println("Width = " + width1 + ", height = " + height1);

//	    Set window size 
		driver.manage().window().setSize(new Dimension(800, 600));

//	    Window management - Position

//	    Access x and y dimensions individually
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();

		System.out.println("X Position = " + x + ", Y Position = " + y);

//	    Store dimensions & query later
		Point position = driver.manage().window().getPosition();
		int x1 = position.getX();
		int y1 = position.getY();
		System.out.println("X Position = " + x1 + ", Y Position = " + y1);

//	    Move the window to the top left of the primary monitor
		driver.manage().window().setPosition(new Point(0, 0));

//	    Window management

		// maximize window
		driver.manage().window().maximize();

		// minimize window
		driver.manage().window().minimize();

		// fullscreen
		driver.manage().window().fullscreen();

		driver.quit();
	}

}
