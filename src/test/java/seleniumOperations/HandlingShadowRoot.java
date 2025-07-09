package seleniumOperations;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingShadowRoot {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        // 1. Locate the shadow host element
        WebElement shadowHost = driver.findElement(By.cssSelector("custom-element"));

// 2. Get the shadow root from the host
        SearchContext shadowRoot = shadowHost.getShadowRoot();

// 3. Now locate the element inside the shadow DOM
        WebElement usernameInput = shadowRoot.findElement(By.cssSelector("#username"));

// 4. Perform actions
        usernameInput.sendKeys("Siva");


        //using selenium 3
        WebElement shadowHost1 = driver.findElement(By.cssSelector("custom-element"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowRoot1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost1);

        WebElement input = shadowRoot1.findElement(By.cssSelector("#username"));
        input.sendKeys("Siva");


    }
}
