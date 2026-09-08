package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
    @Parameters ("browser")
    @Test
    public void testBrowser(String Browser)
    {
        System.out.println("Browser : " + Browser);
        System.out.println(
                "parameter Test - " + Thread.currentThread().getName()
        );
    }
}
