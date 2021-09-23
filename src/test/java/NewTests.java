
import Pages.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class NewTests extends MainPage {

    InitPage initPage = new InitPage();

    @Test
    @DisplayName("Pick-up valid reservation (green key) via \"My registration\" tab")
    public void PickupValidReservation(){
        openSite();
        mainPageIsOpen();
        clickToReservationButton();
        initPage.reservationPage.clickOnReservationButton();
        initPage.reservationPage.clickOnTheNextButton();
        initPage.reservationPage.seeDepotPopupWithText();
        initPage.reservationPage.clickOnTheLogoImages();
        initPage.adminMenu.clickToAdmin();
    }

    @Test
    @DisplayName( "User returns key" )
    public void ReturnKey() {
        openSite();
        mainPageIsOpen();
        initPage.returnKey.clickOnReturnBlock();
        initPage.returnKey.clickOnFinalReturnButton();
        initPage.returnKey.clickOnConfirmLocationPopup();
        initPage.returnKey.clickOnFullstand();
        initPage.returnKey.clickOnSaveButton();
    }
}