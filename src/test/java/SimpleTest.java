
import Pages.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SimpleTest extends MainPage {

    InitPage initPage = new InitPage();

    @Test
    @DisplayName("Pick-up valid reservation (green key) via \"My registration\" tab")
    public void GotoAdminPanel(){
        openSite();
        clickToReservationButton();
        initPage.reservationPage.checkIsDisplayedPage();
        initPage.reservationPage.checkThatKeyIsGreen();
        initPage.reservationPage.clickOnReserveitionButton();
        initPage.reservationPage.reservationDetailsPage();
        initPage.reservationPage.userClickOnTheNextButton();
        initPage.reservationPage.userSeeDepotPopupWithText();
        initPage.reservationPage.userClickOnTheLogoImages();
        initPage.adminMenu.clickToAdmin();
        initPage.adminMenu.checkThatUserSeeListOfKeys();
        initPage.adminMenu.checkThatHorizontalLineIsNonEmpty();
        initPage.adminMenu.checkThatHorizontalLineIsEmpty();
//        initPage.adminMenu.clickToBackButton(); открывается какое-то говно после нажатия на BACK button
        initPage.returnKey.userClickOnTheLogoImages();
        initPage.returnKey.userClickOnReturnBlock();
        initPage.returnKey.checkThatAllElementsIsDisplayed();
        initPage.returnKey.clickOnFinalReturnButton();
    }

    @Test
    @DisplayName("ASdasdas")
    public void newTest(){

    }
    @Test
    @DisplayName("ASdasdas")
    public void newTe21st(){

    }
    @Test
    @DisplayName("ASdasdas")
    public void new123Test(){

    }
}