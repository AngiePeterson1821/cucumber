package authenticgoods;
import StepDefinitions.AuthBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import utils.LocalDriver;


public class Forms extends AuthBaseClass {
    WebDriver webDriver;
    FluentWait<WebDriver> wait;


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
        getElement(locator).sendKeys(arg0);
    }
    public void clickSubmit(){
        By locator = By.className("btn btn-primary");
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


}