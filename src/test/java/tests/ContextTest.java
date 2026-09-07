package tests;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ContextTest {
    @Test
    public void testContext(ITestContext context) {
        context.setAttribute("browser", "chrome");
        String browser = context.getAttribute("browser").toString();
        System.out.println("Browser from contextest1: " + browser);
        System.out.println(
                "context Test - " + Thread.currentThread().getName()
        );
    }



}
