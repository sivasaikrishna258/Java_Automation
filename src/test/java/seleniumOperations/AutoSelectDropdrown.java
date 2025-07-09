package seleniumOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * so in this kind of drop drowns we cant inspect the elements due to react frameworks ,so we need to pause the execution in browser
 * to inspect element for that we should run below code in console
 * setTimeout(() => { debugger; }, 3000); then click on "Enter" and immediately try to perform action like enter data into dropdrown box so that it will list all the suggested webelements
 */
public class AutoSelectDropdrown {

    public static void main(String[] args) {


            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("https://demoqa.com/automation-practice-form");
            driver.manage().window().maximize();

          Actions actions=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement Widgets= driver.findElement(By.xpath("//*[contains(text(),'Widgets')]"));
        Widgets.click();
        WebElement autoComplete= driver.findElement(By.xpath("//*[contains(text(),'Auto Complete')]"));
        autoComplete.click();

        driver.findElement(By.id("autoCompleteMultipleInput")).sendKeys("e");
        List<WebElement> items=driver.findElements(By.xpath("//div[contains(@class, 'auto-complete__option')]"));

        for (WebElement item:items
             ) {
            if(item.getText().equals("Blue") || item.getText().equals("Red")){
                item.click();
                break;
            }
        }
          //this is the one way to do for auto suggest dropdrown
//            WebElement stateDropdown = driver.findElement(By.id("state"));
//            js.executeScript("arguments[0].scrollIntoView(true)",stateDropdown);
//            actions.moveToElement(stateDropdown).click().perform();
//            WebElement ncrOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                    By.xpath("//div[@id='state']//div[text()='NCR']")
//            ));
//            ncrOption.click();


        }
    }


