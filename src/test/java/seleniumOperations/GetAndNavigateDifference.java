package seleniumOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Both use the browser's navigation history.
 * The difference is not technical in terms of memory or browser state, but semantic and API design-based in Selenium.
 *
 * 🔄 Real-World Analogy:
 * get() is like typing a URL into the browser’s address bar and hitting Enter.
 *
 * navigate().to() is like a user clicking links, then using the browser back/forward buttons — all in a single, coordinated flow.
 */
public class GetAndNavigateDifference {

	@Test
	public void dis() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	
	//driver.navigate().to("https://www.facebook.com");
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
	
	driver.navigate().back();
}
}