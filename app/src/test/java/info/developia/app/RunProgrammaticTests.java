package info.developia.app;

import org.junit.Test;

public class RunProgrammaticTests {

    //    String featuresPath = "classpath:features";
    String featuresPath = "src/test/resources/features";

//    plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json", "html:target/cucumber-reports/report.html" },
//    glue = "info.developia.testing.poc.steps")

//    cucumber.ansi-colors.disabled=  # true or false. default: false
//    cucumber.execution.dry-run=     # true or false. default: false
//    cucumber.execution.limit=       # number of scenarios to execute (CLI only).
//    cucumber.execution.order=       # lexical, reverse, random or random:[seed] (CLI only). default: lexical
//    cucumber.execution.strict=      # true or false. default: false.
//    cucumber.execution.wip=         # true or false. default: false.
//    cucumber.features=              # command separated paths to feature files. example: path/to/example.feature, path/to/other.feature
//    cucumber.filter.name=           # regex. example: .*Hello.*
//    cucumber.filter.tags=           # tag expression. example: @smoke and not @slow
//    cucumber.glue=                  # comma separated package names. example: com.example.glue
//    cucumber.plugin=                # comma separated plugin strings. example: pretty, json:path/to/report.json
//    cucumber.object-factory=        # object factory class name. example: com.example.MyObjectFactory
//    cucumber.snippet-type=          # underscore or camelcase. default: underscore

    @Test
    public void testRunner() {
//        System.setProperty("cucumber.filter.name", "Add two numbers"); // H ???
//        System.setProperty("cucumber.filter.tags", "@simple"); // H ???

        String[] argv = {
                "--glue", "info.developia.testing.poc.steps",
                "--plugin", "json:target/cucumber-reports/cucumber-report.json",
                "--monochrome",
                featuresPath,
//                "--name", System.getProperty("cucumber.filter.name")  // H ???
//                "--tags", System.getProperty("cucumber.filter.tags"), // H ???
//                "--threads", "10"
        };

        var result = io.cucumber.core.cli.Main.run(argv, Thread.currentThread().getContextClassLoader());
    }
}
