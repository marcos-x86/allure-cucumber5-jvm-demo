package allure.cucumber5.jvm.demo.hooks;

import io.cucumber.core.gherkin.Scenario;
import org.testng.SkipException;

/**
 * It is in charge to define the skip test scenario actions.
 */
public class SkipHook {

    private static final String SKIPPED_MSG = "Skipped !!!";

    /**
     * Skips the test scenario
     */
    @Before("@skip")
    public void skipScenario(final Scenario scenario) {
        throw new SkipException(SKIPPED_MSG);
    }
}
