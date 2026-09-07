package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/DataTables.feature",
        glue =  {"stepdefinations", "hooks"},
       // dryRun = true,
        plugin = {"pretty","html:test-output/cucumber-report.html"},
        monochrome = true

)
public class TestRunner extends AbstractTestNGCucumberTests {


}
