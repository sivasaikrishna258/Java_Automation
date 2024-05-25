package TestNGFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionsEx {
	
	WebDriver driver;
	
	@Test
	public void dis() {
		
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");

//		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
//		Assert.assertEquals("google",driver.getTitle()); //hard assertions
		
//		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("axd");

		//soft assertions
		SoftAssert as=new SoftAssert();
		
		
		as.assertEquals("google", driver.getTitle());
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("axd");
		as.assertAll();

		
	}
}
