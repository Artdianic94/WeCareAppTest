package tests.uitests;


import factorydriver.DriverFactory;
import factorydriver.DriverManager;
import factorydriver.DriverType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;


public class BaseTest {

    WebDriver driver;
    DriverManager driverManager;

    @BeforeTest
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) throws MalformedURLException {

        DriverFactory factory = new DriverFactory();
        DriverType driverType = switch (browser) {
            case "chrome" -> DriverType.CHROME;
            case "firefox" -> DriverType.FIREFOX;
            default -> null;
        };
        driverManager = factory.getManager(driverType);
        driverManager.setUpDriver();
        driver = driverManager.getDriver();
        driverManager.maximize();
        driverManager.setTimeout();
        System.getProperty("configuration");
    }
    public WebDriver getDriver() {
        return driver;
    }
    @AfterTest(alwaysRun = true)
    public void quiteBrowser() {
        driverManager.quitDriver();
    }
}