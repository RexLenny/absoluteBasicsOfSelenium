package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElementsDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//      Handle multiple elements
		driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element: options) {
			System.out.println(element.getText());
		}
		
		driver.get("https://google.com");
		
//		Search element within element
		
		WebElement form = driver.findElement(By.tagName("form"));
		form.findElement(By.name("q")).sendKeys("horse",Keys.ENTER);
		
//		Active Element
		driver.navigate().to("https://google.com");
		WebElement elem = driver.findElement(By.name("q"));
		elem.clear();
		elem.sendKeys("1",Keys.ENTER);
//		Get attribute of current active element
		String attr = driver.switchTo().activeElement().getAttribute("title");
		System.out.println("Title = " + attr);
		
//		How to get tagname, text and Css Value
		driver.navigate().to("https://google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.clear();
		System.out.println(element.getTagName());
		System.out.println(element.getText());
		System.out.println(element.getCssValue("font"));

//		How to check element is Enabled/ is Selected
		
		driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
		WebElement check = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		System.out.println(check.isEnabled());
		System.out.println(check.isSelected());
		
		driver.close();
		driver.quit();
		
	}

}
