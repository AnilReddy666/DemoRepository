package tests;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ContextTest2 {
    @Test
    public void readContext(ITestContext context){
        String browser = (String)context.getAttribute("browser");
        System.out.println("Browser from ContextTest2: " + browser);
        System.out.println(
                "contxt2 Test - " + Thread.currentThread().getName()
        );

    }

}
