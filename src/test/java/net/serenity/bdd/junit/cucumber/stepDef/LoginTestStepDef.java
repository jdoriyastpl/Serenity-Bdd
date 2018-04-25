package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenity.bdd.junit.cucumber.steps.LoginTestSteps;
import net.thucydides.core.annotations.Steps;

public class LoginTestStepDef {

    @Steps
    LoginTestSteps loginTestSteps;


    @Given("^I am on letskodeit home page$")
    public void iAmOnLetskodeitHomePage() throws Throwable {

        loginTestSteps.openHomePage();
    }

    @When("^I click on login$")
    public void iClickOnLogin() throws Throwable {

        loginTestSteps.clickOnLogin();
    }

    @Then("^I should navigate to login page$")
    public void iShouldNavigateToLoginPage() throws Throwable {
        loginTestSteps.verifyLoginPage();
    }

    @When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\" credentials on  login page$")
    public void iEnterValidAndCredentialsOnLoginPage(String email, String password) throws Throwable {
        loginTestSteps.enterLoginDetails(email, password);
    }


    @When("^I enter valid credentials on login page$")
    public void iEnterValidCredentialsOnLoginPage() throws Throwable {

    }

    @And("^I click on Submit button$")
    public void iClickOnSubmitButton() throws Throwable {
        loginTestSteps.submitLoginForm();
    }

    @Then("^I should be login successfully$")
    public void iShouldBeLoginSuccessfully() throws Throwable {
    }

    @When("^I click on logout$")
    public void iClickOnLogout() throws Throwable {
    }

    @Then("^I should get logout successfully$")
    public void iShouldGetLogoutSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

}
