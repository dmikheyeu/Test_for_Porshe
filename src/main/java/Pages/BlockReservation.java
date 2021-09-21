package Pages;

import SelenideElements.ReservationElements;
import io.qameta.allure.Step;

public class BlockReservation extends MainPage {

    ReservationElements reservationElements = new ReservationElements();

    @Step
    public void checkOpenPage(){

        reservationElements.TitlePage.isDisplayed();
    }

    @Step
    public MainPage checkIsDisplayedPage() {

        reservationElements.list.isDisplayed();
        return this;
    }

    @Step ("Check that Key is Green")
    public void checkThatKeyIsGreen(){
        reservationElements.greenKey.isDisplayed();

    }

    @Step ("User click on green key or reserveition")
    public void clickOnReserveitionButton() {

        reservationElements.reservationButton.click();
    }

    @Step ("Check that Reservation details page is opened")
    public void reservationDetailsPage() {
        reservationElements.reservationPickupContentWholePage.isDisplayed();
        reservationElements.reservationPickupContentMaps.isDisplayed();
        reservationElements.reservationPickupContentWholeForm.isDisplayed();
        reservationElements.reservationPickupContentBackButton.isDisplayed();
        reservationElements.reservationPickupContentNextButton.isDisplayed();
    }

    @Step ("User click on the Next button")
    public void userClickOnTheNextButton() {

        reservationElements.reservationPickupContentNextButton.click();
    }

    @Step ("Check that User see uniq id")
    public void userSeeDepotPopupWithText() {
        reservationElements.checkThatUserSeeDepotPopup.isDisplayed();
        reservationElements.checkThatUserSeeUniqId.isDisplayed();
    }

    @Step ("User click on the Logo Images")
    public void userClickOnTheLogoImages() {

        reservationElements.clickOnTheLogoImages.click();
    }
}