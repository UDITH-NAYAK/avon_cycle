package utils;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

// /**
//  * A helper class for WebDriver to perform common actions such as clicking
//  * elements,
//  * sending keys, hovering, scrolling, handling alerts, and assertions.
//  */
public class WebDriverHelper {

    private WebDriver driver;
    private WebDriverWait wait;

    String parentWindow;

    /**
     * Constructor to initialize WebDriverHelper with a WebDriver instance.
     * 
     * @param driver the WebDriver instance.
     */
    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Clicks an element specified by the locator.
     * 
     * @param locator the locator of the element to be clicked.
     * @throws Exception if an error occurs while clicking the element.
     */
    public void clickElement(By locator) throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    /**
     * Hovers over an element specified by the locator.
     * 
     * @param locator the locator of the element to be hovered over.
     * @throws Exception if an error occurs while hovering over the element.
     */
    public void hoverElement(By locator) throws Exception {
        Actions actions = new Actions(driver);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.moveToElement(element).perform();
    }

    /**
     * Sends keys to an element specified by the locator.
     * 
     * @param locator the locator of the element.
     * @param keys    the keys to be sent.
     * @throws Exception if an error occurs while sending keys to the element.
     */
    public void sendKeysToElement(By locator, String keys) throws Exception {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(keys);
    }

    /**
     * Presses the Enter key on an element specified by the locator.
     * 
     * @param locator the locator of the element.
     * @throws Exception if an error occurs while pressing Enter on the element.
     */
    public void pressEnter(By locator) throws Exception {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(Keys.ENTER);
    }

    /**
     * Presses the Tab key on an element specified by the locator.
     * 
     * @param locator the locator of the element.
     * @throws Exception if an error occurs while pressing Tab on the element.
     */
    public void pressTab(By locator) throws Exception {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(Keys.TAB);
    }

    /**
     * Scrolls to the element specified by the locator.
     * 
     * @param locator the locator of the element to scroll to.
     * @throws Exception if an error occurs while scrolling to the element.
     */
    public void scrollToElement(By locator) throws Exception {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Switches a tab using getWindowHandles.
     */
    public void switchTab() throws Exception {
        parentWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!parentWindow.contentEquals(windowHandle)) {
                // Switch to the new tab
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    /**
     * Accepts the currently displayed alert.
     */
    public void acceptAlert() throws Exception {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    /**
     * Declines the currently displayed alert.
     */
    public void declineAlert() throws Exception {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
    }

    /**
     * Asserts that the current URL matches the expected URL.
     * 
     * @param expectedUrl the expected URL.
     * @throws AssertionError if the current URL does not match the expected URL.
     */
    public void assertUrl(String expectedUrl) throws AssertionError {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    /**
     * Asserts that the text of an element contains the expected text.
     * 
     * @param locator      the locator of the element.
     * @param expectedText the expected text to be contained.
     * @throws AssertionError if the element's text does not contain the expected
     *                        text.
     */
    public void assertElementTextContain(By locator, String expectedText) throws AssertionError, Exception {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String actualText = element.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    /**
     * Asserts that the text of an element matches the expected text.
     * 
     * @param locator      the locator of the element.
     * @param expectedText the expected text.
     * @throws AssertionError if the element's text does not match the expected
     *                        text.
     */
    public void assertElementText(By locator, String expectedText) throws AssertionError, Exception {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText, "Text does not match!");
    }

    public WebElement getWebElement(By locator) throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public String getCssValue(By locator) throws Exception {
        return driver.findElement(locator).getCssValue("color");
    }
}