package com.vscodefirstproject.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import com.vscodefirstproject.util.WebDriverFactory;

import dev.failsafe.internal.util.Durations;

public class Testbase {
    public WebDriver driver;

    public static final String browserTypeChrome = "chrome";
    public static final String browserTypeFirefox = "firefox";
    public static final String browserTypeEdge = "edge";
    public static final String FirefoxDriver = null;

    @BeforeClass
    public void setup() {

        try {
            driver = new FirefoxDriver();
            driver.get("https://member.carefirst.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    public static WebDriver creatWebDriver(String webdriver) throws Exception {

        switch (webdriver) {
            case browserTypeFirefox:
                return new FirefoxDriver();
            case browserTypeChrome:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--remote-debugging-port=922");
                return new ChromeDriver();
            case browserTypeEdge:
                return new EdgeDriver();
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriver);

        }
    }

}
