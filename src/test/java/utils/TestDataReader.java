package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestDataReader {
    Properties properties = new Properties();
    public String getUsername() throws IOException {
       // Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("testdata.properties");
        properties.load(inputStream);
        return properties.getProperty("username");
    }
    public String getPassword() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("testdata.properties");
        properties.load(inputStream);
        return properties.getProperty("password");
    }

}
