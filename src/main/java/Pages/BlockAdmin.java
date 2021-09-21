package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;

public class BlockAdmin extends MainPage{

    @Step ("Go to Admin page")
    public void clickToAdmin() {
        BlockAdmin.click();
    }

    @Step ("Check that List of keys is displayed")
    public void checkThatUserSeeListOfKeys() {
        HeaderTitle.isDisplayed();
        SearchFieldText.isDisplayed();
        SearchFieldButton.isDisplayed();
        PickupTableHeader.isDisplayed();
        HorizontalLine.isDisplayed();
    }

    @Step ("Check that Horizontal Line is non-empty")
    public void checkThatHorizontalLineIsNonEmpty() {
        HorizontalLineIsNonEmpty.isDisplayed();
    }

    @Step ("Check that Horizontal Line is empty")
    public void checkThatHorizontalLineIsEmpty() {
        HorizontalLineIsEmpty.isDisplayed();
    }

    @Step ("Check that user can click Back button")
    public void clickToBackButton() {
        BackButton.click();
    }

    public SelenideElement BlockAdmin = $x("//*[contains(text(),'Verwaltung')]");
    public SelenideElement HeaderTitle = $x("//*[contains(text(),'ADMIN Verwaltung')]");
    public SelenideElement SearchFieldText = $x("//*[contains(@id,'searchFieldText')]");
    public SelenideElement SearchFieldButton = $x("//*[contains(@class,'search-field_button')]");
    public SelenideElement PickupTableHeader = $x("//*[contains(@class,'pickup-table-header')]");
    public SelenideElement HorizontalLine = $x("//body/div[2]/div/div[2]/div[2]/table/tbody/tr[1]");
    public SelenideElement HorizontalLineIsNonEmpty = $x("//div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[3]/a");
    public SelenideElement HorizontalLineIsEmpty = $x("//div[2]/div/div[2]/div[2]/table/tbody/tr[3]/td[3]/a");
    public SelenideElement BackButton = $x("//*[contains(text(),'ZURÜCK')]");
}