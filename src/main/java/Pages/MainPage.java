package Pages;

import PagesElements.MainPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends DriverConfig {

    MainPageElements mainPageElements = new MainPageElements();

    @Step( "Open to site" )
    public void openSite() {
        open("");

        if (!mainPageElements.idUser.exists()) {
            mainPageElements.logoPorshe.click();
            }
        else {}
    }

    @Step ( "Check that Main Page is open" )
    public void mainPageIsOpen() {
        mainPageElements.idUser.shouldHave().isDisplayed();
        mainPageElements.blockReservation.shouldHave().isDisplayed();
        mainPageElements.blockReturn.shouldHave().isDisplayed();
        mainPageElements.blockAdmin.shouldHave().isDisplayed();
        mainPageElements.blockBarcode.shouldHave().isDisplayed();
        mainPageElements.logoPorshe.shouldHave().isDisplayed();
    }

    @Step ( "Go to Reservation page" )
    public MainPage clickToReservationButton() {
        mainPageElements.blockReservation.click();

        return new BlockReservation().checkIsDisplayedPage();
    }

    @Step ( "User click on 'Back' button" )
    public void clickToBackButton() {

        mainPageElements.backButton.click();
    }

    @Step ( "User click on the Logo Images" )
    public void clickOnTheLogoImages() {

        mainPageElements.logoPorshe.click();
        mainPageElements.logoPorshe.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }
}