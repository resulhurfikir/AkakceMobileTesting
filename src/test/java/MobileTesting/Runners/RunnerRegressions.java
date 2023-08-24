package MobileTesting.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/MobileTesting/FeatureFiles"},
        glue = {"MobileTesting/StepDefinitions"}
)

public class RunnerRegressions extends AbstractTestNGCucumberTests{
}
