package MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.CRM.Mypages.BasePage;
import com.qa.CRM.Mypages.page;

public class BaseTest {

	WebDriver driver;
	public page  page;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		
		page=new BasePage(driver);
	}
	
//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//	}
}
