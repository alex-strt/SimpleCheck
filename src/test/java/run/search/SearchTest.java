package run.search;

import configs.RozApp;
import org.testng.annotations.Test;

public class SearchTest extends RozApp {


    @Test
    public void searchTablet() {
        homepage.getSearchInput().val("tablet").pressEnter();
        searchResultPage.getFirst().click();
        storePage.getBlockByNumber(0).hover();
        storePage.getBlockCompareIcon(1).hover();

        storePage.getBlockCompareIcon(0);

        System.out.println(" ololo");
    }
}
