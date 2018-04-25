package net.serenity.bdd.junit.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends GenericPageObject {
    //Declare your page elements

    @FindBy(id = "user_email")
    WebElementFacade emailAddressField;


    @FindBy(id = "user_password")
    WebElementFacade passwordField;

    @FindBy(xpath = "//*[@id='new_user']/div[3]/input")
    WebElementFacade loginBtn;


    public void typeEmailAndPassword(String emailAddress, String
            password) {
        emailAddressField.waitUntilVisible();
        emailAddressField.typeAndTab(emailAddress);
        passwordField.waitUntilVisible();
        passwordField.type(password);

    }

    public void clickLoginBtn(){
        loginBtn.waitUntilClickable();
        loginBtn.click();
    }

}
