package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions (

        tags = "@api",   //scenario that has both @login and @signin tag name
                                     // @login or @signin -> scenariois with either login or signin
        features = "src/test/resources",
        glue = "stepDefinitions",


        plugin = {
                "html:target/built-in-report.html",
                "json:target/cucumber.json"
        }

//        , dryRun = true


)


public class CucumberRunner {
}
