package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.FooterPage;
import pages.HomePageActions;
import pages.NavbarPage;
import pages.ProductsPage;
import utils.Base;
import utils.Reporter;

public class AppTest extends Base {

    public static ExtentTest test;
    public Reporter reporter = new Reporter();
    HomePageActions homePageActions;
    FooterPage footerPage;
    NavbarPage navbarPage;
    ProductsPage productsPage;
    @BeforeClass
    void reporting() {
        reporter.generateReport("AvonCycle");
    }

    @BeforeMethod
    void setup() {
        openBrowser();
    }

    /*
     * Test Id:E1US1S2
     * 
     */
    @Test(enabled = true)
    public void test1() {
        test = reporter.createTest("signin_with_valid");
        homePageActions = new HomePageActions(reporter);
        homePageActions.clickProfile();
        homePageActions.clickRegistration();
        homePageActions.inputEmail();
        homePageActions.inputPassword();
        homePageActions.clickSignUp();
    }

    /*
     * Test 2
     * Test Id:E1US1S3
     */
    @Test(enabled = false)
    public void test2() {
        test = reporter.createTest("signin test");
        homePageActions = new HomePageActions(reporter);
        homePageActions.clickProfile();
        homePageActions.clickRegistration();
        homePageActions.inputEmail();
        homePageActions.inputPassword();
        homePageActions.clickSignUp();
    }
    
    // test3 pending 
    
    
    /*
     * Test 4
     * Test Id:E3US1S1
     */
    @Test(enabled = false)
    public void test4() {
        test = reporter.createTest("FooterPage refund policy test");
        footerPage=new FooterPage(reporter);
        footerPage.clickAcceptCookies();
        footerPage.scrollToRefunPolicy();
        footerPage.clickRefunPolicy();
        footerPage.clickCanICancelOrder();
        footerPage.verifyCanIOrderColorIsRed();
    }
    
    /*
    * Test 5
    * Test Id E5US13S1
    */
    @Test(enabled = false)
    public void test5() {
        test = reporter.createTest("Navbar international buisness test");
        navbarPage=new NavbarPage(reporter);
        
        navbarPage.clickInternationalBuiness();
        navbarPage.verifyAboutSection();
        navbarPage.verifyOurProductsSection();
        navbarPage.verifyBuisnessModel();
    }
    
    /*Test 6 
     * Test : E5US15S2 Not done
    */
    @Test(enabled = false)
    public void test6(){
        test = reporter.createTest("Navbar cyclux test");
        navbarPage=new NavbarPage(reporter);
        navbarPage.hoverCycleBrand();
        navbarPage.clickCyclux();
        navbarPage.clickPrice();
        // navbarPage.clickColor();
        // navbarPage.selectRedColor();
    }

    /*
     * Test 7
     * Test : E8US1S1
     */
    @Test(enabled = false)
    public void test7(){
        test = reporter.createTest("Press coverage");
        homePageActions=new HomePageActions(reporter);
        homePageActions.clickAcceptCookies();
        homePageActions.scrollToPressCoverage();
        homePageActions.clickOnViewAll();
        homePageActions.clickFirstResult();
    }
    

    @Test(enabled = false)
    public void test8(){
        test = reporter.createTest("Press_coverage_timesofIndia_test");
        homePageActions=new HomePageActions(reporter);
        homePageActions.clickAcceptCookies();
        homePageActions.scrollToPressCoverage();
        homePageActions.clickOnViewAll();
        homePageActions.clickTimeOfIndia();
        
    }

    @Test(enabled = false)
    public void test9(){
        test = reporter.createTest("Compare_redirect_test");
        homePageActions=new HomePageActions(reporter);
        homePageActions.clickAcceptCookies();
        homePageActions.hoverCycleBrand();
        homePageActions.clickCyclux();
        homePageActions.clickCompareSideNav();
        homePageActions.verifyPageIsInCompare();
        
    }
    
    @Test(enabled = false)
    public void test10(){
        test = reporter.createTest("Compare_redirect_test");
        homePageActions=new HomePageActions(reporter);
        homePageActions.clickAcceptCookies();
        homePageActions.hoverCycleBrand();
        homePageActions.clickCyclux();
        homePageActions.clickCompareOne();
        homePageActions.clickCompareOne();
        homePageActions.clickCompareSideNav();
    }

    @Test(enabled = false)
    public void test11(){
        test = reporter.createTest("Tredning_Section_test");
        homePageActions=new HomePageActions(reporter);
        homePageActions.clickAcceptCookies();
        homePageActions.scrollToTrendingProduct();
        homePageActions.clickAnyTrendingProduct();
    } 

    @Test(enabled = false)
    public void test12(){
        test = reporter.createTest("Compare_Product_Test");
        homePageActions=new HomePageActions(reporter);
        homePageActions.clickAcceptCookies();
        homePageActions.hoverCycleBrand();
        homePageActions.clickCyclux();
        homePageActions.clickCompareOne();
        homePageActions.clickCompareOne();
        homePageActions.verifyPopUpAlreadyAdded();
    } 
    
    @Test(enabled = false)
    public void test13(){
        test = reporter.createTest("New_launch_test");
        productsPage=new ProductsPage(reporter);
        productsPage.clickOnNewLaunches();
        productsPage.verifyTheCurrentUrl();
        productsPage.clickHearIcon();
        productsPage.switchToNewWindow();
        productsPage.verifyUrl();
        
    }
    
    @Test(enabled = false)
    public void test14(){
        test = reporter.createTest("Navbar_Electric_Bicycle");
        productsPage=new ProductsPage(reporter);
        productsPage.hoverBicycleCat();
        productsPage.clickElectricBicycle();
        productsPage.clickThirProduct();
    }

    @Test(enabled = false)
    public void test15(){
        test = reporter.createTest("Profile_update");
        homePageActions=new HomePageActions(reporter);
        homePageActions.clickProfile();
        homePageActions.clickLogin();
        homePageActions.clickAcceptCookies();
        homePageActions.enterEmail();
        homePageActions.enterPassword();
        homePageActions.clickLoginSubmit();
        homePageActions.clickAddress();
        
    }

    @Test(enabled = false)
    public void test16(){
        test = reporter.createTest("Add_to_Wishlist");
        homePageActions=new HomePageActions(reporter);
        homePageActions.clickProfile();
        homePageActions.clickLogin();
        homePageActions.clickAcceptCookies();
        homePageActions.enterEmail();
        homePageActions.enterPassword();
        homePageActions.clickLoginSubmit();

        homePageActions.hoverCycleBrand();
        homePageActions.clickCyclux();
        homePageActions.clikONFavourite();
        homePageActions.verifyPopUpAddtoWishlist();
        

    }




    @AfterMethod
    void teardown() {
        closing();
    }

    @AfterClass
    void reportSaving() {
        reporter.flushing();
    }
}
