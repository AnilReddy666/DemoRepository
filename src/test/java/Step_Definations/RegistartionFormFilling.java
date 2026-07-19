package Step_Definations;

import Pages.RegistrationDetailsFormPage;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Utility.BrowserDriver.driver;
import static org.junit.Assert.assertEquals;

public class RegistartionFormFilling {
    @When("the user clicks on registration button")
    public void the_user_clicks_on_registration_button() {
        RegistrationPage.Registration_button_click();

    }
    @When(": the user enters the Registration details")
    public void the_user_enters_the_registration_details() {
        RegistrationDetailsFormPage.gender_selection();
        RegistrationDetailsFormPage.first_name();
        RegistrationDetailsFormPage.last_name();
        RegistrationDetailsFormPage.email_id();
        RegistrationDetailsFormPage.contact_number();
        RegistrationDetailsFormPage.Password();
        RegistrationDetailsFormPage.user_name();


    }
    @And(": the user clicks on submit button")
    public void the_user_clicks_on_submit_button() {
        RegistrationDetailsFormPage.submit_button();

    }
    @Then(": the registration should be successfull")
    public void the_registration_should_be_successfull() {
     String actualmessage = RegistrationDetailsFormPage.Registration_successfull_message();
     assertEquals(actualmessage,"User Registered Successfully !!!");
     System.out.println("Registration sucessfull");

    }


}
