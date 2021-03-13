package StepDefinitions;

import authenticgoods.tables;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;

public class tableStepsDef {
    WebDriver driver;
    Wait<WebDriver> wait;
    tables table = new tables();
    

    @Given("Navigate the browser to url: {string}")
    public void navigateTheBrowser(String arg0) {
        table.navigate();
        System.out.println("This is our URL: " + arg0);
    }


    @When("I check if I'm on the tables page")
    public void iCheckIfIMOnTheTablesPage() {
        table.checkPage();
    }

    @Then("I check the list of elements in the Header")
    public void iCheckTheListOfElementsInTheHeader() {
        table.checkHeader();

    }

    @And("I print all the table")
    public void iPrintAllTheTable() {
        table.printTheTable();
    }

    @Then("I select ten from dropdown")
    public void iSelectTenFromDropdown() {
        table.clickTen();
    }

    @Then("I select twenty-five from the dropdown")
    public void iSelectTwentyFiveFromTheDropdown() {
        table.clickTwentyfive();
    }

    @Then("I select fifty elements from the dropdown")
    public void iSelectFiftyElementsFromTheDropdown() {
        table.clickFifty();

    }

    @Then("I select one hundred elements from the dropdown")
    public void iSelectOneHundredElementsFromTheDropdown() {
        table.clickHundo();
    }

    @And("then I search for: {string}")
    public void thenISearchFor(String arg0) {
        table.searchJennifer(arg0);
    }

    @Then("I print the results")
    public void iPrintTheResults() {
        table.printSearchResults();
    }

    @Then("I clear field")
    public void iClearField() {
        table.clearField();
    }

    @And("I search for: {string}")
    public void iSearchFor(String arg0) {
        table.searchEdinburgh(arg0);
    }


    @And("I print the search results")
    public void iPrintTheSearchResults() {
        table.edinburghResults();
    }


    @And("I print the count of rows")
    public void iPrintTheCountOfRows() {
        table.rowCount();
    }

    @Then("I sort by Salary")
    public void iSortBySalary() {
        table.sortSalary();
    }


    @Then("take picture and save it to the pathname: {string}")
    public void takePictureAndSaveItToThePathname(String arg0) throws IOException {
        table.takeScreenShot(arg0);
    }
}

