package seleniumOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//handling single frame
		
//		driver.switchTo().frame(driver.findElement(By.name("SingleFrame")));
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("siva");
		
		//hnadling frames within frames
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		String s= driver.switchTo().frame(outerframe).getTitle();
		System.out.println(s);
		
		String s1=driver.switchTo().frame(driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"))).getTitle();
		System.out.println(s1);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("siva");
		
		String s3=driver.switchTo().defaultContent().getTitle();
		System.out.println(s3);
		
		driver.quit();
			}

}
