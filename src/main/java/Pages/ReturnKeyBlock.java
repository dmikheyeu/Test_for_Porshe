package Pages;

import PagesElements.BlockReturnElements;
import io.qameta.allure.Step;

public class ReturnKeyBlock extends MainPage {

    BlockReturnElements returnPageElements = new BlockReturnElements();

    @Step ("User click on Return Block")
    public ReturnKeyBlock clickOnReturnBlock() {
        mainPageElements.blockReturn.click();
        return checkThatAllElementsIsDisplayed();
    }

    @Step ("Check that all elements id displayed")
    public ReturnKeyBlock checkThatAllElementsIsDisplayed() {
        returnPageElements.pickupListItem.shouldHave().isDisplayed();
        mainPageElements.blockReturn.shouldHave().isDisplayed();
        returnPageElements.carKeyButton.shouldHave().isDisplayed();
        returnPageElements.scanObjectButtonOnReturnBlock.shouldHave().isDisplayed();
        returnPageElements.finalReturnButton.shouldHave().isDisplayed();
        mainPageElements.backButton.shouldHave().isDisplayed();
        return this;
    }

    @Step ("User click on Final Return Button")
    public ReturnKeyBlock clickOnFinalReturnButton() {
        returnPageElements.finalReturnButton.click();

        return popupWithMap();
    }

    @Step ("Check that User see popup with map")
    public ReturnKeyBlock popupWithMap() {
        returnPageElements.allPopup.shouldHave().isDisplayed();
        returnPageElements.confirmLocationButtonInPopup.shouldHave().isDisplayed();

        return this;
    }

    @Step ("Click on Confirm Location Popup")
    public ReturnKeyBlock clickOnConfirmLocationPopup() {
        returnPageElements.confirmLocationButtonInPopup.click();

        return pageWithFullstand();
    }

    @Step ("Check that popup is closed and User see Page with 'Fullstand' and 'Save' button is disabled ")
    public ReturnKeyBlock pageWithFullstand() {
        returnPageElements.confirmLocationButtonInPopup.shouldNotHave().isDisplayed();
        returnPageElements.pickupDetailsBox.shouldHave().isDisplayed();
        returnPageElements.returnDetailsBox.shouldHave().isDisplayed();
        mainPageElements.blockReturn.shouldHave().isDisplayed();
        returnPageElements.saveButton.shouldHave().isDisplayed();
        returnPageElements.disabledSaveButton.shouldHave().isDisplayed();

        return this;
    }

    @Step ("Click on Fullstand and check that 'Save' button is enabled")
    public ReturnKeyBlock clickOnFullstand() {
        returnPageElements.fullstandButtonWithValue50.click();

        return saveButtonIsEnabled();
    }

    @Step ("Check that 'Save' button is enabled")
    public ReturnKeyBlock saveButtonIsEnabled() {
        returnPageElements.enabledSaveButton.shouldHave().isDisplayed();

        return this;
    }

    @Step ( "User click on Save Button" )
    public ReturnKeyBlock clickOnSaveButton() {
        returnPageElements.saveButton.click();

        return uniqueDepotAfterSaveButton();
    }

    @Step ( "Check that User see popup with Unique Depot" )
    public ReturnKeyBlock uniqueDepotAfterSaveButton() {
        returnPageElements.uniqueDepotAfterClickOnSaveButton.shouldHave().isDisplayed();

        return this;
    }

    @Step ( "User click on Admin Tab" )
    public BlockAdmin clickOnAdminTab() {
        mainPageElements.blockAdmin.click();
        return checkThatUserSeeListOfKeys();
    }

    @Step ( "Check that list of keys is displayed" )
    public BlockAdmin checkThatUserSeeListOfKeys() {

        return this;
    }
}