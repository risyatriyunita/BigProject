package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue={"stepDef"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        tags = "@SignIn or @Board or @GroupChat or @CheckIn"
)

public class RunnerTest {
}