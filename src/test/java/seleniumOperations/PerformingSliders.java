package seleniumOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingSliders {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println(min.getLocation());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min, 100,0).perform();
		
		WebElement max=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		act.dragAndDropBy(max, -100,0).perform();

		

	}

}
