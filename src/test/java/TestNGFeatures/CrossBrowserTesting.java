package TestNGFeatures;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		switch(browser) {
		
		case "chrome" :
			WebDriverManager.chromedriver().setup();		
			driver=new ChromeDriver();
			break;
			
		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
			break;
		}
	}
	
	@Test
	public void LoginTest() {
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("//label[@for='fromCity']"));
		e.click();
		
		WebElement e2=driver.findElement(By.xpath("//input[@placeholder='From']"));
		e2.sendKeys("Chennai");
		
		List<WebElement> ls=driver.findElements(By.xpath("//div[@id='react-autowhatever-1']//li"));
		
		for(WebElement w:ls) {
			System.out.println(w.getText());
			if(w.getText().contains("Chennai")) {
				w.click();
				break;
			}
		}
	}
	
	@AfterTest
	public void teardwon() {
		driver.close();
	}
}
