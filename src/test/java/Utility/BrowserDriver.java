package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public ChromeOptions options;
    public BrowserDriver(){
       // driver = driver;
        driver = new ChromeDriver();
        driver.manage().window();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

    }
    public void close(){
        driver.close();
    }

}
