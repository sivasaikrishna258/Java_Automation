package seleniumOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOverOperations {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		driver.manage().window().maximize();
		
		WebElement Douu=driver.findElement(By.xpath("//button[contains(text(),'Click Me / Double Click Me!')]"));
		
//		//perform double click
		Actions act=new Actions(driver);
		act.doubleClick(Douu).perform();
		
		//drag and drop
		driver.get("https://stqatools.com/demo/Drag&Drop.php");
		WebElement source=driver.findElement(By.xpath("//img[@id='dragA']"));
		WebElement dest=driver.findElement(By.id("dropBox"));
		
		//approach1
		act.dragAndDrop(source, dest).perform();
		
		//approach2
		Action action=act.clickAndHold(source).moveToElement(dest).release(dest).build();
		action.perform();
		
		//MouseOverOnTheElement
		
		driver.get("https://stqatools.com/demo/MouseHover.php");
		
		WebElement mod=driver.findElement(By.xpath("//button[normalize-space()='Mouse Hover DropDown']"));
		WebElement  link=driver.findElement(By.xpath("//div[@class='dropdown-content']//a[3]"));
		
		act.moveToElement(mod).moveToElement(link).click().perform();
		
		
		
	}

}
