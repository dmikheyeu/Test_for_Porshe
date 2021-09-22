package PagesElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BlockAdminElements {


    public SelenideElement HeaderTitle = $x("//*[contains(text(),'ADMIN Verwaltung')]");
    public SelenideElement SearchFieldText = $x("//*[contains(@id,'searchFieldText')]");
    public SelenideElement SearchFieldButton = $x("//*[contains(@class,'search-field_button')]");
    public SelenideElement PickupTableHeader = $x("//*[contains(@class,'pickup-table-header')]");
    public SelenideElement DepotStringWithInfo = $x("//html/body/div[2]/div/div[2]/div[2]/table/tbody/tr[1]");
    public SelenideElement DepotUniqueNumber = $x("//*[@id=\"depotMessage\"]/b");
}