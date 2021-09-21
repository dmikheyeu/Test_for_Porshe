
import Pages.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SimpleTest extends MainPage {

    InitPage initPage = new InitPage();

    @Test
    @DisplayName("Pick-up valid reservation (green key) via \"My registration\" tab")
    public void PickupValidReservation(){
        openSite();
        mainPageIsOpen();
        clickToReservationButton();
        initPage.reservationPage.checkIsDisplayedPage();
//        initPage.reservationPage.checkThatReservationPageIsOpen();
        initPage.reservationPage.clickOnReservationButton();
        initPage.reservationPage.reservationDetailsPage();
        initPage.reservationPage.userClickOnTheNextButton();
        initPage.reservationPage.userSeeDepotPopupWithText();
        initPage.reservationPage.userClickOnTheLogoImages();
        initPage.adminMenu.clickToAdmin();
        initPage.adminMenu.checkThatUserSeeListOfKeys();
    }
    @Test
    @DisplayName( "User returns key" )
    public void ReturnKey() {
        initPage.returnKey.userClickOnTheLogoImages();
        initPage.returnKey.userClickOnReturnBlock();
        initPage.returnKey.checkThatAllElementsIsDisplayed();
        initPage.returnKey.clickOnFinalReturnButton();
    }
}