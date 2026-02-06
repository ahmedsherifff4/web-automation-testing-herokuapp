package Run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {
                "src/main/resources/Features/Login.feature",
                "src/main/resources/Features/Alerts.feature"
        },
        //stepDefs
        glue = {"StepDefinitions","HooksPackage"},
        plugin={"pretty",
                "html:target/cucumber-html-report.html"
        },
        monochrome = true,
        tags="@valid"
)

public class Runner extends AbstractTestNGCucumberTests {


}
