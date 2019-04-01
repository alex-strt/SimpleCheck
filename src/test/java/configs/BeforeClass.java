package configs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit.ScreenShooter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BeforeClass {

    private final String baseURL = "https://rozetka.com.ua/";

//    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();


    @BeforeTest
    public void before() {
//        Configuration.timeout = maxWaitTime;
        Configuration.timeout = 15000;
//        makeScreenshotOnFailure.captureSuccessfulTests = true;
//        WebDriverRunner.setWebDriver(getChromeDriver());
        open(baseURL);
    }

    @AfterTest
    public void close() {
        getWebDriver().quit();
    }
}
