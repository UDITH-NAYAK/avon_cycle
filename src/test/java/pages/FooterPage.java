package pages;

import com.aventstack.extentreports.ExtentTest;
import runner.AppTest;
import uistore.FooterLocators;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;



public class FooterPage {
    private WebDriverHelper webDriverHelper;
    public ExtentTest test = AppTest.test;
    Reporter reporter;
    FooterLocators footerLocators;
    Screenshot screenshotHelper;

    public FooterPage(Reporter reporter) {
        webDriverHelper = new WebDriverHelper(Base.driver);
        footerLocators = new FooterLocators();
        this.reporter = reporter;
    }

    /**
     * Method to click the accept cookies button
     * @author Udith
     * @date 2025-01-30
     */
    public void clickAcceptCookies() {
        try {
            webDriverHelper.clickElement(footerLocators.getAcceptCookies());
            reporter.addLogInfo("Clicked accept cookies", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to accept cookies: " + e.getMessage(), test);
        }
    }

    /**
     * Method to scroll to the refund policy section
     * @author Udith
     * @date 2025-01-30
     */
    public void scrollToRefunPolicy() {
        try {
            webDriverHelper.scrollToElement(footerLocators.getReturnAndRefund());
            reporter.addLogInfo("Scrolled to refund policy", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to scroll to refund policy: " + e.getMessage(), test);
        }
    }

    /**
     * Method to click the refund policy link
     * @author Udith
     * @date 2025-01-30
     */
    public void clickRefunPolicy() {
        try {
            webDriverHelper.clickElement(footerLocators.getReturnAndRefund());
            reporter.addLogInfo("Clicked refund policy", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click refund policy: " + e.getMessage(), test);
        }
    }

    /**
     * Method to click the cancel order link
     * @author Udith
     * @date 2025-01-30
     */
    public void clickCanICancelOrder() {
        try {
            
            webDriverHelper.clickElement(footerLocators.getCanICancelOrder());
        } catch (Exception e) {
            reporter.addLogFail("click CanICancelOrder failed: " + e.getMessage(), test);
        }
    }

    /**
     * Method to verify if the cancel order link color is red
     * @author Udith
     * @date 2025-01-30
     */
    public void verifyCanIOrderColorIsRed() {
        try {
            String colorValue = webDriverHelper.getCssValue(footerLocators.getCanICancelOrder());
            System.out.println("Color is: " + colorValue);
            if (colorValue.equals("rgba(255, 0, 0, 1)")) {
                System.out.println("The element has the color red.");
            } else {
                System.out.println("The element does not have the color red.");
            }
            
        } catch (Exception e) {
            reporter.addLogFail("clik on CanICancelOrder failed: " + e.getMessage(), test);
        }
    }

}
