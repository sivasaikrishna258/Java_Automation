package seleniumOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();

        // Add arguments
        options.addArguments("--start-maximized");     // Open browser in maximized mode
        options.addArguments("--incognito");           // Launch in incognito mode
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");

        // Optional: Headless mode (no UI)
        // options.addArguments("--headless=new");

        // Set binary path if using custom Chrome build (optional)
        // options.setBinary("C:\\Path\\To\\Chrome.exe");

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

        // Navigate
        driver.get("https://example.com");

        /**
         * | Argument                   | Description                                        |
         * | -------------------------- | -------------------------------------------------- |
         * | `--start-maximized`        | Opens Chrome in full-screen mode                   |
         * | `--start-fullscreen`       | Launches in true fullscreen (F11)                  |
         * | `--kiosk`                  | Kiosk mode (full-screen without exit)              |
         * | `--headless`               | Run Chrome without UI (in background)              |
         * | `--disable-gpu`            | Disable GPU acceleration (for headless mode)       |
         * | `--no-sandbox`             | Bypass OS-level sandbox (required in CI/CD often)  |
         * | `--disable-dev-shm-usage`  | Use disk instead of /dev/shm (fix crash in Docker) |
         * | `--disable-extensions`     | Disables all Chrome extensions                     |
         * | `--incognito`              | Launch in incognito mode                           |
         * | `--disable-popup-blocking` | Allow popups                                       |
         * | `--disable-infobars`       | Removes "Chrome is being controlled" banner        |
         * | `--disable-notifications`  | Blocks site notifications                          |
         * | `--remote-allow-origins=*` | Required in latest Chrome versions for automation  |
         * | `--disable-web-security`                | Disable CORS for local testing (unsafe)     |
         * | `--allow-running-insecure-content`      | Allow loading mixed (HTTP on HTTPS) content |
         * | `--ignore-certificate-errors`           | Ignore SSL certificate errors               |
         * | `--proxy-server=http://host:port`       | Use specific proxy                          |
         * | `--no-proxy-server`                     | Disable proxy                               |
         * | `--host-resolver-rules=MAP * 127.0.0.1` | Redirect all hosts to localhost (testing)   |
         */
    }
}
