package utils.fields;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.io.IOException;

public interface Field {

    String getResources(String data) throws IOException;

    SelenideElement field(String locator) throws IOException;

    ElementsCollection fields(String locator) throws IOException;
}
