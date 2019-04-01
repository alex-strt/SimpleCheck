package utils.fields;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PropertiesReader;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Fields implements Field {


    public String getPathToThis() {
//        return System.getProperty("user.dir") + "\\src\\main\\java\\" + this.getClass().getName().replace(".", "\\");
        String a = System.getProperty("user.dir") + "\\src\\main\\java\\pages\\store\\StorePage";
        System.out.println(a);
        return a;
    }

    private Properties loginData = PropertiesReader.readProperties(getPathToThis() + ".properties");

    @Override
    public String getResources(String data) {
        return loginData.getProperty(data);
//        return null;
    }

    @Override
    public SelenideElement field(String locator) {
        return $(By.xpath(getResources(locator)));
    }

    @Override
    public ElementsCollection fields(String locator) {
        return $$(By.xpath(getResources(locator)));
    }
}
