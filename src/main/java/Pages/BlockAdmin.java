package Pages;

import PagesElements.BlockAdminElements;
import PagesElements.BlockReservationElements;
import io.qameta.allure.Step;

public class BlockAdmin extends MainPage{

    BlockAdminElements blockAdminElements = new BlockAdminElements();
    BlockReservation blockReservation = new BlockReservation();

    @Step ("Go to Admin page")
    public BlockAdmin clickToAdminBlock() {
        mainPageElements.blockAdmin.click();

        return checkThatUserSeeListOfKeys();
    }

    @Step ( "User click on Search Field" )
    public BlockAdmin clickToSearchFieldText() {
        blockAdminElements.SearchFieldText.click();
        return keyboardDisplayed();
    }

    @Step ( "User see displayed KeyBoard" )
    public BlockAdmin keyboardDisplayed() {
        blockAdminElements.KeyBoard.shouldHave().isDisplayed();
        return this;
    }

    @Step ( "User enters Unique number" )
    public void entersUniqueNumbers() {
        blockAdminElements.KeyBoard.sendKeys(blockReservation.receiveUniqueId());
        System.out.println(blockReservation.receiveUniqueId());
    }

    @Step ("Check that List of keys is displayed")
    public BlockAdmin checkThatUserSeeListOfKeys() {
        blockAdminElements.HeaderTitle.shouldHave().isDisplayed();
        blockAdminElements.SearchFieldText.shouldHave().isDisplayed();
        blockAdminElements.SearchFieldButton.shouldHave().isDisplayed();
        blockAdminElements.PickupTableHeader.shouldHave().isDisplayed();
        blockAdminElements.DepotStringWithInfo.shouldHave().isDisplayed();

        return this;
    }

    @Step ( "User click on 'Suchen' button" )
    public void clickOnTheSuchenButton() {
        blockAdminElements.SuchenButton.click();
    }

    @Step ( "Check that KeyBoard is invisible" )
    public void keyboardIsInvisible() {
        blockAdminElements.KeyBoard.shouldNotBe().isDisplayed();
    }

    @Step ( "User click on 'Entnahme' button" )
    public void clickToEntnahmeButton() {
        blockAdminElements.EntnahmeButton.click();
    }

    @Step ( "User see Admin Entnahme Title" )
    public void checkAdminEntnahmeTitle() {
        blockAdminElements.AdminEntnahmeTitle.shouldHave().isDisplayed();
    }

    @Step ( "Check that search result worked correctly" )
    public void checkSearchFiledWorkedCorrectly() {
        blockAdminElements.SearchKeypad.sendKeys("69");
    }
}