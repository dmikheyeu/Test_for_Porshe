package SelenideElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BlockReturnElements {

    public SelenideElement clickOnTheLogoImages = $x("//*[contains(@src, 'public/images/logo.png')]");
    public SelenideElement pickupListItem = $x("//*[contains(@class, 'pickup-list-item pickup-status2')]");
    public SelenideElement headerTitle = $x("//*[contains(@class, 'header-title')]");
    public SelenideElement carKeyButton = $x("//*[contains(@class, 'return-btn-small return-btn-key')]");
    public SelenideElement blockReturnButton = $x("//*[contains(@class, 'btn-block return-btn')]");
    public SelenideElement backButton = $x("//*[contains(text(), 'ZURÜCK')]");
    public SelenideElement finalReturnButton = $x("//*[contains(@id, 'nextbutton')]");
    public SelenideElement centerYellowButton = $x("//*[contains(@id, 'temp_res')]");

}
