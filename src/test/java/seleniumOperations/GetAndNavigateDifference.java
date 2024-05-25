package seleniumOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

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