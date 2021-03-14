package authenticgoods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ourDrivers;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class CommonStepDefBasePageObject {
    public static WebDriver driver;
    Wait<WebDriver> wait;
    String URL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#";

    public CommonStepDefBasePageObject() {
        if (driver == null) {
            driver = new ourDrivers().localDriver();
        }
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class);
    }

    public void navigate() {
        driver.navigate().to(URL);
        waitForPageLoad();
    }

    public void driverClose() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebElement getElement(By locator) {
        return wait.until(driver -> driver.findElement(locator));
    }

    public void waitFor(String arg0) {
        System.out.println(arg0);
        try {
            Thread.sleep(Integer.parseInt(arg0) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    ////***IMPORTANT CODE BELOW***////
    public void waitForPageLoad() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Current Window State       : "
                        + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }

    public WebElement getClickableElement(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public List<WebElement> getElements(By locator) {
        return wait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });
    }

    public void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}