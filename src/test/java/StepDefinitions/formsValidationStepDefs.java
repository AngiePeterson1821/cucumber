package StepDefinitions;

import authenticgoods.FormValidation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class formsValidationStepDefs {
    FormValidation validate = new FormValidation();

    @Given("FormValidation. I navigate to Form Validation Page")
    public void formvalidationINavigateToFormValidationPage() {
        validate.navigateValidation();
    }


    @When("FormValidation. I navigate to the Form Validation page I verify the header, {string}")
    public void formvalidationINavigateToTheFormValidationPageIVerifyTheHeader(String arg0) {
        Assert.assertEquals(validate.checkValidationHeader(arg0), "FORM VALIDATIONS", "Wrong Header");
    }

    @Then("FormValidation. I fill out name field, {string}")
    public void formvalidationIFillOutNameField(String arg0) {
        validate.sendName(arg0);
    }

    @Then("FormValidation. I will send a username that is too long, {string}")
    public void formvalidationIWillSendAUsernameThatIsTooLong(String arg0) {
        validate.longUsername(arg0);
    }

    @And("FormValidation. I will verify the error message, {string}")
    public void formvalidationIWillVerifyTheErrorMessage(String arg0) {
        Assert.assertEquals(validate.usernameError(arg0), "Username is too long.", "Wrong Error");
    }

    @Then("FormValidation. I will send an incorrectly formatted email, {string}")
    public void formvalidationIWillSendAnIncorrectlyFormattedEmail(String arg0) {
        validate.wrongEmail(arg0);
    }

    @And("FormValidation. I will verify the email error message, {string}")
    public void formvalidationIWillVerifyTheEmailErrorMessage(String arg0) {
        Assert.assertEquals(validate.emailError(arg0), "Enter a valid email.", "Wrong Error");
    }

    @Then("FormValidation. I will clear my username")
    public void formvalidationIWillClearMyUsername() {
        validate.clearUsername();
    }

    @And("FormValidation. I will check username error, {string}")
    public void formvalidationIWillCheckUsernameError(String arg0) {
        Assert.assertEquals(validate.nameError(arg0), "You name is required.", "Wrong Error");
    }

    @Then("FormValidation. I will send correct name, {string}")
    public void formvalidationIWillSendCorrectName(String arg0) {
        validate.sendName(arg0);
    }

    @And("FormValidation. I will set the correct username, {string}")
    public void formvalidationIWillSetTheCorrectUsername(String arg0) {
        validate.clearUser();
        validate.longUsername(arg0);
    }

    @Then("FormValidation. I will enter in correct email, {string}")
    public void formvalidationIWillEnterInCorrectEmail(String arg0) {
        validate.clearEmail();
        validate.wrongEmail(arg0);
    }

    @And("FormValidation. I will click submit and check modal message, {string}")
    public void formvalidationIWillClickSubmitAndCheckModalMessage(String arg0) {
        Assert.assertEquals(validate.submitForm(arg0), "our form is amazing", "Wrong Error");
    }
}
