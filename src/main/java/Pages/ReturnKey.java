package Pages;

import PagesElements.BlockReturnElements;
import io.qameta.allure.Step;

import javax.security.auth.login.Configuration;

public class ReturnKey extends MainPage {

    BlockReturnElements returnPageElements = new BlockReturnElements();

//    @Step ("User click on Return Block")
//    public ReturnKey clickOnReturnBlock() {
//        mainPageElements.blockReturn.click();
//        return checkThatAllElementsIsDisplayed();
//    }

    @Step ("User click on Return Block")
    public void clickOnReturnBlock() {
        mainPageElements.blockReturn.click();
    }

    @Step ("User click on Scan Object after Return Block")
    public ReturnKey clickOnScanObjectReturnButton() {
//        returnPageElements.scanObjectAfterReturnButton.click();
        returnPageElements.scanObjectAfterReturnButton.doubleClick();
        return  checkThatAllElementsIsDisplayed();
    }

    @Step ("Check that all elements id displayed")
    public ReturnKey checkThatAllElementsIsDisplayed() {
        returnPageElements.pickupListItem.shouldHave().isDisplayed();
        mainPageElements.blockReturn.shouldHave().isDisplayed();
        returnPageElements.carKeyButton.shouldHave().isDisplayed();
        returnPageElements.scanObjectButtonOnReturnBlock.shouldHave().isDisplayed();
        returnPageElements.finalReturnButton.shouldHave().isDisplayed();
        mainPageElements.backButton.shouldHave().isDisplayed();

        return this;
    }

    @Step ("User click on Final Return Button")
    public ReturnKey clickOnFinalReturnButton() {
        returnPageElements.finalReturnButton.click();

        return popupWithMap();
    }

    @Step ("Check that User see popup with map")
    public ReturnKey popupWithMap() {
        returnPageElements.allPopup.shouldHave().isDisplayed();
        returnPageElements.confirmLocationButtonInPopup.shouldHave().isDisplayed();

        return this;
    }

    @Step ("Click on Confirm Location Popup")
    public ReturnKey clickOnConfirmLocationPopup() {
        returnPageElements.confirmLocationButtonInPopup.click();

        return pageWithFullstand();
    }

    @Step ("Check that popup is closed and User see Page with 'Fullstand' and 'Save' button is disabled ")
    public ReturnKey pageWithFullstand() {
        returnPageElements.confirmLocationButtonInPopup.shouldNotHave().isDisplayed();
        returnPageElements.pickupDetailsBox.shouldHave().isDisplayed();
        returnPageElements.returnDetailsBox.shouldHave().isDisplayed();
        mainPageElements.blockReturn.shouldHave().isDisplayed();
        returnPageElements.saveButton.shouldHave().isDisplayed();
        returnPageElements.disabledSaveButton.shouldHave().isDisplayed();

        return this;
    }

    @Step ("Click on Fullstand and check that 'Save' button is enabled")
    public ReturnKey clickOnFullstand() {
        returnPageElements.fullstandButtonWithValue50.click();

        return saveButtonIsEnabled();
    }

    @Step ("Check that 'Save' button is enabled")
    public ReturnKey saveButtonIsEnabled() {
        returnPageElements.enabledSaveButton.shouldHave().isDisplayed();

        return this;
    }

    @Step ( "User click on Save Button" )
    public ReturnKey clickOnSaveButton() {
        returnPageElements.saveButton.click();

        return uniqueDepotAfterSaveButton();
    }

    @Step ( "Check that User see popup with Unique Depot" )
    public ReturnKey uniqueDepotAfterSaveButton() {
        returnPageElements.uniqueDepotAfterClickOnSaveButton.shouldHave().isDisplayed();

        return this;
    }
}