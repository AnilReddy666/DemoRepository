package tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

import pages.ProductPage;
import utils.RetryAnalyzer;
import utils.TestDataReader;
import utils.TestListener;

import java.io.IOException;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {
    LoginPage loginPage;
    TestDataReader reader = new TestDataReader();


    @Test
    public void loginTest() throws IOException {
        loginPage = new LoginPage( driver);
        String username = reader.getUsername();
        String password = reader.getPassword();
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        //loginPage.clickLoginButton();
        ProductPage page = loginPage.clickLoginButton();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        String actual = page.ProductTitle();
        String expected = "products";
        Assert.assertEquals(actual,expected);
        String actualurl = driver.getCurrentUrl();
        Assert.assertTrue(actualurl.contains("inventory.html"));
       /* SoftAssert soft = new SoftAssert();
        System.out.println("Step 1");

        soft.assertEquals("Products", "Wrong");

        System.out.println("Step 2");

        soft.assertEquals("Swag Labs", "Swag Labs");

        System.out.println("Step 3");
        soft.assertAll();*/
    }
}
