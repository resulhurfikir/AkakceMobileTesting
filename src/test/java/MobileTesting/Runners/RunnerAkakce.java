package MobileTesting.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/MobileTesting/FeatureFiles/_03_TaskGivenByAkakce.feature"},
        glue = {"MobileTesting/StepDefinitions"}
)

public class RunnerAkakce extends AbstractTestNGCucumberTests{
}
