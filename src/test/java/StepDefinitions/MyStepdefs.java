package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterTest;
import pageObjectsGoogle.GoogleHomePage;

public class MyStepdefs extends SDBaseClass {
    @Given("Navigate to the website: {string}")

    public void navigateTo(String arg0) {
    googleHomePage.navigateTo(arg0);
        System.out.println("This is our URL: " + arg0);
    }

    @AfterTest
    public void quit(){

    }
}
