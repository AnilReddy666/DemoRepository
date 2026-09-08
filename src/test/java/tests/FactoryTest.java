package tests;

import org.testng.annotations.Test;

public class FactoryTest {
    private String browser;
    public FactoryTest(String browser){
        this.browser = browser;
    }
  @Test
    public  void testBrowser(){
      System.out.println("Running test on: " + browser);
  }
}
