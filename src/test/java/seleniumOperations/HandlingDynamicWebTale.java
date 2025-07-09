package seleniumOperations;

import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDynamicWebTale {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		driver.manage().window().maximize();

		List<WebElement> tableRows = driver.findElements(By.cssSelector("table#example tbody tr"));

		for(WebElement row: tableRows){
			List<WebElement> tableCols = row.findElements(By.tagName("td"));
			for(WebElement col:tableCols){
				System.out.println(col.getText());

			}
			break;
		}

	}

}
