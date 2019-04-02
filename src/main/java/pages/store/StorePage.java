package pages.store;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.fields.Fields;

public class StorePage extends Fields {

    public ElementsCollection getBlock() {
        return fields("StoreElementBlock");
    }

    public SelenideElement getBlockByNumber(Integer number) {
        return fields("StoreElementBlock").get(number);
    }

    public SelenideElement getBlockCompareIcon(Integer number) {
        return getChild("StoreElementBlock", "CompareIcon");
    }
}
