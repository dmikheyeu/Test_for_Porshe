package SelenideElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {
    public SelenideElement LogoPorshe = $x("//*[contains(@src,'logo.png')]");
    public SelenideElement BlockMenu = $(byText("Meine"));
    public SelenideElement BlockCodeCheck = $x("//*[contains(text(),'Schlüssel und')]");
    public SelenideElement BlockReservation = $x("//*[contains(text(),'Meine')]");
    public SelenideElement IdUser =  $x("//div[2]/div[3]/p[contains(text(), 'P32')]");
    public SelenideElement ButtonBack = $x("//*[contains(text(), 'ZURÜCK')]");
    public SelenideElement TittlePage = $x("//*[contains(text(), 'Abholung')]");
}
