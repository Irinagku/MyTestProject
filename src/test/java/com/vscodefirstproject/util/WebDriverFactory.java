package com.vscodefirstproject.util;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;

public class WebDriverFactory {

    public static final String browserTypeChrome = "chrome";
    public static final String browserTypeFirefox = "firefox";
    public static final String browserTypeEdge = "edge";
    public static final String FirefoxDriver = null;

    // private String PATH_SAFARI_DRIVER = "/usr/bin/safaridriver";
    public static WebDriver createWebDriver() throws Exception {
        String webdriver = System.getProperty("browser", "chrome");
        switch (webdriver) {
            case browserTypeFirefox:
                return new FirefoxDriver();
            case browserTypeChrome:
                return new ChromeDriver();
            case browserTypeEdge:
                return new EdgeDriver();
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriver);
        }
    }

    
}
