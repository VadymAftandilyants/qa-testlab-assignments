package myprojects.automation.assignment2;

import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */

    private static WebDriver getDriver() {
        String browser = Properties.getBrowser();
        switch (browser) {
            case "firefox":
                System.setProperty(
                        "webdriver.gecko.driver",
                        new File(BaseScript.class.getResource("/geckodriver").getFile()).getPath());
                return new FirefoxDriver();

            case "chrome":
            default:
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/main/resources/chromedriver");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-infobars");
             return new ChromeDriver(options);
        }
    }

    public static EventFiringWebDriver getConfiguredDriver() {
        // TODO return  WebDriver instance
        WebDriver driver = getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   // ожидает 5 сек, после повторяет попытку, настраивается один раз
        EventFiringWebDriver webDriver = new EventFiringWebDriver(driver);
        webDriver.register(new EventHandler());
        return webDriver;

        /**
         * Если использовать данный throw возвращает Exception, а без него все работает.
         */
//        throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
    }

    public static void quitDriver(WebDriver driver) {
        driver.quit();
    }
}
