package Pages;

import PagesElements.MainPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class BlockBarcode {
    MainPageElements mainPageElements = new MainPageElements();

    @Step ( "User click on Barcode Block" )
    public void clickToBlockBarcode() {

        mainPageElements.blockBarcode.click();
        mainPageElements.blockBarcode.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }
}
