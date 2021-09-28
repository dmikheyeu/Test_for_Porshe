package Pages;

import PagesElements.BlockAdminElements;
import PagesElements.BlockReservationElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class BlockReservation extends MainPage {

    BlockReservationElements reservationElements = new BlockReservationElements();
    BlockAdminElements blockAdminElements = new BlockAdminElements();

    @Step ( "Check that page have pickup-status 2 / green key" )
    public MainPage checkIsDisplayedPage() {
        reservationElements.pickupListItemWithGreenKey.shouldHave().isDisplayed();
        reservationElements.greenKeyIcon.shouldHave().isDisplayed();
        reservationElements.reservationTitlePage.shouldHave().isDisplayed();

        return this;
    }

    @Step ("User click on green key or reservation")
    public BlockReservation clickOnReservationButton() {
        reservationElements.reservationButton.click();

        return reservationDetailsPage();
    }

    @Step ("User click on yellow key or reservation")
    public BlockReservation clickOnYellowKey() {
        reservationElements.reservationButton.shouldNot().click();
        return userSeeYellowKeyInBlockReservation();
    }

    @Step ("User click on yellow key or reservation")
    public BlockReservation userSeeYellowKeyInBlockReservation() {
        reservationElements.pickupListItemWithYellowKey.shouldHave().isDisplayed();
        return this;
    }

    @Step ("User click on yellow key or reservation")
    public BlockReservation clickOnRedKey() {
        reservationElements.reservationButton.shouldBe(Condition.disappear);
        return userSeeRedKeyInBlockReservation();
    }

    @Step ("User click on yellow key or reservation")
    public BlockReservation userSeeRedKeyInBlockReservation() {
        reservationElements.pickupListItemWithRedKey.shouldHave().isDisplayed();
        return this;
    }

    @Step ("Check that Reservation details page is opened")
    public BlockReservation reservationDetailsPage() {
        reservationElements.reservationPickupContentWholePage.shouldHave().isDisplayed();
        reservationElements.reservationPickupContentMaps.shouldHave().isDisplayed();
        reservationElements.reservationPickupContentWholeForm.shouldHave().isDisplayed();
        reservationElements.reservationPickupContentBackButton.shouldHave().isDisplayed();
        reservationElements.reservationPickupContentNextButton.shouldHave().isDisplayed();

        return this;
    }

    @Step ("User click on the Next button")
    public BlockReservation clickOnTheNextButton() {
        reservationElements.reservationPickupContentNextButton.click();

        return seeDepotPopupWithText();
    }

    @Step ("Check that User see unique id")
    public BlockReservation seeDepotPopupWithText() {
        reservationElements.checkThatUserSeeDepotPopup.shouldHave().isDisplayed();
        reservationElements.checkThatUserSeeUniqueId.shouldHave().isDisplayed();
        reservationElements.checkThatUserSeeUniqueId.getText();
        return this;
    }

    @Step("User received Unique Depot")
    public String receiveUniqueId(){
        String IdUnique = reservationElements.checkThatUserSeeUniqueId.getText();
        int len = IdUnique.length() - 1;
        String SavedId = IdUnique.substring(5, len);
        System.out.println(SavedId);
        return SavedId;
    }

    @Step ( "Check that Depot with Picked Key is Empty" )
    public void checkThatDepotWithPickedKeyIsEmpty(String SavedId) {
        blockAdminElements.depotUniqueNumber.shouldHave(Condition.text(SavedId));
    }
}