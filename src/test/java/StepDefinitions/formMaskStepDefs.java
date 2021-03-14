package StepDefinitions;

import authenticgoods.FormMask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class formMaskStepDefs {
    FormMask mask = new FormMask();

    @Given("FormMask. I navigate to the Form Mask Page")
    public void formmaskINavigateToTheFormMaskPage() {
        mask.navigateToFormMask();

    }

    @When("FormMask. Fill out valid values in date field, {string}")
    public void formmaskFillOutValidValuesInDateField(String arg0) {
        mask.sendDate(arg0);
    }

    @Then("FormMask. Verify the text is as entered, {string}")
    public void formmaskVerifyTheTextIsAsEntered(String arg0) {
        Assert.assertEquals(mask.getDateField(), arg0);

    }
}
