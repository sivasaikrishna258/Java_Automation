package seleniumOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class KeyboardActions {

    public static void main(String[] args) {
        //✅ 2. Using Actions Class for Advanced Keyboard Interactions

        WebDriver driver = new ChromeDriver();

        Actions actions = new Actions(driver);

// Example: Ctrl + A (Select All)
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

// Example: Shift + Tab (Navigate backward)
        actions.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).perform();

// Example: Press Enter
        actions.sendKeys(Keys.ENTER).perform();

    }
}
