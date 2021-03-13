package StepDefinitions;

import authenticgoods.guiSliders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class guiSlidersStepDefs {
    guiSliders sliders = new guiSliders();

    @Given("I navigate to Sliders page")
    public void iNavigateToSlidersPage() {
        sliders.navigateToSliders();
    }

    @When("Sliders. I navigate to sliders page I check that the header says, {string}")
    public void slidersINavigateToSlidersPageICheckThatTheHeaderSays(String arg0) {
        Assert.assertEquals(sliders.checkSlidersHeader(arg0),"SLIDERS", "Wrong Page");
    }

    @Then("I move slider from {string} to {string}")
    public void iMoveSliderFromTo(String arg0, String arg1) {
        sliders.moveFromTo(arg0, arg1);

    }
}
