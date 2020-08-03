package allure.cucumber5.jvm.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * It is in charge to set properties for the test execution.
 */
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features"},
        glue = {"allure.cucumber5.jvm.demo"})
public class Runner extends AbstractTestNGCucumberTests {
}
