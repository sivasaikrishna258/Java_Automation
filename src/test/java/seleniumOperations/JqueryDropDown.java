package seleniumOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JqueryDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@id='comboTree241774DropDownContainer']//span[@class='comboTreeItemTitle'][normalize-space()='choice 1']"));
		new WebDriverWait(driver,   
				Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(e));
		e.click();
		
		
		
		
	}

}
