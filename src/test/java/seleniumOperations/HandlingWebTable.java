package seleniumOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://stqatools.com/demo/WebTable.php");
		driver.manage().window().maximize();
		int csize=driver.findElements(By.xpath("//thead//tr/th")).size();
		System.out.println("total niumber of coloumns "+csize);
		
		int rsize=driver.findElements(By.xpath("//tbody//tr")).size();
		System.out.println("total niumber of rows "+rsize);
		
		//getting value from table based on our wish
		WebElement text=driver.findElement(By.xpath("//tr[@id='d3']//td[@id='m2']"));
		System.out.println(text.getText());
		
		//getting value based on specific condition
		
		for(int i=1;i<=rsize;i++) {
			String First_name=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[2]")).getText();
			if(First_name.equals("Ujjwal")) {
				String Last_name=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[3]")).getText();
				String Email=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[4]")).getText();
				System.out.println(Last_name +" "+Email);
			}
		}
		
		driver.quit();
	}

}
