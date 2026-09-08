package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class LoginPage {
    WaitUtils waitUtils;

    WebDriver driver;
    @FindBy(id="user-name")
    WebElement username;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="login-button")
    WebElement loginButton;
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement loginError;
  /*  @FindBy(className = "title")
    WebElement productTitle;*/
// Login feature changes
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        waitUtils = new WaitUtils(driver);
    }

    public void enterUsername(String username){
       // this.username.sendKeys(username);
        waitUtils.waitforElementvisibility(By.id("user-name")).sendKeys(username);

    }
    public void enterPassword(String password){
       //this.password.sendKeys(password);
        waitUtils.waitforElementvisibility(By.id("password")).sendKeys(password);
    }
    public ProductPage clickLoginButton(){
      //  this.loginButton.click();
        waitUtils.waitforElementtobeClickable(By.id("login-button")).click();
        System.out.println("After clicking login");
      //  waitUtils.waitforUrlContains("inventory.html");
       // waitUtils.waitfortitleIs("Swag Labs");
        return new ProductPage(driver);
    }
    public  String getLoginErrorMessage(){
        return waitUtils.waitforElementvisibility
                (By.xpath("//h3[@data-test='error']")).getText();

    }
   /* public String ProductTitle(){
        return productTitle.getText();
    }*/
   public boolean isLoginPageDisplayed() {
       return driver.getCurrentUrl().equals("https://www.saucedemo.com/");
   }

}
