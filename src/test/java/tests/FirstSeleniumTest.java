package tests;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

import java.io.IOException;

public class FirstSeleniumTest {
    public static void main (String[] args)throws IOException {
        ConfigReader configreader = new ConfigReader();
        System.out.println(configreader.getBrowser());
       /*DriverFactory calldriver = new DriverFactory();
       WebDriver driver = calldriver.createDriver();
    System.out.println(calldriver.getBrowser());

    driver.get("https://www.saucedemo.com/");

       System.out.println(driver.getTitle());

        driver.quit();*/
    }
}
