package Pages;

import SelenideElements.AdminElements;
import io.qameta.allure.Step;

public class BlockAdmin extends MainPage{

    AdminElements adminElements = new AdminElements();

    @Step ("Go to Admin page")
    public void clickToAdmin() {

        adminElements.BlockAdmin.click();
    }

    @Step ("Check that List of keys is displayed")
    public void checkThatUserSeeListOfKeys() {
        adminElements.HeaderTitle.isDisplayed();
        adminElements.SearchFieldText.isDisplayed();
        adminElements.SearchFieldButton.isDisplayed();
        adminElements.PickupTableHeader.isDisplayed();
        adminElements.HorizontalLine.isDisplayed();
    }

    @Step ("Check that Horizontal Line is non-empty")
    public void checkThatHorizontalLineIsNonEmpty() {

        adminElements.HorizontalLineIsNonEmpty.isDisplayed();
    }

    @Step ("Check that Horizontal Line is empty")
    public void checkThatHorizontalLineIsEmpty() {

        adminElements.HorizontalLineIsEmpty.isDisplayed();
    }

    @Step ("Check that user can click Back button")
    public void clickToBackButton() {

        adminElements.BackButton.click();
    }
}