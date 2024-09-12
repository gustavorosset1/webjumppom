package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }



    public WebElement selectHeaderOption(String s) {
        WebElement webElement = driver.findElement(By.xpath("//div[@class='facet__title'][contains(text(), '" + s + "')]"));

        return webElement;
    }

    public WebElement selectDropDownOption(String s) {
        WebElement webElement = driver.findElement(By.xpath("//div[@class='rc-scrollbars-container']/div/a/div[1]/following-sibling::div/div[contains(text(), '" + s + "')]/../../div[1]"));
        return webElement;
    }

//
//    protected void fluentWait(WebElement element, long timeOutInSeconds, long attemptEverymillis) {
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(timeOutInSeconds))
//                .pollingEvery(Duration.ofMillis(attemptEverymillis))
//                .ignoring(NoSuchElementException.class)
//                .ignoring(org.openqa.selenium.NoSuchElementException.class);
//
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//    }

}

