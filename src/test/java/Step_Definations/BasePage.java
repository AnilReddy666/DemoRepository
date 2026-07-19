package Step_Definations;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.HomePage.click_menu_bar;
import static Pages.HomePage.validation_text;
import static org.junit.Assert.assertEquals;

public class BasePage {
    @Given(": user is in login page")
    public void user_is_in_login_page() throws InterruptedException {
        HomePage.click_menu_bar();
        System.out.println("menu bar executed successfully");
        Thread.sleep(4000);
        HomePage.click_signin_bar();
        System.out.println("signin bar executed successfully");
    }
    @When(": the user enters the login details")
    public void the_user_enters_the_login_details() {
     HomePage.enter_user_name();
     HomePage.entter_password();
     HomePage.click_on_login_button();
    }
    @Then(": the user should be able to view the product catageory")
    public void the_user_should_be_able_to_view_the_product_catageory() {
    String Login_success_confirmation_message  =   validation_text();
      assertEquals(Login_success_confirmation_message,"Ace Online Shoe Portal");

    }




}
