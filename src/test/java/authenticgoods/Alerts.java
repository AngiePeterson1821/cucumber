package authenticgoods;
import authenticgoods.Navigation.Navigation;
import org.openqa.selenium.By;


public class Alerts extends CommonStepDefBasePageObject {
    //Navigate to the pages through the menu navigation

    Navigation navigation = new Navigation();


    public void navigateToAlertPage() {
        navigate();
        navigation.pressOnAlerts();
    }

    public String checkHeader() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[1]/h3");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our header: "+text);
        return text;
    }

    public void fillinTextField(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/div/form/div/div[1]/input");
        getClickableElement(locator).sendKeys(arg0);
        getClickableElement(By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/div/form/div/div[2]/button")).click();
    }
    public void checkNotifBox(){
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/growl-notifications");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our new notification message: "+text);
    }
    public void clearKeys(){
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/div/form/div/div[1]/input");
        getClickableElement(locator).clear();
        getClickableElement(By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/div/form/div/div[2]/button")).click();
    }
    public void getError(){
        By locator = By.xpath("//*[@id='main-content']/div[1]/div/div/div[2]/div/form/div/div[1]/span");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our error message: "+text);
    }




}

