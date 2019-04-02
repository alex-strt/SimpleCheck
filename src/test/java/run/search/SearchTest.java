package run.search;

import configs.RozApp;
import org.testng.annotations.Test;

public class SearchTest extends RozApp {


    @Test
    public void searchTablet() {
        homepage.getSearchInput().val("tablet").pressEnter();
        searchResultPage.getFirst().click();
        storePage.getBlock(0).hover();
        storePage.getBlockContent(1).hover();
        storePage.getBlockContent(2).hover();
        storePage.getBlockContent(3).hover();
        storePage.getBlockContent(4).hover();

        System.out.println(" ololo");
    }
}
