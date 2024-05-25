package seleniumOperations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4features {

	@Test
	public void takeWebElementScreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//li[@class='menu_Hotels']"));
		File src=ele.getScreenshotAs(OutputType.FILE);

		File dest=new File("logon.png");
		FileUtils.copyFile(src, dest);	

		driver.quit();
	}

	@Test
	public void OpenNewTab() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password')]"));
		System.out.println(link.getAttribute("href"));
		String s=link.getAttribute("href");
		driver.switchTo().newWindow(WindowType.TAB).get(s);//for open new tab
		//driver.switchTo().newWindow(WindowType.WINDOW);//for open new window
		//driver.navigate().to(s);

	}
	
	@Test
	public void RelativeLocators() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
//		WebElement link=driver.findElement(RelativeLocator.with(By.tagName("a")).above(By.xpath("//a[contains(text(),'Create a Page')]")));
//		link.click();
		
		driver.findElement(RelativeLocator.with(By.tagName("button")).near(By.id("pass"))).click();
	}
	
	@Test
	public void TakeScreenshotOfParticularScetion() throws IOException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		WebElement a = driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		
		File src=a.getScreenshotAs(OutputType.FILE);
		File dest=new File("sec.png");
		FileUtils.copyFile(src, dest);
	}

}
