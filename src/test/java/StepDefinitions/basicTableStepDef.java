package StepDefinitions;

import authenticgoods.basicTables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class basicTableStepDef {
    basicTables tables = new basicTables();

    @Given("Basic Tables. Navigate to Basic Tables")
    public void basicTablesNavigateToBasicTables() {
        tables.navToBasicTables();
    }

    @When("Basic Tables. I check if I'm on the Basic Tables page")
    public void basicTablesICheckIfIMOnTheBasicTablesPage() {
        tables.checkIfOnTheCorrectPage();
    }

    @Then("Basic Tables. Verify the content of the table")
    public void basicTablesVerifyTheContentOfTheTable() {

    }
}
