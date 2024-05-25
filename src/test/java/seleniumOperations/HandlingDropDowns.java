package seleniumOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDropDowns {

	
WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		
//		WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
//		Select test=new Select(dropdown);
//		List<WebElement> l=test.getOptions();
//		for(WebElement w:l) {
//			System.out.println(w);
//			driver.quit();
		
		WebElement dropdown=driver.findElement(By.xpath("//button[@class='btn btn-danger dropdown-toggle']"));
		dropdown.click();
		List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		System.out.println(allOptions.size());
		
		for(WebElement act:allOptions) {
			if(act.getText().equals("Action")) {
				act.click();
				break;
			}
		}
//		driver.quit();

		}
	
}
