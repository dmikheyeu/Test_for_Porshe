package Pages;

import SelenideElements.BlockReservationElements;
import io.qameta.allure.Step;

public class BlockReservation extends MainPage {

    BlockReservationElements reservationElements = new BlockReservationElements();

    @Step ( "Check that page have pickup-status 2 / green key" )
    public MainPage checkIsDisplayedPage() {
        reservationElements.pickupListItemWithGreenKey.shouldHave().isDisplayed();
        reservationElements.greenKey.shouldHave().isDisplayed();
        reservationElements.TitlePage.shouldHave().isDisplayed();
        return this;
    }

//    @Step ( "Check that Reservation page is open" )
//    public void checkThatReservationPageIsOpen(){
//        reservationElements.greenKey.shouldHave().isDisplayed();
//        reservationElements.TitlePage.shouldHave().isDisplayed();
//    }

    @Step ("User click on green key or reservation")
    public void clickOnReservationButton() {
        reservationElements.reservationButton.click();
    }

    @Step ("Check that Reservation details page is opened")
    public void reservationDetailsPage() {
        reservationElements.reservationPickupContentWholePage.shouldHave().isDisplayed();
        reservationElements.reservationPickupContentMaps.shouldHave().isDisplayed();
        reservationElements.reservationPickupContentWholeForm.shouldHave().isDisplayed();
        reservationElements.reservationPickupContentBackButton.shouldHave().isDisplayed();
        reservationElements.reservationPickupContentNextButton.shouldHave().isDisplayed();
    }

    @Step ("User click on the Next button")
    public void userClickOnTheNextButton() {

        reservationElements.reservationPickupContentNextButton.click();
    }

    @Step ("Check that User see unique id")
    public void userSeeDepotPopupWithText() {
        reservationElements.checkThatUserSeeDepotPopup.shouldHave().isDisplayed();
        reservationElements.checkThatUserSeeUniqueId.shouldHave().isDisplayed();
    }

    @Step ("User click on the Logo Images")
    public void userClickOnTheLogoImages() {

        reservationElements.clickOnTheLogoImages.click();
    }
}