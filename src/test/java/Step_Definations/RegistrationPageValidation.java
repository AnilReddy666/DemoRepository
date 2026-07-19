package Step_Definations;

import Pages.RegistrationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Utility.BrowserDriver.driver;
import static org.junit.Assert.assertEquals;

public class RegistrationPageValidation {
    @When(": the user clicks on registration button")
    public void the_user_clicks_on_registration_button() {
        RegistrationPage.Registration_button_click();
        System.out.println(driver.getCurrentUrl());

    }
    @Then(": the user should be able to view the registration page")
    public void the_user_should_be_able_to_view_the_registration_page() {
     String  Registratuon_page_validation =
     RegistrationPage.Registration_page_entry_validation();
       assertEquals(Registratuon_page_validation,"User Registration Page");
       System.out.println(Registratuon_page_validation +" avnu"+"user on registration page");
    }
}
