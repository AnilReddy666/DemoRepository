package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import java.time.Duration;

public class WaitUtils {
    WebDriverWait wait;
    public WaitUtils(WebDriver driver){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public WebElement waitforElementvisibility(By locator){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public WebElement waitforElementtobeClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));

    }
    public  WebElement waitforElementToBePresent(By locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }
    public boolean waitforUrlContains(String url){
        return wait.until(ExpectedConditions.urlContains(url));
    }

   public boolean waitfortitleIs(String url){
        return wait.until(ExpectedConditions.titleIs(url));
   }


}
