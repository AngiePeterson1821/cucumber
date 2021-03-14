package authenticgoods;

import authenticgoods.Navigation.Navigation;
import org.openqa.selenium.By;

public class FormValidation extends CommonStepDefBasePageObject {

    Navigation navigation = new Navigation();

    public void navigateValidation() {
        navigate();
        navigation.pressOnFormValidation();
    }

    public String checkValidationHeader(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[1]/h3");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our header: " + text);
        return text;
    }

    public void sendName(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/div[1]/input");
        getClickableElement(locator).sendKeys(arg0);
    }

    public void longUsername(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/div[2]/input");
        getClickableElement(locator).sendKeys(arg0);
    }

    public String usernameError(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/div[2]/p[2]");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our Username error: " + text);
        return text;
    }

    public void wrongEmail(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/div[3]/input");
        getClickableElement(locator).sendKeys(arg0);
    }

    public String emailError(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/div[3]/p");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our Email error: " + text);
        return text;
    }

    public void clearUsername() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/div[1]/input");
        getClickableElement(locator).clear();
    }

    public String nameError(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/div[1]/p");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our Name error: " + text);
        return text;
    }

    public void clearUser() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/div[2]/input");
        getClickableElement(locator).clear();
    }

    public void clearEmail() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/div[3]/input");
        getClickableElement(locator).clear();
    }

    public String submitForm(String arg0) {
        getClickableElement(By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/form/button")).click();
        String message = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return message;
    }


}
