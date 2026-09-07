package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunTest {
    @Test
    public void loginTest() {
        System.out.println("Login Test");
        Assert.fail("Login failed");
    }
    @Test(dependsOnMethods = "loginTest", alwaysRun = true)
    public void dashboardTest() {
        System.out.println("Dashboard Test");
    }
}
