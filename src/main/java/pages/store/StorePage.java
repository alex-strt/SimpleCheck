package pages.store;

import com.codeborne.selenide.SelenideElement;
import utils.fields.Fields;

public class StorePage extends Fields {

    public SelenideElement getBlock(Integer number) {
        return fields("StoreElementBlock").get(number);
    }

    public SelenideElement getBlockContent(Integer number) {
        return getBlock(number);
    }
}
