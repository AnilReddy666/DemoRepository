package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BrowserDriver.driver;
public class RegistrationPage {
    public static String Registration_page_Validation_text = "//h1[contains(text(), 'User')]";
    public static void Registration_button_click(){
        driver.findElement(By.id("NewRegistration")).click();
    }
    public static String Registration_page_entry_validation(){
      String Registratuon_page_validation =
              driver.findElement(By.xpath(Registration_page_Validation_text)).getText();
      return Registratuon_page_validation;
    }
}
