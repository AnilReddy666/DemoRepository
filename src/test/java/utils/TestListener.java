package utils;

import factory.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class TestListener implements ITestListener {
    @Override
    public void onStart(org.testng.ITestContext context) {
        ExtentReportManager.setuPReport();
    }
    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Teststarted : " + result.getName());
        System.out.println("Test Status: " + result.getStatus());
        ExtentReportManager.createTest(result.getName());
    //    ExtentReportManager.getTest().pass("Test Passed");

    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Testsucess : " + result.getName());
        System.out.println("Test Status: " + result.getStatus());
        ExtentReportManager.getTest().pass("Test Passed");

    }
    @Override
    public void onTestFailure(ITestResult result)  {
        //WebDriver driver = (WebDriver)result.getTestContext().getAttribute("driver");
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");

        if (driver != null) {
            try {
                String screenshot = ScreenshotUtils.takeScreenshot(driver, result.getName());
                ExtentReportManager.getTest().addScreenCaptureFromPath(screenshot);
            } catch (Exception e) {
                System.out.println("Screenshot could not be taken: " + e.getMessage());
            }

        } else {
            System.out.println("Driver is null. Screenshot cannot be taken.");
        }
        ExtentReportManager.getTest().fail("failed Test");
        System.out.println("TestFailure : " + result.getName());
        System.out.println("Browser: "+ result.getThrowable());
        System.out.println("Failure Listned");
        System.out.println("Test Method: " + result.getName());
        System.out.println("Test Status: " + result.getStatus());
        ExtentReportManager.getTest().fail(result.getThrowable());

    }


@Override
public void onTestSkipped(ITestResult result){
    System.out.println("TestSkipped : " + result.getName());
    System.out.println("Test Status: " + result.getStatus());
}
    @Override
    public void onFinish(org.testng.ITestContext context) {
        ExtentReportManager.flushReport();
    }

}
