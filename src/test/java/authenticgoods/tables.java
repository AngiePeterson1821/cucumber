package authenticgoods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class tables extends CommonStepDefBasePageObject {
    String header = "Data Tables";
    String[] headerContents = {"Name", "Position", "Office", "Age", "Start date", "Salary"};

    public tables() {
        super();
    }

    public void checkPage() {
        By locator = By.cssSelector("h1");
        Assert.assertEquals(getClickableElement(locator).getText(), header);

    }

    public void checkHeader() {
        By locator = By.cssSelector("[role = 'row'] > th");
        /**
         * we build the first list base on the values we read from teh webpage
         */
        List<String> actualData = new ArrayList<String>();
        for (int i = 0; i < getElements(locator).size(); i++) {
            actualData.add(getElements(locator).get(i).getText());
            System.out.println(getElements(locator).get(i).getText());
        }
        /**
         * this is our reference data set. agains which we are going to assert if whatever
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

    public void printTheTable() {
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        int rows = getElements(tableLocator).size();
        Map<Integer, String> tableContent = new LinkedHashMap<>();

        for (int i = 1; i <= rows; i++) {
            for (WebElement element : getElements(tableLocator)) {
                tableContent.put(i, element.getText());
            }
        }
        System.out.println(tableContent);

    }

    public void clickTen() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/div/div[1]/div[1]/div/label/select/option[1]");
        getClickableElement(locator).click();
    }

    public void clickTwentyfive() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/div/div[1]/div[1]/div/label/select/option[2]");
        getClickableElement(locator).click();
    }

    public void clickFifty() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/div/div[1]/div[1]/div/label/select/option[3]");
        getClickableElement(locator).click();
    }

    public void clickHundo() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/div/div[1]/div[1]/div/label/select/option[4]");
        getClickableElement(locator).click();
    }

    public void searchJennifer(String value) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/div/div[1]/div[2]/div/label/input");
        getClickableElement(locator).sendKeys(value);
    }

    public void printSearchResults() {
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        int rows = getElements(tableLocator).size();
        Map<Integer, String> tableContent = new LinkedHashMap<>();

        for (int i = 1; i <= rows; i++) {
            for (WebElement element : getElements(tableLocator)) {
                tableContent.put(i, element.getText());
            }
        }
        System.out.println(tableContent);

    }

    public void searchEdinburgh(String value) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/div/div[1]/div[2]/div/label/input");
        getClickableElement(locator).sendKeys(value);
    }

    public void clearField() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/div/div[1]/div[2]/div/label/input");
        getClickableElement(locator).clear();
    }

    public void edinburghResults() {
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        int rows = getElements(tableLocator).size();
        Map<Integer, String> tableContent = new LinkedHashMap<>();

        for (int i = 1; i <= rows; i++) {
            for (WebElement element : getElements(tableLocator)) {
                tableContent.put(i, element.getText());
            }
        }
        System.out.println(tableContent);

    }

    public void rowCount() {
        List<WebElement> rows = getElements(By.cssSelector("[id='example'] >tbody >tr"));
        System.out.println(rows.size());
    }

    public void sortSalary() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/div/table/thead/tr/th[6]");
        getClickableElement(locator).click();
    }

    public void takeScreenShot(String pathname) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File(pathname));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


