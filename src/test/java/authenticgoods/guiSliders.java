package authenticgoods;

import authenticgoods.Navigation.Navigation;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class guiSliders extends CommonStepDefBasePageObject {

    Navigation navigation = new Navigation();

    public guiSliders() {
        super();
    }

    public void navigateToSliders() {
        navigate();
        navigation.pressOnSliders();
    }

    public String checkSlidersHeader(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div[1]/div/div/div[1]/h3");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our header: " + text);
        return text;
    }

    public void slide(int percent) throws InterruptedException {
        By locator = By.xpath("//div[@class='slider slider-default']//div[@class='slider slider-vertical']//div[@class='slider-selection']");
        By handle = By.xpath("//div[@class='slider slider-default']//div[@class='slider slider-vertical']//div[@class='slider-handle round']");
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
        System.out.println(initialPercent.substring(initialPercent.indexOf("width: ") + 7));
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

    public void moveFromTo(String arg0, String arg1) {
        By locator = By.xpath("//div[@class='slider slider-default']//div[@class='slider slider-vertical']//div[@class='slider-selection']");
        By handle = By.xpath("//div[@class='slider slider-default']//div[@class='slider slider-vertical']//div[@class='slider-handle round']");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement elementSlider = getClickableElement(locator);
        WebElement elementHandle = getClickableElement(handle);
        String argumentsValue = elementSlider.getAttribute("style");

        String initValue = StringUtils.substringBefore(argumentsValue.substring(argumentsValue.indexOf("width: ") + 6), "%;");
        /*
        if init value is more than target value -> this is what we got at the start.
        If init value id equal to target -> nothing supposed to be done
        If init value is less than target -> we should decrease , not increase the value which we sending to arguments
        if init value doesn't match starting value -> we should adjust it. and make this adjustment smooth. as usual.
         */
        double dArg0 = Double.parseDouble(arg0);
        double dArg1 = Double.parseDouble(arg1);
        double step = 10;
//        for (double i=dArg0; i<dArg1 ; i=i+step){
//            dArg0 = dArg0 + step;
//            js.executeScript("arguments[0].setAttribute('style', 'top: " + dArg0 + "%')", elementSlider);
//            js.executeScript("arguments[0].setAttribute('style', 'top: " + dArg0 + "%')", elementHandle);
//            System.out.println(dArg0);
//        }
        /**
         * if we need to decrease the value this is the loop for that
         */
        for (double i = dArg0; i > dArg1; i = i - step) {
            dArg0 = dArg0 - step;
            js.executeScript("arguments[0].setAttribute('style', 'top: " + dArg0 + "%')", elementSlider);
            js.executeScript("arguments[0].setAttribute('style', 'top: " + dArg0 + "%')", elementHandle);
            System.out.println(dArg0);
        }

    }
}
