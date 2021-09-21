package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends DriverConfig {

    @Step(value = "Open to site")
    public void openSite() {
        open("");

        if (!IdUser.exists()) {
            LogoPorshe.click();
            }
        else {}
    }

    @Step("Go to Reservation page")
    public MainPage clickToReservationButton() {
        BlockReservation.click();

        return new BlockReservation().checkIsDisplayedPage();
    }

//    @Step("Go to Menu page")
//    public void ClickToMenu() {
//        BlockMenu.click();
//    }

//    @Step("Go to Code Check page")
//    public void ClickToCodeCheck() {
//        BlockCodeCheck.click();
//    }

    //Locators

    public SelenideElement LogoPorshe = $x("//*[contains(@src,'logo.png')]");
    public SelenideElement BlockMenu = $(byText("Meine"));
    public SelenideElement BlockCodeCheck = $x("//*[contains(text(),'Schlüssel und')]");
    public SelenideElement BlockReservation = $x("//*[contains(text(),'Meine')]");

    public SelenideElement IdUser =  $x("//div[2]/div[3]/p[contains(text(), 'P32')]");

    public SelenideElement ButtonBack = $x("//*[contains(text(), 'ZURÜCK')]");
    public SelenideElement TittlePage = $x("//*[contains(text(), 'Abholung')]");


    //TODO Сменить вид локализации обьекта на общий
}