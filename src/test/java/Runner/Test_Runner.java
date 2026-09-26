package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features/",
        //glue={"src/test/java/Step_Definations","src/test/java/Utility"},
        glue={"Step_Definations","Utility"},
        plugin = {"pretty",
                "html:target/cucumber-html-report" ,
                "json:target/cucumber.json"}
)


public class Test_Runner  extends AbstractTestNGCucumberTests  {

}
