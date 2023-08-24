package MobileTesting.Pages;

import MobileTesting.Utilities.DriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements extends DriverManager {

    public Elements() {
        PageFactory.initElements(getAppiumDriver(), this);
    }

    private WebElement accessibilityId(String locator) {
        AppiumBy element = (AppiumBy) AppiumBy.accessibilityId(locator);
        return getAppiumDriver().findElement(element);
    }

    @FindBy(id = "com.akakce.akakce:id/framePopupLyt")
    public List<WebElement> popUp;
    @FindBy(id = "com.akakce.akakce:id/rightClick")
    public WebElement hesabimIconu;
    @FindBy(id = "com.akakce.akakce:id/email_edt")
    public WebElement eposta;
    @FindBy(id = "com.akakce.akakce:id/password_edt")
    public WebElement sifre;
    @FindBy(id = "com.akakce.akakce:id/login_btn")
    public WebElement girisYapButonu;

    public WebElement siparislerim() {
        return accessibilityId("Siparişlerim");
    }

    @FindBy(id = "com.akakce.akakce:id/homePage")
    public WebElement anaSayfa;
    @FindBy(id = "com.akakce.akakce:id/leftClick")
    public WebElement leftClick;
    @FindBy(xpath = "//*[@text='Elektronik']")
    public WebElement elektronik;
    @FindBy(xpath = "(//*[@resource-id='com.akakce.akakce:id/innerRelative'])[4]")
    public WebElement bilgisayarDonanim;
    @FindBy(xpath = "(//*[@resource-id='com.akakce.akakce:id/innerRelative'])[2]")
    public WebElement bilgisayarlar;
    @FindBy(xpath = "(//*[@resource-id='com.akakce.akakce:id/innerRelative'])[2]")
    public WebElement dizustuBilgisayar;
    @FindBy(xpath = "(//*[@resource-id='com.akakce.akakce:id/innerRelative'])[2]")
    public WebElement laptopVeNotebook;
    @FindBy(xpath = "(//*[@resource-id='com.akakce.akakce:id/name'])[1]")
    public List<WebElement> firstLaptopList;
    @FindBy(xpath = "(//*[@resource-id='com.akakce.akakce:id/favBtnLayout'])[1]")
    public WebElement takipEtIconu;
    @FindBy(id = "com.akakce.akakce:id/followPage")
    public WebElement takipListesiButonu;
    @FindBy(xpath = "//*[@resource-id='com.akakce.akakce:id/name']")
    public List<WebElement> takipListesiUrunler;
    @FindBy(id = "com.akakce.akakce:id/edit_follow_list")
    public WebElement takipListesiDuzenle;
    @FindBy(xpath = "//*[@resource-id='com.akakce.akakce:id/checkImage']")
    public List<WebElement> takipListesiCheckBoxes;
    @FindBy(id = "com.akakce.akakce:id/deleteBtn")
    public WebElement takibiBirak;
    @FindBy(id = "com.akakce.akakce:id/doneBtn")
    public WebElement takibiBirakConfirm;
    @FindBy(id = "com.akakce.akakce:id/toolbarImage")
    public WebElement takipListesiKapatIconu;
    @FindBy(id = "com.akakce.akakce:id/phraseText")
    public WebElement takipListesiBosTexti;
    @FindBy(id = "com.akakce.akakce:id/searchPage")
    public WebElement searchPage;
    @FindBy(xpath = "(//*[@resource-id='com.akakce.akakce:id/searchTextView'])[2]")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@text='iPhone 11']")
    public WebElement iphone11;
    @FindBy(xpath = "//*[@resource-id='com.akakce.akakce:id/name']")
    public List<WebElement> aratilanUrunListesi;
    @FindBy(xpath = "//*[@text='Takip Et']")
    public List<WebElement> takipEtButonuList;
    @FindBy(id = "com.akakce.akakce:id/detailBtnLayout")
    public List<WebElement> uruneGitButonuList;


    public WebElement getWebElement(String element) {
        switch (element) {
            case "anaSayfa": return anaSayfa;
            case"leftClick": return leftClick;
            case "elektronik": return elektronik;
            case "bilgisayarDonanim": return bilgisayarDonanim;
            case "bilgisayarlar": return bilgisayarlar;
            case "dizustuBilgisayar": return dizustuBilgisayar;
            case "laptopVeNotebook": return laptopVeNotebook;
            case "takipEtIconu": return takipEtIconu;
            case "takipListesiButonu": return takipListesiButonu;
            case "searchPage": return searchPage;
            case "searchBox": return searchBox;
            case "iphone11": return iphone11;

        }
        return null;
    }

}
