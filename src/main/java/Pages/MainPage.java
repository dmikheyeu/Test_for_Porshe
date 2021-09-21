package Pages;

import SelenideElements.MainPageElements;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends DriverConfig {

    MainPageElements mainPageElements = new MainPageElements();

    @Step(value = "Open to site")
    public void openSite() {
        open("");

        if (!mainPageElements.IdUser.exists()) {
            mainPageElements.LogoPorshe.click();
            }
        else {}
    }

    @Step("Go to Reservation page")
    public MainPage clickToReservationButton() {
        mainPageElements.BlockReservation.click();

        return new BlockReservation().checkIsDisplayedPage();
    }
    //TODO Сменить вид локализации обьекта на общий
}