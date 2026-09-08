package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ConfigReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class DriverFactory {
    ConfigReader configreader = new ConfigReader();
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver createDriver() throws IOException {
        String browser = configreader.getBrowser();
       // WebDriver driver = null;
        if (browser.equals("edge")) {
            driver.set(new EdgeDriver());
        } else if (browser.equals("chrome")) {
            driver.set(new ChromeDriver());
        }
        else if (browser.equals("firefox")){
            driver.set(new FirefoxDriver());
        }

        else {
            System.out.println("no such driver acceptable");
        }
        return driver.get();
    }
    public static WebDriver getDriver() {
        return driver.get();
    }
    public static void removeDriver() {
        driver.remove();
    }

}
