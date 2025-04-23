package uistore;

import org.openqa.selenium.By;

public class ProductsLocators {
    private final By newLaunchNav = By.xpath("(//a[@class='nav-link'])[2]");
    private final By fav =By.xpath( "(//button//span[@class='icon-heart'])[1]");
    private final By bicycle_category =By.xpath( "(//a[@class='nav-link'])[3]");
    private final By electricCycle =By.xpath( "(//li/div/a[@class='dropdown-item'])[5]");
    private final By thirdProduct =By.xpath( "//div[@class='trending-product']/div/div[3]");

    public By getBicycle_category() {
        return bicycle_category;
    }
    public By getElectricCycle() {
        return electricCycle;
    }
    public By getThirdProduct() {
        return thirdProduct;
    }
    public By getNewLaunchNav() {
        return newLaunchNav;
    }
    public By getFav() {
        return fav;
    }
}
