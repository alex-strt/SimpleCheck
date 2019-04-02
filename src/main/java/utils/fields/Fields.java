package utils.fields;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static utils.PropertiesReader.readFromTheFile;

public class Fields implements Field {


    private String getPathToThis() {
        return System.getProperty("user.dir") + "\\src\\main\\java\\" + this.getClass().getName().replace(".", "\\") + ".properties";
    }

    @Override
    public String getResources(String data) {
        try {
            return readFromTheFile(getPathToThis(), data);
        } catch (IOException e) {
            System.out.println("Cannot find the file" + e);
            return null;
        }
    }

    @Override
    public SelenideElement field(String locator) {
        System.out.println("Show field\n" +
                "Locator\n" + getResources(locator));
        return $(By.xpath(getResources(locator)));
    }

    @Override
    public ElementsCollection fields(String locator) {
        System.out.println("Show fields\n" +
                "Locator\n" + getResources(locator));
        return $$(By.xpath(getResources(locator)));
    }

    @Override
    public ElementsCollection getChildren(String parent, int id, String child) {
        String locator = getResources(parent) + "[" + id + "]" + getResources(child);
        System.out.println("Show field with children\n" +
                "Locator\n" + locator);
        return $$(By.xpath(locator));
    }

    @Override
    public SelenideElement getChild(String parent, int id, String child) {
        String locator = getResources(parent) + "[" + id + "]" + getResources(child);
        System.out.println("Show field with child\n" +
                "Locator\n" + locator);
        return $(By.xpath(locator));
    }
}
