package Pages;

import PagesElements.BlockAdminElements;
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
        blockAdminElements.searchFieldText.click();
        return keyboardDisplayed();
    }

    @Step ( "User see displayed KeyBoard" )
    public BlockAdmin keyboardDisplayed() {
        blockAdminElements.keyBoard.shouldHave().isDisplayed();
        return this;
    }

    @Step ( "User enters Unique number" )
    public void entersUniqueNumbers() {
        blockAdminElements.keyBoard.sendKeys(blockReservation.receiveUniqueId());
        System.out.println(blockReservation.receiveUniqueId());
    }

    @Step ("Check that List of keys is displayed")
    public BlockAdmin checkThatUserSeeListOfKeys() {
        blockAdminElements.adminHeaderTitle.shouldHave().isDisplayed();
        blockAdminElements.searchFieldText.shouldHave().isDisplayed();
        blockAdminElements.searchFieldButton.shouldHave().isDisplayed();
        blockAdminElements.pickupTableHeader.shouldHave().isDisplayed();
        blockAdminElements.depotStringWithInfo.shouldHave().isDisplayed();

        return this;
    }

    @Step ( "User click on 'Suchen' button" )
    public void clickOnTheSuchenButton() {

        blockAdminElements.suchenButton.click();
    }

    @Step ( "Check that KeyBoard is invisible" )
    public void keyboardIsInvisible() {

        blockAdminElements.keyBoard.shouldNotBe().isDisplayed();
    }

    @Step ( "User click on 'Entnahme' button" )
    public void clickToEntnahmeButton() {

        blockAdminElements.entnahmeButton.click();
    }

    @Step ( "User see Admin Entnahme Title" )
    public void checkAdminEntnahmeTitle() {

        blockAdminElements.adminEntnahmeTitle.shouldHave().isDisplayed();
    }

    @Step ( "Check that search result worked correctly" )
    public void checkSearchFiledWorkedCorrectly() {

        blockAdminElements.searchKeypad.sendKeys("69");
    }
}