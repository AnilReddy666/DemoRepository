package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
  /* @Test()
    public void testC() {
        System.out.println("Test C");
       Assert.fail("Loginfailed");
    }

    @Test(dependsOnMethods = "testC")
    public void testA() {
        System.out.println("Test A");
    }

    @Test(dependsOnMethods = "testA")
    public void testB() {
        System.out.println("Test B");*/
  @Test(groups = "smoke")
  public void loginTest() {
      System.out.println("Login Test");
      System.out.println(
              "login Test - " + Thread.currentThread().getName()
      );
  }
    @Test(groups = "smoke")
    public void searchTest() {
        System.out.println("Search Test");
        System.out.println(
                "search Test - " + Thread.currentThread().getName()
        );
    }
    @Test(groups = "regression")
    public void cartTest() {
        System.out.println("Cart Test");
        System.out.println(
                "cart Test - " + Thread.currentThread().getName()
        );
    }
    @Test(groups = "regression")
    public void paymentTest() {
        System.out.println("Payment Test");
        System.out.println(
                "Payment Test - " + Thread.currentThread().getName()
        );
    }
    @Test
    public void testEnabled() {
        System.out.println("Enabled Test");
        System.out.println(
                "enabled Test - " + Thread.currentThread().getName()
        );
    }

    @Test(enabled = false)
    public void testDisabled() {
        System.out.println("Disabled Test");
        System.out.println(
                "disabled Test - " + Thread.currentThread().getName()
        );
    }
    }

