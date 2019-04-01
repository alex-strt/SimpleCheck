package pages.homepage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Homepage {

    SelenideElement searchInput = $("[name='search']");

    public SelenideElement getSearchInput() {
        return searchInput;
    }
}
