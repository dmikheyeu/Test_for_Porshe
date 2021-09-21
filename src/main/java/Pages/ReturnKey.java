package Pages;

import SelenideElements.BlockReturnElements;
import io.qameta.allure.Step;

public class ReturnKey extends MainPage {

    BlockReturnElements returnPageElements = new BlockReturnElements();

    @Step ("User click on the Logo Images")
    public void userClickOnTheLogoImages() {
        returnPageElements.clickOnTheLogoImages.click();
    }

    @Step ("User click on Return Block")
    public void userClickOnReturnBlock() {

        mainPageElements.blockReturn.click();
    }

    @Step ("Check that all elements id displayed")
    public void checkThatAllElementsIsDisplayed() {
        returnPageElements.pickupListItem.shouldHave().isDisplayed();
        returnPageElements.headerTitle.shouldHave().isDisplayed();
        returnPageElements.carKeyButton.shouldHave().isDisplayed();
        returnPageElements.blockReturnButton.shouldHave().isDisplayed();
        returnPageElements.backButton.shouldHave().isDisplayed();
        returnPageElements.finalReturnButton.shouldHave().isDisplayed();
        returnPageElements.centerYellowButton.shouldHave().isDisplayed();
    }

    @Step ("User click on Final Return Button")
    public void clickOnFinalReturnButton() {
        returnPageElements.finalReturnButton.click();
    }
}