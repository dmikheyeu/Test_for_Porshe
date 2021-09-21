package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ReturnKey extends MainPage {
    @Step ("User click on the Logo Images")
    public void userClickOnTheLogoImages() {
        clickOnTheLogoImages.click();
    }

    @Step ("User click on Return Block")
    public void userClickOnReturnBlock() {
        clickOnReturnBlock.click();
    }

    @Step ("Check that all elements id displayed")
    public void checkThatAllElementsIsDisplayed() {
        pickupListItem.isDisplayed();
        headerTitle.isDisplayed();
        carKeyButton.isDisplayed();
        blockReturnButton.isDisplayed();
        backButton.isDisplayed();
        finalReturnButton.isDisplayed();
        centerYellowButton.isDisplayed();
    }

    @Step ("User click on Final Return Button")
    public void clickOnFinalReturnButton() {
        finalReturnButton.click();
    }

    public SelenideElement clickOnTheLogoImages = $x("//*[contains(@src, 'public/images/logo.png')]");
    public SelenideElement clickOnReturnBlock = $x("//*[contains(text(),'Rückgabe')]");
    public SelenideElement pickupListItem = $x("//*[contains(@class, 'pickup-list-item pickup-status2')]");
    public SelenideElement headerTitle = $x("//*[contains(@class, 'header-title')]");
    public SelenideElement carKeyButton = $x("//*[contains(@class, 'return-btn-small return-btn-key')]");
    public SelenideElement blockReturnButton = $x("//*[contains(@class, 'btn-block return-btn')]");
    public SelenideElement backButton = $x("//*[contains(text(), 'ZURÜCK')]");
    public SelenideElement finalReturnButton = $x("//*[contains(@id, 'nextbutton')]");
    public SelenideElement centerYellowButton = $x("//*[contains(@id, 'temp_res')]");

}