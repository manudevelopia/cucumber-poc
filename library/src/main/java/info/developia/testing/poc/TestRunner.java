package info.developia.testing.poc;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json", "html:target/cucumber-reports/report.html" },
        glue = "info.developia.testing.poc.steps")
public class TestRunner {

}
