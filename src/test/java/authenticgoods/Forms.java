package authenticgoods;
import authenticgoods.Navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;


public class Forms extends CommonStepDefBasePageObject {

    Navigation navigation = new Navigation();


    public Forms() {
        super();
    }

    public void setEmail(String value){
        By locator = By.id("exampleInputEmail1");
        getElement(locator).sendKeys(value);
    }
    public void setPassword(String value){
        By locator = By.id("exampleInputPassword1");
        getElement(locator).sendKeys(value);
    }
    public void attachTheFile(String arg0){
        By locator = By.id("exampleInputFile");
        String path = System.getProperty("user.dir") + arg0;
        System.out.println(path);
        getElement(locator).sendKeys(path);
    }
    public void clickSubmit(){
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[1]/div[1]/div/div[2]/form/button");
        getElement(locator).click();
    }
    public void inputSuccess(String value){
        By locator = By.id("inputSuccess1");
        getElement(locator).sendKeys(value);
    }
    public void inputWarning(String value){
        By locator = By.id("inputWarning1");
        getElement(locator).sendKeys(value);
    }
    public void inputError(String value){
        By locator = By.id("inputError1");
        getElement(locator).sendKeys(value);
    }
    public void defaultDrop(){
        By locator = By.className("form-control");
        getElement(locator).click();
    }
    public void optionThree(){
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[3]/div[1]/div/div[2]/div[4]/select/option[3]");
        getElement(locator).click();
    }
    public void radioButton(){
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[3]/div[2]/div/div[2]/form/div[1]/div/div[3]/div/ins");
        getElement(locator).click();
    }
    public void inlineRadio(){
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[3]/div[2]/div/div[2]/form/div[2]/div/label[3]/div/ins");
        getElement(locator).click();
    }
    public void checkBox(){
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[3]/div[2]/div/div[2]/form/div[3]/div/div[3]/div/ins");
        getElement(locator).click();
    }
    public void inlineCheckBox(){
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div[3]/div[2]/div/div[2]/form/div[4]/div/label[3]/div/ins");
        getElement(locator).click();
    }
    public void navigateToForms(){
        navigate();
        navigation.pressOnFormComponents();

    }
}