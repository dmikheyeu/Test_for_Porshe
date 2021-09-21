package Pages;

import SelenideElements.BlockAdminElements;
import io.qameta.allure.Step;

public class BlockAdmin extends MainPage{

    BlockAdminElements blockAdminElements = new BlockAdminElements();

    @Step ("Go to Admin page")
    public void clickToAdmin() {

        mainPageElements.blockAdmin.click();
    }

    @Step ("Check that List of keys is displayed")
    public void checkThatUserSeeListOfKeys() {
        blockAdminElements.HeaderTitle.shouldHave().isDisplayed();
        blockAdminElements.SearchFieldText.shouldHave().isDisplayed();
        blockAdminElements.SearchFieldButton.shouldHave().isDisplayed();
        blockAdminElements.PickupTableHeader.shouldHave().isDisplayed();
        blockAdminElements.DepotWithInfo.shouldHave().isDisplayed();
    }
}