package tests;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.RetryAnalyzer;
import utils.TestListener;

@Listeners(TestListener.class)
public class StatusTest {
    @Test
    public void passedTest() {
        System.out.println("This test is passing");

    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void failedTest() {
        System.out.println("This test is failing");
        throw new AssertionError("Intentional failure");
    }

    @Test
    public void skippedTest() {
        throw new SkipException("Intentional skip");
    }
}
