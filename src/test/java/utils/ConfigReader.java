package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    public String getBrowser() throws IOException {
        Properties p = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream( "config.properties");
       p.load(inputStream);
       return p.getProperty("browser");
    }

}
