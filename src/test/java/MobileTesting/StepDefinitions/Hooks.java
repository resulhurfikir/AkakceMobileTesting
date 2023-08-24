package MobileTesting.StepDefinitions;

import MobileTesting.Utilities.DriverManager;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void after() {
        DriverManager.closeApplication();
    }


}