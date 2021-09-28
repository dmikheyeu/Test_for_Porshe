
import Pages.*;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


//@Step("User click on yellow key or reservation")
//public BlockReservation clickOnYellowKey() {
//        reservationElements.reservationButton.shouldNot().click();
//        return userSeeYellowKeyInBlockReservation();
//        }


public class NewTests extends MainPage {

    InitPage initPage = new InitPage();

    @Tag("Сравнить, что поле с Fach - пустое.")
    @Test
    @DisplayName("Pick-up valid reservation (green key) via \"My registration\" tab")
    public void PickupValidReservation(){
        openSite();
        mainPageIsOpen();
        clickToReservationButton();
        initPage.reservationPage.clickOnReservationButton();
        initPage.reservationPage.clickOnTheNextButton();
        initPage.reservationPage.seeDepotPopupWithText();
        String SavedId = initPage.reservationPage.receiveUniqueId();
        clickOnTheLogoImages();
        initPage.adminMenu.clickToAdminBlock();
        initPage.adminMenu.clickToSearchFieldText();
        initPage.adminMenu.entersUniqueNumbers(SavedId);
        initPage.adminMenu.clickOnTheSuchenButton();
        initPage.adminMenu.keyboardIsInvisible();
        //Сравнить, что поле с Fach - пустое.
    }

    @Tag("Сравнить, что поле с Fach - целое.")
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
        String SavedId = initPage.reservationPage.receiveUniqueId();
        initPage.mainPage.clickOnTheLogoImages();
        initPage.returnKey.clickOnAdminTab();
//        initPage.returnKey.checkThatUserSeeListOfKeysIsEmpty(SavedId);
        //Сравнить, что поле с Fach - целое.
    }

    @Tag("Сравнить, что поле с Fach - пустое.")
    @Test
    @DisplayName( "Pick-up valid reservation (green key) via Scanner" )
    public void PickupValidReservationViaScanner() {
        openSite();
        mainPageIsOpen();
        initPage.blockBarcode.clickToBlockBarcode();
        initPage.reservationPage.clickOnTheNextButton();
        String SavedId = initPage.reservationPage.receiveUniqueId();
        clickOnTheLogoImages();
        initPage.adminMenu.clickToAdminBlock();
        //Сравнить, что поле с Fach - пустое.
    }

    @Tag("Думаю что +- все проверки сделаны")
    @Test
    @DisplayName( "Check all 'Back' buttons" )
    public void CheckAllBackButtons() {
        openSite();
        mainPageIsOpen();
        initPage.mainPage.clickToReservationButton();
        initPage.mainPage.clickToBackButton();
        initPage.returnKey.clickToReservationButton();
        initPage.mainPage.clickToBackButton();
        initPage.adminMenu.clickToAdminBlock();
        initPage.mainPage.clickToBackButton();
        initPage.blockBarcode.clickToBlockBarcode();
        initPage.mainPage.clickToBackButton();
    }

    @Tag("Сравнить, что поле с Fach - пустое.")
    @Test
    @DisplayName( "Pick up key via Admin tab" )
    public void PickupKeyViaAdminTab() {
        openSite();
        mainPageIsOpen();
        initPage.adminMenu.clickToAdminBlock();
        initPage.adminMenu.clickToEntnahmeButton();
        initPage.adminMenu.checkAdminEntnahmeTitle();
        initPage.returnKey.clickOnSaveButton();
        String SavedId = initPage.reservationPage.receiveUniqueId();
        //Сравнить, что поле с Fach - пустое.
    }

    @Tag("Думаю что done")
    @Test
    @DisplayName( "Check Search on Admin tab" )
    public void CheckSearchOnAdminTab() {
        openSite();
        mainPageIsOpen();
        initPage.mainPageElements.blockAdmin.click();
        initPage.blockAdminElements.searchFieldButton.click();
        initPage.adminMenu.clickToSearchFieldText();
        initPage.adminMenu.enterValue69();
        initPage.adminMenu.clickOnTheSuchenButton();
        initPage.adminMenu.checkValue69InPickupDetailTable();
    }

    @Tag("Думаю что done")
    @Test
    @DisplayName( "Pick-up reservation (yellow key) via \"My registration\" tab" )
    public void PickupReservationWithYellowKey() {
        openSite();
        mainPageIsOpen();
        initPage.mainPage.clickToReservationButton();
        initPage.reservationPage.clickOnYellowKey();
    }

    @Tag("Думаю что done")
    @Test
    @DisplayName( "Pick-up reservation (red key) via \"My registration\" tab" )
    public void PickupReservationWithRedKey() {
        openSite();
        mainPageIsOpen();
        initPage.mainPage.clickToReservationButton();
        initPage.reservationPage.clickOnRedKey();
    }

    @Tag("Дописать проверки финальные")
    @Test
    @DisplayName( "Pick-up reservation (yellow key) via \"Scannen Barcode\" tab" )
    public void PickupReservationWithYellowKeyViaScannenBarcode() {
        openSite();
        mainPageIsOpen();
        initPage.mainPageElements.blockBarcode.click();
        initPage.reservationPage.clickOnReservationButton();
    }

    @Tag("Дописать проверки финальные")
    @Test
    @DisplayName( "Pick-up reservation (red key) via \"Scannen barcode\" tab" )
    public void PickupReservationWithRedKeyViaScannenBarcode() {
        openSite();
        mainPageIsOpen();
        initPage.mainPageElements.blockBarcode.click();
        initPage.reservationPage.clickOnReservationButton();
    }
}