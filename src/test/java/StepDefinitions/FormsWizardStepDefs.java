package StepDefinitions;

import authenticgoods.FormsWizard;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class FormsWizardStepDefs {
    FormsWizard wizard = new FormsWizard();

//    @After
//    public void close(){
//        wizard.driverClose();
//    }

    @When("I navigate to the Form Wizard")
    public void iNavigateToTheFormWizard() {
        wizard.navigateWizard();
    }

    @Then("I verify I am on the Form Wizard Page")
    public void iVerifyIAmOnTheFormWizardPage() {
        Assert.assertEquals(wizard.checkHeader(), "FORM WIZARD", "Wrong Page");
    }


    @Then("I will type in {string}")
    public void iWillTypeIn(String arg0) {
        wizard.setFirst(arg0);
    }

    @Then("will fill out, {string}")
    public void willFillOut(String arg0) {
        wizard.setLast(arg0);
    }

    @Then("will click next")
    public void willClickNext() {
        wizard.clickSubmit();
    }

    @When("get to the second page I will enter {string}")
    public void getToTheSecondPageIWillEnter(String arg0) {
        wizard.address(arg0);
    }

    @Then("I will fill out {string}")
    public void iWillFillOut(String arg0) {
        wizard.city(arg0);
    }

    @Then("I will fill out the {string}")
    public void iWillFillOutThe(String arg0) {
        wizard.state(arg0);
    }

    @And("will fill out the {string}")
    public void willFillOutThe(String arg0) {
        wizard.zip(arg0);
    }

    @Then("I will click on the next button")
    public void iWillClickOnTheNextButton() {
        wizard.clickNext();
    }

    @And("I will wait for the page to load")
    public void iWillWaitForThePageToLoad() {
        wizard.waitForPageLoad();
    }

    @And("I will wait for the page to load again")
    public void iWillWaitForThePageToLoadAgain() {
        wizard.waitForPageLoad();
    }
}
