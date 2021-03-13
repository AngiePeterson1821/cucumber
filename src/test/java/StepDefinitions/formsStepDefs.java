package StepDefinitions;

import authenticgoods.Forms;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formsStepDefs {
    Forms forms = new Forms();

    @When("Forms. Fill out email address field, {string}")
    public void formsFillOutEmailAddressField(String arg0) {
        forms.setEmail(arg0);

    }

    @Given("I navigate to Form Component Page")
    public void iNavigateToFormComponentPage() {
        forms.navigateToForms();
    }

    @Then("Forms. Fill out password field, {string}")
    public void formsFillOutPasswordField(String arg0) {
        forms.setPassword(arg0);
    }

    @Then("I will upload the file:  {string}")
    public void iWillUploadTheFile(String arg0) {
        forms.attachTheFile(arg0);
    }

    @And("I will click submit")
    public void iWillClickSubmit() {
        forms.clickSubmit();
    }


    @When("Forms. I will enter keys in the Success Icon field , {string}")
    public void formsIWillEnterKeysInTheSuccessIconField(String arg0) {
        forms.inputSuccess(arg0);
    }

    @Then("Forms. I enter keys in the Warning, {string}")
    public void formsIEnterKeysInTheWarning(String arg0) {
        forms.inputWarning(arg0);
    }

    @Then("Forms. I will enter keys in the Error, {string}")
    public void formsIWillEnterKeysInTheError(String arg0) {
        forms.inputError(arg0);
    }

    @When("Forms. I will click on the Default select drop down")
    public void formsIWillClickOnTheDefaultSelectDropDown() {
        forms.defaultDrop();
    }

    @Then("Forms. I will click on option three from scroll")
    public void formsIWillClickOnOptionThreeFromScroll() {
        forms.optionThree();
    }

    @When("Forms. I see page I will click option three from Radio option")
    public void formsISeePageIWillClickOptionThreeFromRadioOption() {
        forms.optionThree();
    }

    @Then("Forms. I will click option three in Inline Radio")
    public void formsIWillClickOptionThreeInInlineRadio() {
        forms.inlineRadio();
    }

    @Then("Forms. I will click option three in Check Box")
    public void formsIWillClickOptionThreeInCheckBox() {
        forms.checkBox();
    }

    @And("Forms. I will click option three in Inline Check Box")
    public void formsIWillClickOptionThreeInInlineCheckBox() {
        forms.inlineCheckBox();
    }
}
