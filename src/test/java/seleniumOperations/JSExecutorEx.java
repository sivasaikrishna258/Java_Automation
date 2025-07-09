package seleniumOperations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/** from your Selenium test. It's powerful for handling scenarios where standard WebDriver methods don't work well — like clicking hidden elements, scrolling, or fetching values from the DOM.

 ✅ How to Use JavaScriptExecutor:

 JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("your JS code here");
 🔧 Common Use Cases:
 Click an Element (force click)
 Useful when .click() fails due to overlays or hidden elements.

 WebElement button = driver.findElement(By.id("submit"));
 js.executeScript("arguments[0].click();", button);
 Scroll into View:

 js.executeScript("arguments[0].scrollIntoView(true);", element);
 Scroll the Page:

 js.executeScript("window.scrollBy(0,500)");
 Get Page Title:

 String title = (String) js.executeScript("return document.title;");
 Set Input Field Value:


 WebElement input = driver.findElement(By.id("email"));
 js.executeScript("arguments[0].value='test@example.com';", input);
 🛑 When to Use It:
 When Selenium can’t interact with an element due to JavaScript-heavy UIs

 To perform DOM manipulations

 For debugging or extracting data that's otherwise hidden

*/
 public class JSExecutorEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arg[0].click()");
	}

}
/**
 * 🧠 Why the Cast Works
 * Because ChromeDriver, FirefoxDriver, etc. implement both WebDriver, TakesScreenshot, and JavascriptExecutor.

 * public class ChromeDriver implements WebDriver, TakesScreenshot, JavascriptExecutor
 * So when we cast, we’re telling Java:
 *
 * “Trust me, this driver instance also implements this other interface — let me use its methods.”
 *
 * in other words i will say that we are doind casting so that i will use the methods of js executor and takescreenshot interfaces

 here we are doing downcasting .

 WebDriver driver=new ChromeDriver(); --- > upcasting (automatic)

 javascriptexecutor js= (javascriptexecutor) driver; --- > down casting(doing manually)

 */