package Pages;

import org.openqa.selenium.By;

import static Utility.BrowserDriver.driver;

public class HomePage {
    public static String menubar = "//input[@type= \"checkbox\"]";
    public static String sign_in_portal = "//li[text()='Sign In Portal']";
    public static String User_name = "//input[@type='text']";
    public static String Password = "//input[@type='password']";
    public static String login_button = "//input[@type='submit']";
    public static String validation_text =  "//font[text()='Ace Online Shoe Portal']";
    public static void click_menu_bar(){
        driver.findElement(By.xpath(menubar)).click();
    }
    public static void click_signin_bar(){
        driver.findElement(By.xpath(sign_in_portal)).click();
    }
    public static void enter_user_name(){
        driver.findElement(By.xpath(User_name)).sendKeys("siva");
    }
    public  static void  entter_password(){
        driver.findElement(By.xpath(Password)).sendKeys("xyz");
    }
    public static void click_on_login_button(){
        driver.findElement(By.xpath(login_button)).click();
    }
   public static String validation_text(){
      String Login_Validation =  driver.findElement(By.xpath(validation_text)).getText();


       return Login_Validation;
   }

}
