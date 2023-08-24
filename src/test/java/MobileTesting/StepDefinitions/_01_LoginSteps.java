package MobileTesting.StepDefinitions;

import MobileTesting.Pages.Elements;
import io.cucumber.java.en.*;
import static MobileTesting.Utilities.DriverManager.getAppiumDriver;
import static org.testng.Assert.assertTrue;

public class _01_LoginSteps {

    Elements e = new Elements();

    @Given("Open Application")
    public void openApplication() {
        getAppiumDriver();
    }


    @When("Close the popUP")
    public void closeThePopUP() {
        e.hesabimIconu.click();
    }


    @And("Click on the hesabim button")
    public void clickOnTheHesabimButton() {
        e.hesabimIconu.click();
    }


    @And("Enter the valid email and password")
    public void enterTheValidEmailAndPassword() {
        e.eposta.sendKeys("rresullress@gmail.com");
        e.sifre.sendKeys("Deneme123.");
    }


    @And("Click on the girisYap button")
    public void clickOnTheGirisYapButton() {
        e.girisYapButonu.click();
    }


    @Then("Verify that the user should be logged in successfully")
    public void verifyThatTheUserShouldBeLoggedInSuccessfully() {
        assertTrue(e.siparislerim().isDisplayed());
    }


}
