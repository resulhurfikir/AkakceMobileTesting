package MobileTesting.StepDefinitions;

import MobileTesting.Pages.Elements;
import MobileTesting.Utilities.Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import java.util.List;


public class _02_WatchListSteps {
    Elements e = new Elements();
    Methods m = new Methods();

    String firstLaptopText;
    @Given("Click on the Element")
    public void clickOnTheElement(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String b:buttons){
            WebElement webElement = e.getWebElement(b);
            webElement.click();
        }
    }


    @And("Perform scroll for element")
    public void performScrollForElement() {
        m.scrollToElement(e.firstLaptopList);
    }


    @And("Get the first Product name")
    public void getTheFirstProductName() {
        firstLaptopText = e.firstLaptopList.get(0).getText();
    }


    @Then("Verify that the product in the watch list")
    public void verifyThatTheProductInTheWatchList() {
        m.AssertByText(e.takipListesiUrunler, firstLaptopText);
    }


}
