package stepsDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.ResourceBundle;

public class BaseClass {
    // to read config.properties
    public static ResourceBundle rb = ResourceBundle.getBundle("config");

    // for Logging
    public Logger logger = LogManager.getLogger(this.getClass());
    public static WebDriver driver;

    public void clickElement(WebElement el) {
        el.click();
    }

    public void switchFrame(WebElement el) {
        this.driver.switchTo().frame(el);
    }

    public void unselectFrame(WebElement el) {
        this.driver.switchTo().defaultContent();
    }


    public void sendKeys(WebElement e, String s) {
        e.click();
        e.sendKeys(s);
    }

    public void elementIsDisplayed(WebElement e) {
        Assert.assertTrue(e.isDisplayed());

    }

    /** There are two different options for the string required on this method which are visible and clickable according to condition if element needs to be visible or clickable*/
    protected void fluentWait(WebElement element, long timeOutInSeconds, long attemptEverymillis, String s) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeOutInSeconds))
                .pollingEvery(Duration.ofMillis(attemptEverymillis))
                .ignoring(NoSuchElementException.class)
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
        if (s.equals("visible")) {
            wait.until(ExpectedConditions.visibilityOf(element));
        } else if (s.equals("clickable")) {
            wait.until(ExpectedConditions.elementToBeClickable(element));

        }
    }


}
