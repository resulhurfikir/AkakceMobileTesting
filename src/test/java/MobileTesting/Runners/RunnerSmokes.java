package MobileTesting.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Smoke",
        features = {"src/test/java/MobileTesting/FeatureFiles"},
        glue = {"MobileTesting/StepDefinitions"}
)

public class RunnerSmokes extends AbstractTestNGCucumberTests{
}
