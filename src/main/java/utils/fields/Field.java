package utils.fields;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


public interface Field {

    String getResources(String data);

    SelenideElement field(String locator);

    ElementsCollection fields(String locator);

    ElementsCollection getChildren(String parent, String child);

    SelenideElement getChild(String parent, String child);
}
