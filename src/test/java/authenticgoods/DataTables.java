package authenticgoods;

import authenticgoods.Navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DataTables extends CommonStepDefBasePageObject {
    Navigation navigation = new Navigation();
    String header = "Data Tables";
    String[] headerContents = {"Name", "Position", "Office", "Age", "Start date", "Salary"};

    public DataTables() {
        super();
    }

    public void navigateToDataTables() {
        navigate();
        navigation.pressOnDataTables();
    }

    public String checkTablesPage() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[1]/h3");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our page: " + text);
        return text;
    }

    public void checkHeader() {
        By locator = By.cssSelector("[role = 'row'] > th");
        /**
         * we build the first list base on the values we read from teh webpage
         */
        List<String> actualData = new ArrayList<>();
        for (int i = 0; i < getElements(locator).size(); i++) {
            actualData.add(getElements(locator).get(i).getText());
        }
        /**
         * this is our reference data set. against which we are going to assert if whatever
         * we got form teh webpage is what we were expecting.
         */
        /**
         * Cast array to List
         */

        List testData = Arrays.asList(headerContents);
        /**
         * And this is were the test happens
         */
        Assert.assertEquals(actualData, testData);
    }

    public void pickPaginationOptions(String numberOfElements) {
        By locator = By.cssSelector("[name='example_length']");
        Select selector = new Select(getElement(locator));
        selector.selectByValue(numberOfElements);
        waitForPageLoad();
    }
}
