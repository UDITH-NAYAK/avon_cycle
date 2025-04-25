package pages;

import com.aventstack.extentreports.ExtentTest;

import runner.App;
import uistore.NavbarLocators;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NavbarPage {
    private WebDriverHelper webDriverHelper;
    public ExtentTest test = App.test;
    Reporter reporter;
    NavbarLocators navbarLocators;
    Screenshot screenshotHelper;

    public NavbarPage(Reporter reporter) {
        webDriverHelper = new WebDriverHelper(Base.driver);
        navbarLocators = new NavbarLocators();
        this.reporter = reporter;
    }

    /**
     * Method to click the international business link
     * @date 2025-01-30
     */
    public void clickInternationalBuiness() {
        try {
            webDriverHelper.hoverElement(navbarLocators.getInternationalNav());
            webDriverHelper.clickElement(navbarLocators.getInternationalNav());
            reporter.addLogInfo("Clicked international", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click international: " + e.getMessage(), test);
        }
    }

    /**
     * Method to verify the About section
     * @date 2025-01-30
     */
    public void verifyAboutSection() {
        try {
            webDriverHelper.assertElementTextContain(navbarLocators.getAboutSection(), "About");
            reporter.addLogInfo("Verified About Us section - exists", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to verify About Us section: " + e.getMessage(), test);
        }
    }

    /**
     * Method to verify the Our Products section
     * @date 2025-01-30
     */
    public void verifyOurProductsSection() {
        try {
            webDriverHelper.assertElementTextContain(navbarLocators.getOurProductsSection(), "Our Products");
            reporter.addLogInfo("Verified Our Products section - exists", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to verify Our Products section: " + e.getMessage(), test);
        }
    }

    /**
     * Method to verify the Business Model section
     * @date 2025-01-30
     */
    public void verifyBuisnessModel() {
        try {
            webDriverHelper.assertElementTextContain(navbarLocators.getBuisnessSection(), "Business Model And Capabilities");
            reporter.addLogInfo("Verified Business Model section - exists", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to verify Business Model section: " + e.getMessage(), test);
        }
    }

    /**
     * Method to verify the International section
     * @date 2025-01-30
     */
    public void verifyInternational() {
        try {
            webDriverHelper.assertElementTextContain(navbarLocators.getInternationalSection(), "International");
            reporter.addLogInfo("Verified International section - exists", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to verify International section: " + e.getMessage(), test);
        }
    }

    /**
     * Method to hover over the cycle brand navigation item
     * @date 2025-01-30
     */
    public void hoverCycleBrand() {
        try {
            webDriverHelper.hoverElement(navbarLocators.getCycleBrandNav());
            reporter.addLogInfo("Hovered over cycle brand", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to hover over cycle brand: " + e.getMessage(), test);
        }
    }

    /**
     * Method to click the Cyclux navigation item
     * @date 2025-01-30
     */
    public void clickCyclux() {
        try {
            webDriverHelper.clickElement(navbarLocators.getCycluxNav());
            reporter.addLogInfo("Clicked Cyclux", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click Cyclux: " + e.getMessage(), test);
        }
    }

    /**
     * Method to click the price range filter
     * @date 2025-01-30
     */
    public void clickPrice() {
        try {
            webDriverHelper.clickElement(navbarLocators.getPrice());
            reporter.addLogInfo("Clicked Price (1000-10000)", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click Price (1000-10000): " + e.getMessage(), test);
        }
    }

    /**
     * Method to click the color filter
     * @date 2025-01-30
     */
    public void clickColor() {
        try {
            webDriverHelper.scrollToElement(navbarLocators.getColor());
            webDriverHelper.clickElement(navbarLocators.getColor());
            reporter.addLogInfo("Clicked color", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click color: " + e.getMessage(), test);
        }
    }

    /**
     * Method to select the red color
     * @date 2025-01-30
     */
    public void selectRedColor() {
        try {
            webDriverHelper.clickElement(navbarLocators.getColor());
            reporter.addLogInfo("Verified red color is selected", test);
            Screenshot.captureScreenShot("color_type_red");
        } catch (Exception e) {
            reporter.addLogFail("Failed to verify red color selection: " + e.getMessage(), test);
        }
    }
}
