package tests;

import org.testng.annotations.*;

public class AnnotationOrderTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeclass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforemethod");
    }
    @Test
    public void testMethod() {
        System.out.println("test method");
    }
    @Test
    public void testMethod2() {
        System.out.println("test method2");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }
}
