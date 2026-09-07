package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportManager {
    private static ExtentReports extentReports;
    private static ExtentSparkReporter sparkReporter;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    public static void setuPReport(){
        sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }
    public static void createTest(String testName){
       extentTest.set(extentReports.createTest(testName));
    }
    public static ExtentTest getTest() {
        return extentTest.get();
    }
    public static  void flushReport(){
        extentReports.flush();
    }
}
