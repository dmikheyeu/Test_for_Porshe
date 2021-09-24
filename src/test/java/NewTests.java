
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
        initPage.reservationPage.receiveUniqueId();
        initPage.reservationPage.clickOnTheLogoImages();
        initPage.adminMenu.clickToAdminBlock();
//        initPage.adminMenu.entersUniqueNumbers(); нужно переписать!
        initPage.adminMenu.clickOnTheSuchenButton();
        initPage.adminMenu.keyboardIsInvisible();
        //check that Unique Number / Fach is Empty
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
        //добавить метод получения ИД
        initPage.returnKey.clickOnSaveButton();
        initPage.returnKey.clickOnAdminTab();
//        initPage.returnKey.checkThatUserSeeListOfKeysIsEpmty(String Id);
    }

    @Test
    @DisplayName( "Pick-up valid reservation (green key) via Scanner" )
    public void PickupValidReservationViaScanner() {
        openSite();
        mainPageIsOpen();
        initPage.blockBarcode.clickToBlockBarcode();
        initPage.reservationPage.clickOnTheNextButton();
        initPage.mainPageElements.logoPorshe.click();
        initPage.mainPageElements.blockAdmin.click();
        //взять Ид и сохранить
        //сравнить что ИД пустая
    }

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

    @Test
    @DisplayName( "Pick up key via Admin tab" )
    public void PickupKeyViaAdminTab() {
        openSite();
        mainPageIsOpen();
        initPage.adminMenu.clickToAdminBlock();
        initPage.adminMenu.clickToEntnahmeButton();
        initPage.reservationPage.receiveUniqueId();
        initPage.adminMenu.checkAdminEntnahmeTitle();
        initPage.returnKey.clickOnSaveButton();
//        initPage.returnKey
        //сравнить что ИД пустая
    }

    @Test
    @DisplayName( "Check Search on Admin tab" )
    public void CheckSearchOnAdminTab() {
        openSite();
        mainPageIsOpen();
        initPage.mainPageElements.blockAdmin.click();
        initPage.blockAdminElements.SearchFieldButton.click();
        initPage.adminMenu.clickToSearchFieldText();
        initPage.adminMenu.checkSearchFiledWorkedCorrectly();
        initPage.adminMenu.clickOnTheSuchenButton();
        //проверить что это значение подтянулось
    }

    @Test
    @DisplayName( "Pick-up reservation (yellow key) via \"My registration\" tab" )
    public void PickupReservationWithYellowKey() {
        openSite();
        mainPageIsOpen();
        initPage.mainPage.clickToReservationButton();
        initPage.reservationPage.clickOnReservationButton();
        //check that Reservation Page isn't opened
        //check that key is yellow
    }

    @Test
    @DisplayName( "Pick-up reservation (red key) via \"My registration\" tab" )
    public void PickupReservationWithRedKey() {
        openSite();
        mainPageIsOpen();
        initPage.mainPage.clickToReservationButton();
        initPage.reservationPage.clickOnReservationButton();
        //check that Reservation Page isn't opened
        //check that key is red
    }

    @Test
    @DisplayName( "Pick-up reservation (yellow key) via \"Scannen Barcode\" tab" )
    public void PickupReservationWithYellowKeyViaScannenBarcode() {
        openSite();
        mainPageIsOpen();
        initPage.mainPageElements.blockBarcode.click();
        initPage.reservationPage.clickOnReservationButton(); // не факт что здесь клик отработает
        //check that Reservation Page isn't opened
    }

    @Test
    @DisplayName( "Pick-up reservation (red key) via \"Scannen barcode\" tab" )
    public void PickupReservationWithRedKeyViaScannenBarcode() {
        openSite();
        mainPageIsOpen();
        initPage.mainPageElements.blockBarcode.click();
        initPage.reservationPage.clickOnReservationButton(); // не факт что здесь клик отработает
        //check that Reservation Page isn't opened
    }
}