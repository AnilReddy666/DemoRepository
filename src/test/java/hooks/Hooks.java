package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.SyncFailedException;

public class Hooks {
    DriverFactory driver = new DriverFactory();
    @Before
    public void beforeScenario() throws IOException {
        System.out.println("Before Scenario");
       driver.createDriver();
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
    }
    @Before("@Smoke")
    public void beforeSmokeScenario() {
        System.out.println("Before Smoke Scenario");
    }
   /* @Before(order = 1)
    public void loginSetup() {
       System.out.println("order1 loginsetup");
    }

    @Before(order = 1)
    public void browserSetup() {
        System.out.println("order2 browsersetupmethod");
    }
    @BeforeStep
    public  void beforeStep() {
        System.out.println("Before step");
    }
    @AfterStep
        public void afterStep(){
            System.out.println("after step");
    }*/
    @After
    public void afterScenario(){
        System.out.println("after Scenario");
        WebDriver webDriver = DriverFactory.getDriver();
       if (webDriver != null){
           webDriver.quit();
          DriverFactory.removeDriver();
       }



        }

    }

