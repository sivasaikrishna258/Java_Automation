package seleniumOperations;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingWndows {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		String homepage=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();	
		
		Set<String> alltabs=driver.getWindowHandles();
		
		List<String> l=new ArrayList<String>(alltabs);
		
		String parent=l.get(0);
		String child=l.get(1);
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		
		driver.switchTo().window(child);
		
		driver.close();
		driver.switchTo().window(parent);
		
		
		System.out.println(driver.getTitle());
		
	//driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows ')]")).click();
		//driver.switchTo().defaultContent();
//		for(String s:alltabs) {
//			if(!s.equals(homepage)) {
//				
//				driver.switchTo().window(s);
//				break;
//			}
//		}
		}

}
