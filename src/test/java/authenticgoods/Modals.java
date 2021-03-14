package authenticgoods;

import authenticgoods.Navigation.Navigation;
import org.openqa.selenium.By;


public class Modals extends CommonStepDefBasePageObject {
    Navigation navigate = new Navigation();

    public Modals() {
        super();
    }

    public void navigateToModals() {
        navigate();
        navigate.pressOnModals();
    }

    public void defaultModal() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/div/div[1]/button");
        getClickableElement(locator).click();
    }

    public String getDefaultText(String arg0) {
        By locator = By.xpath("/html/body/div[4]/div/div/div[2]/p");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our Name error: " + text);
        return text;

    }

    public void closeModal() {
        By locator = By.xpath("/html/body/div[4]/div/div/div[3]/button[1]");
        getClickableElement(locator).click();
    }

    public void formModal() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/div/div[2]/button");
        getClickableElement(locator).click();
    }

    public void email(String arg0) {
        By locator = By.xpath("//*[@id=\"inputEmail3\"]");
        getClickableElement(locator).sendKeys(arg0);
    }

    public void password(String arg0) {
        By locator = By.xpath("//*[@id=\"inputPassword3\"]");
        getClickableElement(locator).sendKeys(arg0);
    }

    public void signIn() {
        By locator = By.xpath("/html/body/div[4]/div/div/div[3]/button[2]");
        getClickableElement(locator).click();
    }

    public String formText(String arg0) {
        By locator = By.xpath("//*[@id=\"myModalLabel\"]");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our Form Modal dialog: " + text);
        return text;


    }

    public void scrollModal() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div/div/div[2]/div/div[3]/button");
        getClickableElement(locator).click();
    }

    public String scrollText(String arg0) {
        By locator = By.xpath("//*[@id='myModalLabel']");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our Scroll Modal dialog: " + text);
        return text;

    }

    public void closeScroll() {
        By locator = By.xpath("/html/body/div[4]/div/div/div[3]/button[2]");
        getClickableElement(locator).click();
    }

    public void popLeft() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[2]/div[1]/div/div[2]/button[1]");
        getClickableElement(locator).click();
    }

    public String leftDialog(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[2]/div[1]/div/div[2]/div/div[2]/div");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our leftPop dialog: " + text);
        return text;

    }

    public void topPop() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[2]/div[1]/div/div[2]/button[2]");
        getClickableElement(locator).click();
    }

    public String topDialog(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[2]/div[1]/div/div[2]/button[2]");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our topPop dialog: " + text);
        return text;
    }

    public void bottomPop() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[2]/div[1]/div/div[2]/button[3]");
        getClickableElement(locator);

    }

    public String bottomDialog(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[2]/div[1]/div/div[2]/button[3]");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our bottomPop dialog: " + text);
        return text;
    }

    public void rightPop() {
        By locator = By.xpath("//*[@id='main-content']/div[2]/div[1]/div/div[2]/button[4]");
        getClickableElement(locator).click();
    }

    public String rightDialog(String arg0) {
        By locator = By.xpath("//*[@id='main-content']/div[2]/div[1]/div/div[2]/button[4]");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our rightPop dialog: " + text);
        return text;
    }

    public String checkModalsHeader(String arg0) {
        By locator = By.xpath("//*[@id='main-wrapper']/aside/nav/ul/li[2]/ul/li[3]/a");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our Modals header: " + text);
        return text;
    }


}
