package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class GoogleTest extends BaseTest {

    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    @Test
    public void openGoogle() {
        getDriver().get("https://www.google.com");
        System.out.println("Title: " + getDriver().getTitle() + " | Thread ID: " + Thread.currentThread().getId());
    }

    @Test
    public void openBing() {
        getDriver().get("https://www.bing.com");
        System.out.println("Title: " + getDriver().getTitle() + " | Thread ID: " + Thread.currentThread().getId());
    }


    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver.set(new FirefoxDriver());
        } else if (browser.equalsIgnoreCase("edge")) {
            driver.set(new EdgeDriver());
        }
        getDriver().manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
        driver.remove();
    }
}


