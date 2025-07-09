package seleniumOperations;

import java.time.Duration;
import java.util.List;

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

	/**
	 * ✅ Example – Select Only Specific Checkboxes
	 * Let’s say you want to select checkboxes with value Java, Python:
	 */
	public static void selectMultipleCheckBox() {
			List<WebElement> checkboxes = driver.findElements(By.name("skills"));

			for (WebElement checkbox : checkboxes) {
				String value = checkbox.getAttribute("value");
				if ((value.equals("Java") || value.equals("Python")) && !checkbox.isSelected()) {
					checkbox.click();
				}
			}

		}


}


