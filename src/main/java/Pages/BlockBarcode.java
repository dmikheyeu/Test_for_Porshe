package Pages;

import PagesElements.MainPageElements;
import io.qameta.allure.Step;

public class BlockBarcode {
    MainPageElements mainPageElements = new MainPageElements();

    @Step ( "User click on Barcode Block" )
    public void clickToBlockBarcode() {
        mainPageElements.blockBarcode.click();
    }
}
