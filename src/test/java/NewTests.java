
import Pages.*;
import com.sun.tools.sjavac.comp.PubapiVisitor;
import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;
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
        String IdUniqueblablbala = initPage.reservationPage.test();
        initPage.reservationPage.clickOnTheLogoImages();
        initPage.adminMenu.clickToAdmin();
        initPage.reservationPage.metodnazoviSravnivaetStringu(IdUniqueblablbala);
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
//        initPage.barcodePage.clickOnBarcodeBlock();
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

    }

    @Test
    @DisplayName( "Pick up key via Admin tab" )
    public void PickupKeyViaAdminTab() {
        openSite();
        mainPageIsOpen();
        initPage.mainPageElements.blockAdmin.click();
        initPage.blockAdminElements.enthanButton.click();
        initPage.blockAdminElements.informationPopupAfterEnthan.click();
        //взять Ид и сохранить
        //сравнить что ИД пустая
    }

    @Test
    @DisplayName( "Check Search on Admin tab" )
    public void CheckSearchOnAdminTab() {
        openSite();
        mainPageIsOpen();
        initPage.mainPageElements.blockAdmin.click();
        initPage.blockAdminElements.SearchFieldButton.click();
        //ввести любое значение
        //проверить что это значение пожтянулось
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