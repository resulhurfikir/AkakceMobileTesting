package MobileTesting.StepDefinitions;

import MobileTesting.Pages.Elements;
import MobileTesting.Utilities.Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.testng.Assert.assertTrue;

public class _03_TaskGivenByAkakceSteps {

    Elements e = new Elements();
    Methods m =new Methods();

    String urunName;

    @And("SendKeys to the Element")
    public void sendkeysToTheElement(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement w = e.getWebElement(items.get(i).get(0));
            w.sendKeys(items.get(i).get(1));
        }
    }


    @And("Choose product in the result list randomly and click *urune git butonu*")
    public void chooseProductInTheResultListRandomlyAndClickUruneGitButonu() {
        int randomUrun = m.randomGenerator(e.aratilanUrunListesi.size());
        urunName = e.aratilanUrunListesi.get(randomUrun).getText();
        e.aratilanUrunListesi.get(randomUrun).click();
        m.scrollToElement(e.uruneGitButonuList);
        e.uruneGitButonuList.get(0).click();
    }


    @And("Click on the *takip butonu* to add the product into the watch list")
    public void clickOnTheTakipButonuToAddTheProductIntoTheWatchList() {
        m.scrollToElement(e.takipEtButonuList);
        e.takipEtButonuList.get(0).click();
    }


    @Given("Click on the *Takip Listesi* button")
    public void clickOnTheTakipListesiButton() {
        e.takipListesiButonu.click();
    }


    @And("Empty watch list if there are any products on the list")
    public void emptyWatchListIfThereAreAnyProductsOnTheList() {
        if (e.takipListesiUrunler.size() > 0) {
            e.takipListesiDuzenle.click();
            for (WebElement we : e.takipListesiCheckBoxes) {
                we.click();
            }
            e.takibiBirak.click();
            e.takibiBirakConfirm.click();
            e.takipListesiKapatIconu.click();
        }
    }


    @Then("Verify that the watchlist is empty")
    public void verifyThatTheWatchlistIsEmpty() {
        assertTrue(e.takipListesiBosTexti.isDisplayed());
    }


    @Then("Verify that the selected *iphone11* in the watch list")
    public void verifyThatTheSelectedIphoneInTheWatchList() {
        m.AssertByText(e.takipListesiUrunler, urunName);
    }


}
