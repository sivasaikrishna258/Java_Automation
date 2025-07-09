package seleniumOperations;

import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.ixigo.com/trains/train-seat-availability?utm_source=bing&utm_medium=paid_search_bing_trains&utm_campaign=train_search_desktop_bing&msclkid=f7f5a5200e581a836375c32a80e2b0a9&utm_term=online%20train%20ticket%20booking&utm_content=Ad%20group%201");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//div[@class='train-static-from-to-fields']//div[@class='form-cntr train']//div[@class='train-form']//div[@class='form-fields']//div[@class='date u-ib u-v-align-bottom']//div//input[@placeholder='depart']")).click();
//        Thread.sleep(30);
//        String mon = "July", yea = "2024";
//
//
//        String month = null, year = null;
//        String date = "3";
//
//        int i;
//        while (true) {
//
//            for (i = 1; i < 3; i++) {
//                String monyear = driver.findElement(By.xpath("//div[@class='rd-month'][" + i + "]//div[@class='rd-month-label']")).getText();
//                String m[] = monyear.split(" ");
//                month = m[0];
//                year = m[1];
//
//                System.out.println(month + "" + year);
//
//                if (month.equals(mon) && yea.equals(year)) {
//                    break;
//                } else {
//                    driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
//                }
//
//            }
//
//            List<WebElement> lis = driver.findElements(By.xpath("//div[@class='rd-month'][" + i + "]//td"));
//
//            for (WebElement l : lis) {
//                if (l.getText().equals(date)) {
//                    l.click();
//                    break;
//                }
//            }
//        }
//


        //latest date picker

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.irctc.co.in/nget/train-search");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[text()='OK']")).click();
        driver.findElement(By.id("jDate")).click();

//        String mon=driver.findElement(By.className("ui-datepicker-month")).getText();
//
//        String year=driver.findElement(By.className("ui-datepicker-year")).getText();
//
//        System.out.println(year + " " + mon);

        String mon = null;
        String year = null;

        String gmonth = "June";
        String gyear = "2026";
        String date = "30";
        while (true) {
            mon = driver.findElement(By.className("ui-datepicker-month")).getText();

            year = driver.findElement(By.className("ui-datepicker-year")).getText();
            if (mon.equals(gmonth) && year.equals(gyear)) {
                break;
            } else {

                driver.findElement(By.cssSelector("a.ui-datepicker-next")).click();
            }
        }

        List<WebElement> dates = driver.findElements(By.cssSelector("table tbody td"));

        for (WebElement d : dates) {
            System.out.println(d.getText());

            if (d.isEnabled()) {
                if (d.getText().equals(date)) {
                    d.click();
                    break;
                }
            }
        }
//        driver.quit();


    }

}
		
	

