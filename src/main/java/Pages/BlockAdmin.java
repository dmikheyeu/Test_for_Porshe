package Pages;

import PagesElements.BlockAdminElements;
import io.qameta.allure.Step;

public class BlockAdmin extends MainPage{

    BlockAdminElements blockAdminElements = new BlockAdminElements();

    @Step ("Go to Admin page")
    public BlockAdmin clickToAdmin() {
        mainPageElements.blockAdmin.click();
        return checkThatUserSeeListOfKeys();
    }

    @Step ("Check that List of keys is displayed")
    public BlockAdmin checkThatUserSeeListOfKeys() {
        blockAdminElements.HeaderTitle.shouldHave().isDisplayed();
        blockAdminElements.SearchFieldText.shouldHave().isDisplayed();
        blockAdminElements.SearchFieldButton.shouldHave().isDisplayed();
        blockAdminElements.PickupTableHeader.shouldHave().isDisplayed();
        blockAdminElements.DepotStringWithInfo.shouldHave().isDisplayed();
        return this;
    }
}