package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductPage;

import java.util.List;
import java.util.Map;

//import static factory.DriverFactory.driver;
import static factory.DriverFactory.getDriver;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class DataTableSteps {
    /*  @When("user provides login details")
      public void user_provides_the_login_details(DataTable dataTable) {
         /* List<String> usernames = dataTable.asList(String.class);
          for(String username : usernames){
              System.out.println("username = " +username);*/
      /*  System.out.println("METHOD IS EXECUTING");
       Map<String, String> logindata = dataTable.asMap(String.class, String.class);
       System.out.println(logindata.get("username"));
        System.out.println(logindata.get("password"));*/
      /*  System.out.println("MY METHOD IS EXECUTING");
        List<Map<String, String>> username = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> users : username) {
            System.out.println("username = " + users.get("username"));
            System.out.println("password =" + users.get("password"));*/
      /*  DataTable transpose = dataTable.transpose();
        List<List<String>> data = transpose.asLists();
        for (List<String> row : data) {
            System.out.println(row);
        List<String> headers = data.get(0);
        List<String> values = data.get(1);

        System.out.println("username = " + values.get(0));
        System.out.println("password = " + values.get(1));*/
    @Given("user is on the SauceDemo login page")
    public void user_is_on_the_sauce_demo_login_page() {
        System.out.println("User is on SauceDemo login page");
        String currentUrl = getDriver().getCurrentUrl();
        LoginPage loginPage = new LoginPage(getDriver());
        assertTrue(loginPage.isLoginPageDisplayed());
    }
    @When("user provides the following login details")
    public void user_provides_the_following_login_details(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists();

        /*for (List<String> row : data) {
            System.out.println(row);*/
        String username = data.get(0).get(1);
        String password = data.get(1).get(1);

        System.out.println("Username = " + username);
        System.out.println("Password = " + password);
        // getDriver();
        LoginPage loginpage = new LoginPage(getDriver());
        loginpage.enterUsername(username);
        loginpage.enterPassword(password);
        loginpage.clickLoginButton();
    }

    @Then("user should see the products page")
    public void user_should_see_the_products_page() {

        ProductPage productPage = new ProductPage(getDriver());

        String title = productPage.ProductTitle();

        System.out.println("Product title = " + title);

        assertEquals("Products", title);
    }
}


