package StepDefinitions;

import authenticgoods.stepForm;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class stepFormDefs {
    WebDriver driver;
    Wait<WebDriver> wait;
    stepForm through = new stepForm();

    @Given("Browser Navigate to: {string}")
    public void browserNavigateTo(String arg0) {

        through.navigate();
        System.out.println("This is our URL: " + arg0);
    }


    @When("I get to the page I will fill out, {string}")
    public void iGetToThePageIWillFillOut(String arg0) {
        through.setFirst(arg0);
    }

    @Then("I will fill out, {string}")
    public void iWillFillOut(String arg0) {
    through.setLast(arg0);
    }

    @Then("I will click next")
    public void iWillClickNext() {
        through.clickSubmit();
    }

    @And("I will wait for {string} seconds")
    public void iWillWaitForSeconds() {
        through.waitForPageLoad();
    }
    @When("I get to the second page I will enter address, {string}")
    public void iGetToTheSecondPageIWillEnterAddress(String arg0) {
        through.address(arg0);
    }

    @And("I will wait for page load")
    public void iWillWaitForPageLoad() {
        through.waitForPageLoad();
    }

    @Then("I will fill out city, {string}")
    public void iWillFillOutCity(String arg0) {
        through.city(arg0);
    }

    @Then("I will fill out state, {string}")
    public void iWillFillOutState(String arg0) {
        through.state(arg0);
    }

    @And("I will fill out zip, {string}")
    public void iWillFillOutZip(String arg0) {
        through.zip(arg0);
    }

    @Then("I will click on next button")
    public void iWillClickOnNextButton() {
        through.clickNext();
    }

    @And("I will wait for page load again")
    public void iWillWaitForPageLoadAgain() {
        through.waitForPageLoad();
    }

    @When("I check First Name, I see {string}")
    public void iCheckFirstNameISee(String arg0) {
        through.checkFirst(arg0);
    }

    @When("I check Last name, I see {string}")
    public void iCheckLastNameISee(String arg0) {
        through.checkLast(arg0);
    }


}