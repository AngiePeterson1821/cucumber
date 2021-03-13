package StepDefinitions;

import authenticgoods.DataTables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DataTablesStepDefs {
    DataTables dataTable = new DataTables();

    @Given("I navigate to Data Tables Page")
    public void iNavigateToDataTablesPage() {
        dataTable.navigateToDataTables();

    }

    @When("I check if I'm on the Data Tables page")
    public void iCheckIfIMOnTheDataTablesPage() {
        Assert.assertEquals(dataTable.checkTablesPage(),"DATA TABLES", "This is not our page");
    }

    @Then("I will check the list of elements in the header")
    public void iWillCheckTheListOfElementsInTheHeader() {
        dataTable.checkHeader();
    }

    @When("I pick {string} elements in Records Per Page dropdown")
    public void iPickElementsInRecordsPerPageDropdown(String arg0) {

    }
}
