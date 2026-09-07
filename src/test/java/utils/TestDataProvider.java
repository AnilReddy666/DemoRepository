package utils;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return new Object[][]{
                {"standard_user", "secret_sauce", "success"},
                {"locked_out_user", "secret_sauce", "failure"},
                {"problem_user", "secret_sauce", "success"},
                {"performance_glitch_user", "secret_sauce", "success"},
                {"error_user", "secret_sauce", "success"},
                {"visual_user", "secret_sauce", "success"}
        };
    }
}
