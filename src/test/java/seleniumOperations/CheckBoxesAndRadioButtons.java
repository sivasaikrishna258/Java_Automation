package seleniumOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesAndRadioButtons {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//selectCheckBox();
		selectMultipleCheckBox();
	}
	
		public static void selectCheckBox() {
		driver.get("https://demos.telerik.com/aspnet-ajax/button/examples/radiosandcheckboxes/defaultcs.aspx");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("//span[@class='rbIcon p-icon p-i-radio-checked rbToggleRadioChecked']"));
		boolean b=e.isSelected();
		if(!b) {
			e.click();
		}
	}
		
		public static void selectMultipleCheckBox() {
			driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
			driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();

			
			
//			for(int i=0;i<3;i++) {
//			driver.findElement(By.xpath("//input[@name='tool'][i]")).click();
//		}
		}
}
