package tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import utils.TestDataProvider;

public class DataProviderTest extends BaseTest {


        @Test(dataProvider = "loginData" ,
                dataProviderClass = TestDataProvider.class
        )
        public void LoginTest(String username , String password, String ExpectedResult){
            LoginPage loginPage = new LoginPage(driver);
            System.out.println("Username: " + username);
            System.out.println("Password:" + password);
            System.out.println("ExpectedResult: "+ ExpectedResult);
            loginPage.enterUsername(username);
            loginPage.enterPassword(password);
            ProductPage page = loginPage.clickLoginButton();
           // loginPage.clickLoginButton();
            if (ExpectedResult.equals("success")) {
                String actual = page.ProductTitle();
                Assert.assertEquals(actual, "Products");

                System.out.println("Expected successful login");

            } else {
                String actualerror = loginPage.getLoginErrorMessage();
                Assert.assertEquals(actualerror, "Epic sadface: Sorry, this user has been locked out.");

                System.out.println("Expected login failure");

            }

        }
    }


