package StepDefinitions;

import authenticgoods.Forms;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utils.LocalDriver;

import java.time.Duration;
import java.util.function.Function;

public class AuthBaseClass {
    WebDriver driver;
    Wait<WebDriver> wait;


    public AuthBaseClass() {

        this.driver = new LocalDriver().LocalDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class);
    }
    public WebElement getElement(By locator) {
        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }

    public void navigate(String arg0) {
        driver.navigate().to(arg0);
    }

    public void driverClose(){
        driver.close();
    }

}