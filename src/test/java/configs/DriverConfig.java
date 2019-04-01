package configs;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import java.util.HashMap;
import java.util.logging.Level;

import static com.codeborne.selenide.Configuration.timeout;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class DriverConfig {

    private static WebDriver driver = null;
    protected final int maxWaitTime = 15000;

    public DriverConfig() {
        System.out.println("Drivers initiated \n");
    }

    String path = System.getProperty("user.dir") + "/storage/chromedriver.exe";

    public WebDriver getChromeDriver() {
        ChromeDriverManager.getInstance(CHROME).setup();
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--test-type");
        options.addArguments("--disable-notifications");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 1);
        chromePrefs.put("safebrowsing.enabled", true);
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        options.setExperimentalOption("prefs", chromePrefs);
        timeout = maxWaitTime;
        return driver = new ChromeDriver(options);
    }
}
