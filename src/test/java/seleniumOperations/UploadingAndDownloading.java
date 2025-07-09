package seleniumOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import java.util.HashMap;

public class UploadingAndDownloading {
    public static void main(String[] args) {
        String downloadFilepath = "C:\\Users\\You\\Downloads\\test";

        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", downloadFilepath);
        chromePrefs.put("profile.default_content_settings.popups", 0);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://example.com/download");

// Click to download
        driver.findElement(By.id("downloadBtn")).click();

    }
}
