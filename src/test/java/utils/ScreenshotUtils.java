package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenshotUtils {
    public static String takeScreenshot(WebDriver driver, String testName){
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        byte[] image = screenshot.getScreenshotAs(OutputType.BYTES);
        Path path = Paths.get("test-output/screenshots/" + testName + ".png");

        try {
            Files.createDirectories(Paths.get("test-output/screenshots"));
            Files.write(path, image);

            System.out.println("Screenshot saved: " + path);

        } catch (IOException e) {
            System.out.println("Unable to save screenshot: " + e.getMessage());
        }
        return "screenshots/" + testName + ".png";
    }
}


