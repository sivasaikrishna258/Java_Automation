package seleniumOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDynamicWebTale {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://freecrm.com");
		driver.manage().window().maximize();
		///driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		WebElement username=driver.findElement(By.name("email"));
		
		new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("sivasaikrishna258@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sivasai@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		
	}

}
