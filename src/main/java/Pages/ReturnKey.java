package Pages;

import SelenideElements.ReturnPageElements;
import io.qameta.allure.Step;

public class ReturnKey extends MainPage {

    ReturnPageElements returnPageElements = new ReturnPageElements();

    @Step ("User click on the Logo Images")
    public void userClickOnTheLogoImages() {
        returnPageElements.clickOnTheLogoImages.click();
    }

    @Step ("User click on Return Block")
    public void userClickOnReturnBlock() {

        returnPageElements.clickOnReturnBlock.click();
    }

    @Step ("Check that all elements id displayed")
    public void checkThatAllElementsIsDisplayed() {
        returnPageElements.pickupListItem.isDisplayed();
        returnPageElements.headerTitle.isDisplayed();
        returnPageElements.carKeyButton.isDisplayed();
        returnPageElements.blockReturnButton.isDisplayed();
        returnPageElements.backButton.isDisplayed();
        returnPageElements.finalReturnButton.isDisplayed();
        returnPageElements.centerYellowButton.isDisplayed();
    }

    @Step ("User click on Final Return Button")
    public void clickOnFinalReturnButton() {
        returnPageElements.finalReturnButton.click();
    }
}