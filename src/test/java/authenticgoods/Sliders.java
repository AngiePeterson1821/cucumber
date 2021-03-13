package authenticgoods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

public class Sliders extends CommonStepDefBasePageObject {
    WebDriver webDriver;
    FluentWait<WebDriver> wait;

    public Sliders() {
        super();
    }
    public void dragSlider() {
        WebElement slider = driver.findElement(By.xpath("/html/body/section/section/div[1]/div/section/div/div/div[1]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 50, 0).build();
        ((Actions) action).perform();
    }
    public void slide(int percent) throws InterruptedException {
        By locator = By.cssSelector("[class='slider-selection']");
        By handle = By.cssSelector("[class='slider-handle round']");
//TODO:
        /**
         * initial percent.
         * passed percent through the argument
         */
        String style = "style='left: 0%; width: 54.8%;'";
        /**
         * if percent is less than initialPercent -> decrease
         * if percent is more than initialPercent -> increase
         */

        /**
         * make loop which will gracefully move the slider and handler
         */

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement elementSlider = getClickableElement(locator);
        WebElement elementHandle = getClickableElement(handle);
        String initialPercent = elementSlider.getAttribute("style");
        System.out.println("initialPercent:" + initialPercent);
        /**
         * parse teh string to get width value.
         */
        System.out.println(initialPercent.substring(initialPercent.indexOf("width: ") + 7 , initialPercent.length()));
        /**
         * remove %;
         */

        js.executeScript("arguments[0].setAttribute('style', 'width: 10.0%')", elementSlider);
        js.executeScript("arguments[0].setAttribute('style', 'left: 10.0%')", elementHandle);
        Thread.sleep(1000);
        js.executeScript("arguments[0].setAttribute('style', 'width: 20.0%')", elementSlider);
        js.executeScript("arguments[0].setAttribute('style', 'left: 20.0%')", elementHandle);
        Thread.sleep(1000);
        js.executeScript("arguments[0].setAttribute('style', 'width: 30.0%')", elementSlider);
        js.executeScript("arguments[0].setAttribute('style', 'left: 30.0%')", elementHandle);
        Thread.sleep(1000);
        js.executeScript("arguments[0].setAttribute('style', 'width: 40.0%')", elementSlider);
        js.executeScript("arguments[0].setAttribute('style', 'left: 40.0%')", elementHandle);
        Thread.sleep(1000);
        js.executeScript("arguments[0].setAttribute('style', 'width: 50.0%')", elementSlider);
        js.executeScript("arguments[0].setAttribute('style', 'left: 50.0%')", elementHandle);
        Thread.sleep(1000);
        js.executeScript("arguments[0].setAttribute('style', 'width: 60.0%')", elementSlider);
        js.executeScript("arguments[0].setAttribute('style', 'left: 60.0%')", elementHandle);
        Thread.sleep(10000);
    }

}
