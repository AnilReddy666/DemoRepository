package base;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;
    DriverFactory factory = new DriverFactory();

    @BeforeMethod
    public void setup() throws IOException {
        factory.createDriver();
        driver = DriverFactory.getDriver();
        org.testng.ITestResult result =
                org.testng.Reporter.getCurrentTestResult();

        result.getTestContext().setAttribute("driver", driver);
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        if (driver != null) {
            driver.quit();
            DriverFactory.removeDriver();
        }


    }
}
