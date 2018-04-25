package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.pages.HomePage;
import net.serenity.bdd.junit.cucumber.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTestSteps extends ScenarioSteps {

    HomePage homePage;

    LoginPage loginPage;

    @Step
    public void openHomePage() {

        homePage.navigateToHomePage();
        homePage.loginClick();
    }


    @Step
    public void clickOnLogin() {
        homePage.loginClick();
    }

    @Step
    public void verifyLoginPage() {
        assertThat(loginPage.getDriver().getPageSource().toString())
                .contains("Log In to Let's Kode It");
    }

    @Step
    public void enterLoginDetails(String emailAddress, String password) {
        loginPage.typeEmailAndPassword(emailAddress, password);
    }

    @Step
    public void submitLoginForm() {
        loginPage.clickLoginBtn();
    }
}
