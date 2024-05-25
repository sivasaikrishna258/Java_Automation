package seleniumOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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

}
