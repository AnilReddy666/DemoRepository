package Utility;

import io.cucumber.java.After;
//import org.junit.Before;
import io.cucumber.java.Before;

public class Hooks {
    public static BrowserDriver driver;
    @Before

    public void setup(){
        driver = new BrowserDriver();

    }
@After
    public void teardown(){
        driver.close();
}



}
