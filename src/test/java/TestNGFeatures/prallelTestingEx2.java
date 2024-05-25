package TestNGFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class prallelTestingEx2 {
	WebDriver driver;

	
	@Test
	public void test4() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("tes4");
	}
	
	@Test
	public void test5() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebbok.com");
		System.out.println("test5");
		
		
	}
	
	
}
