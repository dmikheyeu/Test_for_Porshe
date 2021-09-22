package PagesElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BlockReservationElements {

    public SelenideElement TitlePage = $x("//*[contains(text(), 'Abholung')]");
    public SelenideElement pickupListItemWithGreenKey = $x("//*[contains(@class,'pickup-list-item pickup-status2')]");
    public SelenideElement pickupListItemWithYellowKey = $x("//*[contains(@class,'pickup-list-item pickup-status3')]");
    public SelenideElement greenKey = $x("//*[contains(@src,'public/images/key-green.png')]");
    public SelenideElement reservationButton = $(byText("Reserviert"));
    public SelenideElement reservationPickupContentWholePage = $x("//*[contains(@class,'pickup-content')]");
    public SelenideElement reservationPickupContentMaps = $x("//*[contains(@class,'ol-viewport')]");
    public SelenideElement reservationPickupContentWholeForm = $x("//*[contains(@class,'pickup-form')]");
    public SelenideElement reservationPickupContentBackButton = $x("//*[contains(@class,'btn btn-secondary btn-lg mb-4')]");
    public SelenideElement reservationPickupContentNextButton = $x("//*[contains(@class,'footer-block-right')]");
    public SelenideElement checkThatUserSeeDepotPopup = $x("//*[contains(@class, 'pickup-detail-popup')]");
    public SelenideElement checkThatUserSeeUniqueId = $x("//*[@id=\"depotMessage\"]/b");
}
