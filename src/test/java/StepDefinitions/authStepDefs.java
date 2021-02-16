package StepDefinitions;

import authenticgoods.Forms;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class authStepDefs {
    WebDriver driver;
    Wait<WebDriver> wait;
    Forms forms = new Forms();

    @Given("Navigate to: {string}")
    public void navigateTo(String arg0) {
        forms.navigate(arg0);
        System.out.println("This is our URL: " + arg0);
    }


    public void WaitFor(){
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
    }
    @After
    public void shutDownBrowser(){
        forms.driverClose();
    }


    @When("I will click on the email address field and enter keys, {string}")
    public void iWillClickOnTheEmailAddressFieldAndEnterKeys(String arg0) {

        forms.setEmail(arg0);
    }


    @Then("I will click on password field and enter keys, {string}")
    public void iWillClickOnPasswordFieldAndEnterKeys(String arg0) {
        forms.setPassword(arg0);
    }

    @Then("I will upload a file:  {string}")
    public void iWillUploadAFile(String arg0) {
        forms.attachTheFile(arg0);
    }

    @And("I will click on the submit button")
    public void iWillClickOnTheSubmitButton() {
        forms.clickSubmit();
    }

    @When("I will click on the Input with Success Icon field and enter keys, {string}")
    public void iWillClickOnTheInputWithSuccessIconFieldAndEnterKeys(String value) {
        forms.inputSuccess(value);
    }

    @Then("I will check the Input with Warning field and enter keys, {string}")
    public void iWillCheckTheInputWithWarningFieldAndEnterKeys(String value) {
        forms.inputWarning(value);
    }

    @Then("I will check the Input with Error field and enter keys, {string}")
    public void iWillCheckTheInputWithErrorFieldAndEnterKeys(String value) {
        forms.inputError(value);
    }


    @When("I will click on the Default select drop down")
    public void iWillClickOnTheDefaultSelectDropDown() {
        forms.defaultDrop();
    }

    @Then("I will click on option three from scroll")
    public void iWillClickOnOptionThreeFromScroll() {
        forms.optionThree();
    }

    @When("I see page I will click option three from Radio option")
    public void iSeePageIWillClickOptionThreeFromRadioOption() {
        forms.radioButton();
    }

    @Then("I will click option three in Inline Radio")
    public void iWillClickOptionThreeInInlineRadio() {
        forms.inlineRadio();
    }

    @Then("I will click option three in Check Box")
    public void iWillClickOptionThreeInCheckBox() {
        forms.checkBox();
    }

    @And("I will click option three in Inline Check Box")
    public void iWillClickOptionThreeInInlineCheckBox() {
        forms.inlineCheckBox();
    }
}
