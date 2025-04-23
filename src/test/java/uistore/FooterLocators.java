package uistore;

import org.openqa.selenium.By;

public class FooterLocators {
     private final By acceptCookies = By.id("acceptCookies");
     private final By returnAndRefund = By.xpath("//li/a[text()='Returns & Refunds']");
     private final By canICancelOrder = By.xpath("(//li/div[@class='que'])[2]");
     public By getAcceptCookies() {
          return acceptCookies;
     }
     public By getReturnAndRefund() {
          return returnAndRefund;
     }
     public By getCanICancelOrder() {
          return canICancelOrder;
     }

}
