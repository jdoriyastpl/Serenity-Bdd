package net.serenity.bdd.junit.cucumber.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    // Declare all Page elements

    @FindBy(xpath = "//a[@href='/sign_in']")
    WebElementFacade login_link;

//    @WhenPageOpens
//    public void waitUntilTitleAppears() {
//        login_link.waitUntilVisible();
//    }


    public void navigateToHomePage() {
        open();
        getDriver().manage().window().maximize();


    }


    public void loginClick() {

        login_link.waitUntilClickable();
        login_link.click();

//        waitForAngularRequestsToFinish();
    }
}
