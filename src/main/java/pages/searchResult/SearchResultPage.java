package pages.searchResult;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {


    ElementsCollection tabletsCategories = $$(".clearfix.sprite-side ");

    public SelenideElement getFirst() {
        return tabletsCategories.first();
    }

}
