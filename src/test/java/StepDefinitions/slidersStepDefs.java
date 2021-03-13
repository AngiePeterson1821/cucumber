package StepDefinitions;

import authenticgoods.Sliders;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class slidersStepDefs {
    Sliders sliders = new Sliders();

    @Given("Browser Navigates to: {string}")
    public void browserNavigatesTo(String arg0) {
        sliders.navigate();
    }

    @When("I go to the sliders page I move the grey horizontal slider")
    public void iGoToTheSlidersPageIMoveTheGreyHorizontalSlider() throws InterruptedException {
        sliders.slide(10);
    }
}
