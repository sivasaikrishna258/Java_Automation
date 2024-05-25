package seleniumOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingRightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement doubleclick=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions act=new Actions(driver);
		
		//performing rightclick click operation
		act.contextClick(doubleclick).perform();
		
	}

}
