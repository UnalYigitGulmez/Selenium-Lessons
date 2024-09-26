package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        plugin = {"pretty","html:target/TestReports.html","json:target/TestReports.json","junit:target/TestReports.xml",
                "rerun:target/failedScenarios.txt"},
        tags = "@regression",
        dryRun = false

)

public class Runner {
}
