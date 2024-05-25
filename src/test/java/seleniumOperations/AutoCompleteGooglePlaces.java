package seleniumOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.base.Verify;

public class AutoCompleteGooglePlaces {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='menu_Hotels']")).click();
		driver.findElement(By.xpath("//label[@for='city']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Where do you want to stay?']"));
		e.sendKeys("Chennai");

		
		String text;
		do {
			e.sendKeys(Keys.ARROW_DOWN);
			text=e.getAttribute("value");
			
			if(text.contains("T Nagar")) {
				System.out.println(text);
				e.sendKeys(Keys.ENTER);
				break;
			}
			
		}while(!text.isEmpty());
		
	}

}
