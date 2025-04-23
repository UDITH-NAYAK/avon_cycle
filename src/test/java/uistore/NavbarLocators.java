package uistore;

import org.openqa.selenium.By;

public class NavbarLocators {
            final private By internationalNav = By.xpath("//li/a[text()='International Business']");
        final private By aboutSection = By.xpath("(//div[@class='heading'])[1]");
        final private By ourProductsSection = By.xpath("(//div[@class='heading'])[2]");
        final private By buisnessSection = By.xpath("(//div[@class='heading'])[6]");
        final private By internationalSection = By.xpath("(//div[@class='heading'])[8]");
        
        final private By cycleBrandNav = By.xpath("(//a[@class='nav-link'])[4]");
        final private By cycluxNav = By.xpath("//div[@class='dropdown-menu']/a[@class='dropdown-item' and text()='Cyclux']");
        final private By price= By.id("radio1");
        final private By color = By.xpath("//p[text()='Color Swatches']");
        final private By redColor = By.id("radio16");
        final private By filterColr = By.xpath("(//div[@id='filterBtns']/div)[1]");
        final private By filterPriceTezt = By.xpath("(//div[@id='filterBtns']/div)[2]");
        
        public By getCycluxNav() {
            return cycluxNav;
        }
        public By getPrice() {
            return price;
        }
        public By getColor() {
            return color;
        }
        public By getRedColor() {
            return redColor;
        }
        public By getFilterColr() {
            return filterColr;
        }
        public By getFilterPriceTezt() {
            return filterPriceTezt;
        }
        public By getCycleBrandNav() {
            return cycleBrandNav;
        }
        //testcase
        public By getInternationalNav() {
            return internationalNav;
        }
        public By getAboutSection() {
            return aboutSection;
        }
        public By getOurProductsSection() {
            return ourProductsSection;
        }
        public By getBuisnessSection() {
            return buisnessSection;
        }
        public By getInternationalSection() {
            return internationalSection;
        }
}
