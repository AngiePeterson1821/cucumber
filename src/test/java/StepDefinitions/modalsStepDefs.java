package StepDefinitions;

import authenticgoods.Modals;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class modalsStepDefs {
    Modals modals = new Modals();

    @When("Modals. I press on Default Modal it opens")
    public void modalsIPressOnDefaultModalItOpens() {
        modals.defaultModal();
    }

    @After
    public void closeBrowser(){
        modals.driverClose();
    }

    @Then("Modals. I verify modal text says, {string}")
    public void modalsIVerifyModalTextSays(String arg0) {
        Assert.assertEquals(modals.getDefaultText(arg0),"One fine body…", "Wrong Page");
    }

    @Then("Modals. I close modal")
    public void modalsICloseModal() {
        modals.closeModal();
    }

    @Then("Modals. I open Form Modal")
    public void modalsIOpenFormModal() {
        modals.formModal();
    }

    @Then("Modals. I verify Form Modal says, {string}")
    public void modalsIVerifyFormModalSays(String arg0) {
        Assert.assertEquals(modals.formText(arg0),"Form Modal", "Wrong Page");
    }

    @And("Modals. I fill out email field, {string}")
    public void modalsIFillOutEmailField(String arg0) {
        modals.email(arg0);
    }

    @Then("Modals. I enter my password, {string}")
    public void modalsIEnterMyPassword(String arg0) {
        modals.password(arg0);
    }

    @And("Modals. I click sign in")
    public void modalsIClickSignIn() {
        modals.signIn();
    }

    @Then("Modals. I click on scrolling modal")
    public void modalsIClickOnScrollingModal() {
        modals.scrollModal();
    }

    @Then("Modals. I verify the modal text says, {string}")
    public void modalsIVerifyTheModalTextSays(String arg0) {
        Assert.assertEquals(modals.scrollText(arg0),"Scrolling Modal", "Wrong Page");
    }

    @And("Modals. I close the modal")
    public void modalsICloseTheModal() {
        modals.closeScroll();
    }

    @Then("Modals. I click leftPop")
    public void modalsIClickLeftPop() {
        modals.popLeft();
    }

    @Then("Modals. I check left pop dialog box says, {string}")
    public void modalsICheckLeftPopDialogBoxSays(String arg0) {
        Assert.assertEquals(modals.leftDialog(arg0),"Popover on left", "Wrong Page");
    }

    @Then("Modals. I click on topPop")
    public void modalsIClickOnTopPop() {
        modals.topPop();
    }

    @And("Modals. I click topPop dialog box and verify it says, {string}")
    public void modalsIClickTopPopDialogBoxAndVerifyItSays(String arg0) {
        Assert.assertEquals(modals.topDialog(arg0),"Popover on top", "Wrong Page");
    }

    @Then("Modals. I click on bottomPop")
    public void modalsIClickOnBottomPop() {
        modals.bottomPop();
    }

    @And("Modals. I verify the bottomPop dialog box says, {string}")
    public void modalsIVerifyTheBottomPopDialogBoxSays(String arg0) {
        Assert.assertEquals(modals.bottomDialog(arg0),"Popover on bottom", "Wrong Page");
    }

    @Then("Modals. I click on rightPop")
    public void modalsIClickOnRightPop() {
        modals.rightPop();
    }

    @And("Modals. I verify the rightPop dialog box says, {string}")
    public void modalsIVerifyTheRightPopDialogBoxSays(String arg0) {
        Assert.assertEquals(modals.rightDialog(arg0),"Popover on right", "Wrong Page");
    }

    @When("Modals. I verify modals header, {string}")
    public void modalsIVerifyModalsHeader(String arg0) {
        Assert.assertEquals(modals.checkModalsHeader(arg0),"Modals & Popups", "Wrong Page");
    }

    @Given("I navigate to the Modals\\/Popups Page")
    public void iNavigateToTheModalsPopupsPage() {
        modals.navigateToModals();
    }
}
