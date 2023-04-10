package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.MyMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _09_JDBCSteps {

    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();

    @Given("Navigate to States page")
    public void navigateToStatesPage() {
        nv.clickMethod(nv.getStatesBtn());
    }

    @When("Send the query {string}")
    public void sendTheQuery(String arg0) {
    }

    @Then("Check if they match with UI")
    public void checkIfTheyMatchWithUI() {
    }
}