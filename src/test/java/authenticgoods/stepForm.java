package authenticgoods;
import org.openqa.selenium.By;
import org.testng.Assert;


public class stepForm extends CommonStepDefBasePageObject {

        public stepForm() {
        super(); }

        public void setFirst(String value){
                By locator = By.name("firstName");
                getElement(locator).sendKeys(value);
        }
        public void setLast(String value){
                By locator = By.name("lastName");
                getElement(locator).sendKeys(value);
        }
        public void clickSubmit(){
                By locator = By.cssSelector("[class='btn btn-primary ng-scope']");
                getElement(locator).click();
        }
        public void address(String value){
                By locator = By.name("streetAddress");
                getElement(locator).sendKeys(value);
        }
        public void city(String value){
                By locator = By.name("city");
                getElement(locator).sendKeys(value);
        }
        public void state(String value){
                By locator = By.name("state");
                getElement(locator).sendKeys(value);
        }
        public void zip(String value){
                By locator = By.name("postalCode");
                getElement(locator).sendKeys(value);
        }
        public void clickNext(){
                By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/div[2]/form/div/a[2]");
                getElement(locator).click();
        }
        public void checkFirst(String arg0){
                waitForPageLoad();
                By locator = By.xpath("//*[normalize-space()='First Name:']/../p");
                Assert.assertEquals(getElement(locator).getText(), arg0, "First name doesn't match: " + " getting" +
                        "this: " + getElement(locator).getText() + " instead of "+ arg0 );
        }
        public void checkLast(String arg0){
                waitForPageLoad();
                By locator = By.xpath("//*[normalize-space()='Last Name:']/../p");
                Assert.assertEquals(getElement(locator).getText(), arg0, "First name doesn't match: " + " getting" +
                        "this: " + getElement(locator).getText() + " instead of "+ arg0 );
        }

}
