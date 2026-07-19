package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utility.BrowserDriver.driver;

public class RegistrationDetailsFormPage {
public static String drop_down = "//select[@id='Salutation']";
public static String first_name = "//input[@id='firstname']";
public static String las_name = "//input[@id='lastname']";
public static String email_id = "//input[@id='emailId']";
public static  String contact_number = "//input[@id='contactNumber']";
public static String user_name = "//input[@id='usr']";
public static String Password= "//input[@id='pwd']";
public static String submit_button = "//input[@type='submit']";
public static String Registration_Sucessfull_Validation = "//h1[text()='User Registered Successfully !!!']";
public static void gender_selection(){
    WebElement dropdown = driver.findElement(By.xpath(drop_down));
    Select s = new Select(dropdown);
   s.selectByVisibleText("Ms.");
}
public static void first_name(){
    driver.findElement(By.xpath(first_name)).sendKeys("ss");
}
    public static void last_name(){
        driver.findElement(By.xpath(las_name)).sendKeys("ss");
    }
    public static void email_id(){
        driver.findElement(By.xpath(email_id)).sendKeys("ss@gmail.com");
    }
    public static void contact_number(){
        driver.findElement(By.xpath(contact_number)).sendKeys("ss");
    }
    public static void user_name(){
        driver.findElement(By.xpath(user_name)).sendKeys("ss");
    }
    public static void  Password(){
        driver.findElement(By.xpath( Password)).sendKeys("ss");
    }
    public static void submit_button(){
        driver.findElement(By.xpath( submit_button)).click();
    }
   public static String Registration_successfull_message(){
    String actual_text = driver.findElement(By.xpath(Registration_Sucessfull_Validation)).getText();
    return actual_text;
   }
}
