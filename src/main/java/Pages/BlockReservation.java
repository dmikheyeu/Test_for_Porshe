package Pages;

import PagesElements.BlockAdminElements;
import PagesElements.BlockReservationElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class BlockReservation extends MainPage {

    BlockReservationElements reservationElements = new BlockReservationElements();
    BlockAdminElements blockAdminElements = new BlockAdminElements();

    @Step ( "Check that page have pickup-status 2 / green key" )
    public MainPage checkIsDisplayedPage() {
        reservationElements.pickupListItemWithGreenKey.shouldHave().isDisplayed();
        reservationElements.greenKey.shouldHave().isDisplayed();
        reservationElements.TitlePage.shouldHave().isDisplayed();

        return this;
    }

    @Step ("User click on green key or reservation")
    public BlockReservation clickOnReservationButton() {
        reservationElements.reservationButton.click();

        return reservationDetailsPage();
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
        System.out.println(IdUnique);
        System.out.println(IdUnique.substring(5, len));
        return IdUnique;
    }

    @Step ( "User click on the Logo Images" )
    public void clickOnTheLogoImages() {

        mainPageElements.logoPorshe.click();
        mainPageElements.logoPorshe.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

//    @Step ("")
//    public void metodnazoviSravnivaetStringu(String id) {
//        blockAdminElements.DepotUniqueNumber.shouldHave(Condition.text(id));
//        System.out.println(id);
//    }

    @Step ( "Check that Depot with Picked Key is Empty" )
    public void checkThatDepotWithPickedKeyIsEmpty(String id) {
        blockAdminElements.DepotUniqueNumber.shouldHave(Condition.text(id));
        System.out.println(id);
    }
}