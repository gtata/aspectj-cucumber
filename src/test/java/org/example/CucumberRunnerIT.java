package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Test which runs all cucumber scenarios.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/org/example/features"},
    glue = {"org.example.steps"},
    plugin = {"junit:target/failsafe-reports/platform.xml", "json:target/failsafe-reports/platform.json", "pretty"}
)
public class CucumberRunnerIT {
}
