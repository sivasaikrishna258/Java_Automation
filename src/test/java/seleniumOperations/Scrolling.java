package seleniumOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
    public static void main(String[] args) {
        // ✅ 1. Scroll using JavaScriptExecutor
//🔹 Scroll to a specific element:
        WebDriver driver = new ChromeDriver();
        WebElement element = driver.findElement(By.id("footer"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        /**
🔹Scroll by pixel:

                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500)");
🔹Scroll to bottom of the page:

                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
✅2. Scroll using Actions class
        Scroll by moving to a specific element:

        WebElement element = driver.findElement(By.id("target"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();


        This approach will scroll until the element is in view (similar to scrollIntoView ()).
         */
    }
}
