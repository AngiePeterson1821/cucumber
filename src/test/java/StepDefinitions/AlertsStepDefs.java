package StepDefinitions;

import authenticgoods.Alerts;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AlertsStepDefs {

    Alerts alerts = new Alerts();

    @Given("I navigate to alerts and notifications")
    public void iNavigateToAlertsAndNotifications() {
        alerts.navigateToAlertPage();
    }


    @When("I navigate to the Alerts page I check the Header Text")
    public void iNavigateToTheAlertsPageICheckTheHeaderText() {
        Assert.assertEquals(alerts.checkHeader(), "ANGULAR GROWL NOTIFICATIONS", "Wrong Page");
    }

    @After
    public void close() {
        //alerts.driverClose();
    }

    @Then("I send keys to the New Notification dialog box, {string}")
    public void iSendKeysToTheNewNotificationDialogBox(String arg0) {
        alerts.fillinTextField(arg0);
    }

    @And("I check notification box for response")
    public void iCheckNotificationBoxForResponse() {
        alerts.checkNotifBox();
    }

    @Then("I clear field to generate error message")
    public void iClearFieldToGenerateErrorMessage() {
        alerts.clearKeys();
    }

    @And("I check error message")
    public void iCheckErrorMessage() {
        alerts.getError();
    }
}
