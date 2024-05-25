package TestNGFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prallelTestingEx {

	WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();
	
	@Test
	public void test1() {
		tldriver.set(new ChromeDriver());
		
		driver=tldriver.get();
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");

		driver.get("https://www.google.com");
		System.out.println("test1");
		
		tldriver.remove();
	}
	
	@Test
	public void test2() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");

		driver.get("https://www.google.com");
		System.out.println("test2");
	}
	
	
}
