package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BlockReservation extends MainPage {

    @Step
    public void checkOpenPage(){
        TitlePage.isDisplayed();
    }

    @Step
    public MainPage checkIsDisplayedPage() {

        list.isDisplayed();
        return this;
    }

    @Step ("Check that Key is Green")
    public void checkThatKeyIsGreen(){
        greenKey.isDisplayed();

    }

    @Step ("User click on green key or reserveition")
    public void clickOnReserveitionButton() {
        reservationButton.click();
    }

    @Step ("Check that Reservation details page is opened")
    public void reservationDetailsPage() {
        reservationPickupContentWholePage.isDisplayed();
        reservationPickupContentMaps.isDisplayed();
        reservationPickupContentWholeForm.isDisplayed();
        reservationPickupContentBackButton.isDisplayed();
        reservationPickupContentNextButton.isDisplayed();
    }

    @Step ("User click on the Next button")
    public void userClickOnTheNextButton() {
        reservationPickupContentNextButton.click();
    }

    @Step ("Check that User see uniq id")
    public void userSeeDepotPopupWithText() {
        checkThatUserSeeDepotPopup.isDisplayed();
        checkThatUserSeeUniqId.isDisplayed();
    }

    @Step ("User click on the Logo Images")
    public void userClickOnTheLogoImages() {
        clickOnTheLogoImages.click();
    }



    public SelenideElement TitlePage = $x("//*[contains(text(), 'Abholung')]");
    public SelenideElement list = $x("//*[contains(@class,'pickup-list-item pickup-status3')]");
    public SelenideElement greenKey = $x("//*[contains(@src,'public/images/key-green.png')]");
//    public SelenideElement yellowKey = $x("//*[contains(@src,'public/images/key-yellow.png')]");
//    public SelenideElement redKey = $x("//*[contains(@src,'public/images/key-red.png')]");
    public SelenideElement reservationButton = $(byText("Reserviert"));
    public SelenideElement reservationPickupContentWholePage = $x("//*[contains(@class,'pickup-content')]");
    public SelenideElement reservationPickupContentMaps = $x("//*[contains(@class,'ol-viewport')]");
    public SelenideElement reservationPickupContentWholeForm = $x("//*[contains(@class,'pickup-form')]");
    public SelenideElement reservationPickupContentBackButton = $x("//*[contains(@class,'btn btn-secondary btn-lg mb-4')]");
    public SelenideElement reservationPickupContentNextButton = $x("//*[contains(@class,'footer-block-right')]");
    public SelenideElement checkThatUserSeeDepotPopup = $x("//*[contains(@class, 'pickup-detail-popup')]");
    public SelenideElement checkThatUserSeeUniqId = $x("//*[@id=\"depotMessage\"]/b");
    public SelenideElement clickOnTheLogoImages = $x("//*[contains(@src, 'public/images/logo.png')]");
}