package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/",
        //glue={"src/test/java/Step_Definations","src/test/java/Utility"},
        glue={"Step_Definations","Utility"},
        plugin = {"pretty",
                "html:target/cucumber-html-report" ,
                "json:target/cucumber.json"}
)


public class Test_Runner {

}
