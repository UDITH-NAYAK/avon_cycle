package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
    
    private final By profile = By.xpath("//span[@class='icon-account']");
    private final By acceptCookies = By.id("acceptCookies");
    private final By firstName = By.xpath("//input[@placeholder='First name']");
    private final By lastName = By.xpath("//input[@placeholder='Last name']");
    private final By phoneNumber = By.xpath("//input[@name='phone']");
    private final By createAccount = By.xpath("//div/a[text()='New here? Create an account']");
    private final By loginInBtnProfile= By.xpath("//div/a[text()='Log In']");


    public By getLoginInBtnProfile() {
        return loginInBtnProfile;
    }
    private final By newLaunchNav = By.xpath("(//a[@class='nav-link'])[2]");
    private final By fav = By.xpath("(//button//span[@class='icon-heart'])[1]");
    private final By loginText = By.xpath("//h1[text()='Login account']");
    private final By email = By.xpath("//input[@placeholder='Email']");
    private final By pass = By.xpath("//input[@placeholder='Password']");
    private final By loginBtn = By.xpath("//button[text()='Login']");
    private final By errorText = By.xpath("//span[@class='help-block']");
    private final By signUpBtn = By.id("sc_button-form-process");
    
    
    
    private final By pressCoverage = By.xpath("//div[text()='Press Coverage']");
    private final By wiewAll = By.xpath("//div/a[text()='View All']");
    private final By firstProduct = By.xpath("//div[@id='all']/div");
    private final By timeOfIndia = By.xpath("//li/a[text()='Times of India']");
    
    
    private final By compareSideNav = By.xpath("//div[@class='compare-btn']/a");
    private final By navigator = By.xpath("//ul/li[text()='Page compare']");
    private final By compareBtn1 = By.xpath("(//a//span[@class='icon-flip'])[1]");
    private final By compareBtn2 = By.xpath("(//a//span[@class='icon-flip'])[2]");
    
    private final By trendingSection = By.xpath("//div[text()='Trending Products']");

    private final By anyTrendingproduct = By.xpath("//div[@class='owl-item active']");
    private final By popUpAltreadyAdded = By.id("swal2-title");
    private final By loginSubmit = By.name("SubmitLogin");
    
    private final By addressSection = By.xpath("//li/a[text()='Address']");


    public By getAddressSection() {
        return addressSection;
    }

    public By getLoginSubmit() {
        return loginSubmit;
    }



    public By getTrendingSection() {
        return trendingSection;
    }
    public By getPopUpAltreadyAdded() {
        return popUpAltreadyAdded;
    }
    public By getAnyTrendingproduct() {
        return anyTrendingproduct;
    }
    public By getCompareBtn1() {
        return compareBtn1;
    }
    public By getCompareBtn2() {
        return compareBtn2;
    }
    public By getNavigator() {
        return navigator;
    }
    public By getCompareSideNav() {
        return compareSideNav;
    }
    public By getTimeOfIndia() {
        return timeOfIndia;
    }
    public By getFirstProduct() {
        return firstProduct;
    }
    public By getPressCoverage() {
        return pressCoverage;
    }
    public By getViewAll() {
        return wiewAll;
    }
    //testcase
    public By getProfile() {
        return profile;
    }
    public By getAcceptCookies() {
        return acceptCookies;
    }
    public By getNewLaunchNav() {
        return newLaunchNav;
    }
    public By getFav() {
        return fav;
    }
    public By getLoginText() {
        return loginText;
    }
    public By getEmail() {
        return email;
    }
    public By getPass() {
        return pass;
    }
    public By getLoginBtn() {
        return loginBtn;
    }
    public By getErrorText() {
        return errorText;
    }
    public By getCreateAccount() {
        return createAccount;
    }
    public By getFirstName() {
        return firstName;
    }
    public By getLastName() {
        return lastName;
    }
    public By getPhoneNumber() {
        return phoneNumber;
    }
    public By getSignUpBtn() {
        return signUpBtn;
    }
}
