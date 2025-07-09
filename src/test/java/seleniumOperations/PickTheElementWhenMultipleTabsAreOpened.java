package seleniumOperations;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PickTheElementWhenMultipleTabsAreOpened {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password')]"));
        System.out.println(link.getAttribute("href"));
        WebElement page = driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
        String s = link.getAttribute("href");
        String s1 = page.getAttribute("href");
        driver.switchTo().newWindow(WindowType.TAB).get(s);//for open new tab

        driver.switchTo().newWindow(WindowType.TAB).get(s1);

        //driver.switchTo().newWindow(WindowType.WINDOW);//for open new window
        //driver.navigate().to(s);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Set<String> alltabs = driver.getWindowHandles();
        List<String> ls = new ArrayList<>(alltabs);
        String parent = driver.getWindowHandle();
        for (String tab : alltabs) {

            if (!parent.equals(tab)) {
                driver.switchTo().window(tab);
            }
            List<WebElement> signup = driver.findElements(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']"));

            //WebElement create=driver.findElement(By.name("email"));
            for (WebElement signup1 : signup)
                if (signup1.isDisplayed()) {
                    signup1.click();
                    break;
                }

        }

        String originalWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            driver.switchTo().window(windowHandle);

            try {
                WebElement target = driver.findElement(By.id("myTargetButton"));
                if (target.isDisplayed()) {
                    target.click();
                    break; // found and clicked, exit the loop
                }
            } catch (NoSuchElementException e) {
                // Element not found in this tab — keep looping
            }
        }

// Optionally, switch back to the original window
        driver.switchTo().window(originalWindow);


    }

}


