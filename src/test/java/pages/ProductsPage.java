package pages;

import com.aventstack.extentreports.ExtentTest;

import runner.App;
import uistore.HomePageLocators;
import uistore.NavbarLocators;
import uistore.ProductsLocators;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ProductsPage {
    private WebDriverHelper webDriverHelper;
    public ExtentTest test = App.test;
    Reporter reporter;
    ProductsLocators productsLocators;
    Screenshot screenshotHelper;

    public ProductsPage(Reporter reporter) {
        webDriverHelper = new WebDriverHelper(Base.driver);
        this.reporter = reporter;
        productsLocators = new ProductsLocators();
    }

    /**
     * Clicks on the New Launches navigation link.
     * 
     * @date 2025-01-30
     */
    public void clickOnNewLaunches() {
        try {
            webDriverHelper.clickElement(productsLocators.getNewLaunchNav());
            reporter.addLogInfo("Clicked on New Launches", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click on New Launches: " + e.getMessage(), test);
        }
    }

    /**
     * Verifies the current URL.
     * 
     * @date 2025-01-30
     */
    public void verifyTheCurrentUrl() {
        try {
            webDriverHelper.assertUrl("https://avoncycles.com/category/new-launches.html");
            reporter.addLogInfo("Verified the current URL", test);
        } catch (Exception e) {
            reporter.addLogFail("URL verification failed: " + e.getMessage(), test);
        }
    }

    /**
     * Clicks on the Hear Icon.
     * 
     * @date 2025-01-30
     */
    public void clickHearIcon() {
        try {
            webDriverHelper.clickElement(productsLocators.getFav());
            reporter.addLogInfo("Clicked on Hear Icon", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click Hear Icon: " + e.getMessage(), test);
        }
    }

    /**
     * Switches to the new window opened by the application.
     * 
     * @date 2025-01-30
     */
    public void switchToNewWindow() {
        try {
            webDriverHelper.switchTab();
            reporter.addLogInfo("Switched to new tab", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to switch to new tab: " + e.getMessage(), test);
        }
    }

    /**
     * Verifies the current URL.
     * 
     * @date 2025-01-30
     */
    public void verifyUrl() {
        try {
            webDriverHelper.assertUrl("https://avoncycles.com/customer/login.html");
            reporter.addLogInfo("Verified the URL", test);
        } catch (Exception e) {
            reporter.addLogFail("URL verification failed: " + e.getMessage(), test);
        }
    }

    /**
     * Hovers over the bicycle category.
     * 
     * @date 2025-01-30
     */
    public void hoverBicycleCat() {
        try {
            webDriverHelper.hoverElement(productsLocators.getBicycle_category());
            reporter.addLogInfo("Hovered over bicycle category", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to hover over bicycle category: " + e.getMessage(), test);
        }
    }

    /**
     * Clicks on the electric bicycle link.
     * 
     * @date 2025-01-30
     */
    public void clickElectricBicycle() {
        try {
            webDriverHelper.clickElement(productsLocators.getElectricCycle());
            reporter.addLogInfo("Clicked electric bicycle", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click electric bicycle: " + e.getMessage(), test);
        }
    }

    /**
     * Clicks on the third product.
     * 
     * @date 2025-01-30
     */
    public void clickThirProduct() {
        try {
            webDriverHelper.clickElement(productsLocators.getThirdProduct());
            reporter.addLogInfo("Clicked third product", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click third product: " + e.getMessage(), test);
        }
    }
}
