package stepdefinations;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductPage;

import java.util.List;
import java.util.Map;

public class LoginSteps {
    LoginPage loginpage;
    ProductPage productPage;
    WebDriver driver;
    @Given("user is on the login page")
    public void userIsOnLoginPage() {
        driver = DriverFactory.getDriver();
        loginpage = new LoginPage(driver);
    }
    @When("user enters valid username and password")
    public void userEntersValidCredentials(DataTable dataTable) {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
        String username = credentials.get(0).get("username");
        String password = credentials.get(0).get("password");
        loginpage.enterUsername("standard_user");
        loginpage.enterPassword("secret_sauce");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        productPage =  loginpage.clickLoginButton();

    }
    @Then("user should see the Products page")
    public void userShouldSeeProductsPage() {
        Assert.assertEquals(productPage.ProductTitle(), "Products");
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        loginpage.enterUsername("invalid_user");
        loginpage.enterPassword("invalid_password");

    }
    @Then("user should see an error message")
    public void user_should_see_an_error_message() {
        String ActualErrorMessage = loginpage.getLoginErrorMessage();
        Assert.assertTrue(ActualErrorMessage.contains("Username and password do not match"));
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginpage.enterUsername(username);
        loginpage.enterPassword(password);

    }



}
