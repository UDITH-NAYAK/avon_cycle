package pages;

import com.aventstack.extentreports.ExtentTest;

import runner.App;
import uistore.HomePageLocators;
import uistore.NavbarLocators;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActions {
    private WebDriverHelper webDriverHelper;
    public ExtentTest test = App.test;
    Reporter reporter;
    HomePageLocators homePageLocators;
    NavbarLocators navbarLocators;
    Screenshot screenshotHelper;

    public HomePageActions(Reporter reporter) {
        webDriverHelper = new WebDriverHelper(Base.driver);
        homePageLocators = new HomePageLocators();
        navbarLocators = new NavbarLocators();
        this.reporter = reporter;
    }

    /**
     * @author Udith
     * Method to click the accept cookies button
     * @date 2025-01-30
     */
    public void clickAcceptCookies() {
        try {
            webDriverHelper.clickElement(homePageLocators.getAcceptCookies());
            reporter.addLogInfo("Clicked accept cookies", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to accept cookies: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the profile link/button
     */
    public void clickProfile() {
        try {
            webDriverHelper.clickElement(homePageLocators.getProfile());
            reporter.addLogInfo("Clicked profile", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click profile: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the registration link/button
     */
    public void clickRegistration() {
        try {
            webDriverHelper.hoverElement(homePageLocators.getCreateAccount());
            webDriverHelper.clickElement(homePageLocators.getCreateAccount());
            reporter.addLogInfo("Clicked registration", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click registration: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to input the first name
     */
    public void inputFirstName() {
        try {
            webDriverHelper.sendKeysToElement(homePageLocators.getFirstName(), "FirstName");
            reporter.addLogInfo("Entered First Name", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to input First Name: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to input the last name
     */
    public void inputLastName() {
        try {
            webDriverHelper.sendKeysToElement(homePageLocators.getLastName(), "LastName");
            reporter.addLogInfo("Entered Last Name", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to input Last Name: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to input the email
     */
    public void inputEmail() {
        try {
            webDriverHelper.sendKeysToElement(homePageLocators.getEmail(), "Email");
            reporter.addLogInfo("Entered Email", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to input Email: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to input the phone number
     */
    public void inputPhoneNumber() {
        try {
            webDriverHelper.sendKeysToElement(homePageLocators.getPhoneNumber(), "9876543210");
            reporter.addLogInfo("Entered Phone Number", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to input Phone Number: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to input the sign-in password
     */
    public void inputPassword() {
        try {
            webDriverHelper.sendKeysToElement(homePageLocators.getPass(), "Password");
            reporter.addLogInfo("Entered Sign-In Password", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to input sign-in password: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the sign-up button
     */
    public void clickSignUp() {
        try {
            webDriverHelper.hoverElement(homePageLocators.getSignUpBtn());
            webDriverHelper.clickElement(homePageLocators.getSignUpBtn());
            reporter.addLogInfo("Clicked Sign-Up", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click Sign-Up: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to scroll to the press coverage section
     */
    public void scrollToPressCoverage() {
        try {
            webDriverHelper.scrollToElement(homePageLocators.getPressCoverage());
            reporter.addLogInfo("Scrolled to press coverage", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to scroll to press coverage: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the "View All" link/button
     */
    public void clickOnViewAll() {
        try {
            webDriverHelper.hoverElement(homePageLocators.getViewAll());
            webDriverHelper.clickElement(homePageLocators.getViewAll());
            reporter.addLogInfo("Clicked View All", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click View All: " , test);
        }
    }

    /**
     * @author Udith
     * Method to click the first result/product
     */
    public void clickFirstResult() {
        try {
            webDriverHelper.clickElement(homePageLocators.getFirstProduct());
            reporter.addLogInfo("Clicked First Result", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click First Result: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the "Times of India" link/button
     */
    public void clickTimeOfIndia() {
        try {
            webDriverHelper.clickElement(homePageLocators.getTimeOfIndia());
            reporter.addLogInfo("Clicked Times of India", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click Times of India: " + e.getMessage(), test);
        }
    }

    // Testcase 9

    /**
     * @author Udith
     * Method to hover over the cycle brand navigation item
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
     * @author Udith
     * Method to click the "Cyclux" navigation item
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
     * @author Udith
     * Method to click the compare side navigation item
     */
    public void clickCompareSideNav() {
        try {
            webDriverHelper.clickElement(homePageLocators.getCompareSideNav());
            reporter.addLogInfo("Clicked compare", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click compare: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to verify if the page is in compare mode
     */
    public void verifyPageIsInCompare() {
        try {
            webDriverHelper.assertElementTextContain(homePageLocators.getNavigator(), "Page compare");
            reporter.addLogInfo("Page compare found", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to verify page compare: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the first compare button
     */
    public void clickCompareOne() {
        try {
            webDriverHelper.clickElement(homePageLocators.getCompareBtn1());
            reporter.addLogInfo("Clicked compare button 1", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click compare button 1: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the second compare button
     */
    public void clickCompareTwo() {
        try {
            webDriverHelper.clickElement(homePageLocators.getCompareBtn2());
            reporter.addLogInfo("Clicked compare button 2", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click compare button 2: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to scroll to a trending product
     */
    public void scrollToTrendingProduct() {
        try {
            webDriverHelper.scrollToElement(homePageLocators.getAnyTrendingproduct());
            webDriverHelper.clickElement(homePageLocators.getAnyTrendingproduct());
            reporter.addLogInfo("Clicked any random trending product", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click any random trending product: " + e.getMessage(), test);
        }
    }


       /**
        * @author Udith
     * Method to scroll to and click any trending product
     * @date 2025-01-30
     */
    public void clickAnyTrendingProduct() {
        try {
            webDriverHelper.scrollToElement(homePageLocators.getAnyTrendingproduct());
            webDriverHelper.clickElement(homePageLocators.getAnyTrendingproduct());
            reporter.addLogInfo("Clicked any random trending product", test);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            reporter.addLogFail("Failed to click any random trending product: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to verify if the pop-up message for already added item is displayed
     * @date 2025-01-30
     */
    public void verifyPopUpAlreadyAdded() {
        try {
            webDriverHelper.assertElementTextContain(homePageLocators.getPopUpAltreadyAdded(),
                    "This item is already in stock in the compare");
            reporter.addLogInfo("Text This_item_is_already_in_stock_in_the_compare", test);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            reporter.addLogFail("Failed to verify text This_item_is_already_in_stock_in_the_compare: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the login button
     * @date 2025-01-30
     */
    public void clickLogin() {
        try {
            webDriverHelper.hoverElement(homePageLocators.getLoginInBtnProfile());
            webDriverHelper.clickElement(homePageLocators.getLoginInBtnProfile());
            reporter.addLogInfo("Clicked Login Button", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click Login Button: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to input the email
     * @date 2025-01-30
     */
    public void enterEmail() {
        try {
            webDriverHelper.sendKeysToElement(homePageLocators.getEmail(), "hosov55396@downlor.com");
            webDriverHelper.sendKeysToElement(homePageLocators.getPass(), "123456");
            reporter.addLogInfo("Entered email", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to enter email: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to input the password
     * @date 2025-01-30
     */
    public void enterPassword() {
        try {
            webDriverHelper.sendKeysToElement(homePageLocators.getPass(), "123456");
            reporter.addLogInfo("Entered password", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to enter password: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the login submit button
     * @date 2025-01-30
     */
    public void clickLoginSubmit() {
        try {
            webDriverHelper.hoverElement(homePageLocators.getLoginSubmit());
            webDriverHelper.clickElement(homePageLocators.getLoginSubmit());
            reporter.addLogInfo("Clicked Login Button", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click Login Button: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the address section
     * @date 2025-01-30
     */
    public void clickAddress() {
        try {
            webDriverHelper.clickElement(homePageLocators.getAddressSection());
            reporter.addLogInfo("Clicked address", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click address: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to click the favourite item
     * @date 2025-01-30
     */
    public void clikONFavourite() {
        try {
            webDriverHelper.clickElement(homePageLocators.getFav());
            reporter.addLogInfo("Clicked favourite", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to click favourite: " + e.getMessage(), test);
        }
    }

    /**
     * @author Udith
     * Method to verify if the pop-up message for adding to wishlist is displayed
     * @date 2025-01-30
     */
    public void verifyPopUpAddtoWishlist() {
        try {
            // webDriverHelper.assertElementTextContain(homePageLocators.getPopUpAltreadyAdded(),
            //         "Add to wishlist success");
            reporter.addLogInfo("Text Add_to_wishlist popup: success", test);
        } catch (Exception e) {
            reporter.addLogFail("Failed to verify Add_to_wishlist popup: " + e.getMessage(), test);
        }
    }
}
