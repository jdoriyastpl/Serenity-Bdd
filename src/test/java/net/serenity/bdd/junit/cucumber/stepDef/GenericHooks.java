package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.SerenitySystemProperties;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class GenericHooks extends GenericDecelaration {


    @Before
    public void beforeTest(Scenario scenario) {
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

//        String baseUrl = variables.getProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL);
        String myCustomProperty = variables.getProperty
                (ThucydidesSystemProperty.WEBDRIVER_DRIVER);
        System.out.println(myCustomProperty);

//        FirefoxProfile myprofile = new ProfilesIni().getProfile("prod2");
//
//        Serenity.useFirefoxProfile(myprofile);


    }
}
