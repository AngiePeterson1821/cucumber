package StepDefinitions;

import authenticgoods.FormsDrag;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class formsDragStepDefs {
    FormsDrag drag = new FormsDrag();

    @Given("I navigate to Form Drag and Drop Page")
    public void iNavigateToFormDragAndDropPage() {
        drag.navigateToDragForms();
    }

    @When("FormDrag. I get the the Mask page I verify the header, {string}")
    public void formdragIGetTheTheMaskPageIVerifyTheHeader(String arg0) {
        Assert.assertEquals(drag.checkDragHeader(arg0), "DROPZONE", "Wrong Page");

    }

    @Then("I drag and drop files from OS")
    public void iDragAndDropFilesFromOS() {

    }
}
