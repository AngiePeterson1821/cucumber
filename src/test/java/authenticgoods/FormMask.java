package authenticgoods;

import authenticgoods.Navigation.Navigation;
import org.openqa.selenium.By;

public class FormMask extends CommonStepDefBasePageObject   {
    Navigation navigate = new Navigation();

    public void navigateToFormMask(){
        navigate();
        navigate.pressOnFormMask();
    }

    public void sendDate(String arg0){
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/form/div[1]/div/input");
        getClickableElement(locator).click();
        getClickableElement(locator).sendKeys(arg0);
    }

    public String getDateField() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/form/div[1]/div/input");
        return getClickableElement(locator).getAttribute("value");

    }
}
