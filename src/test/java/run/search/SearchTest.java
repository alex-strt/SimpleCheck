package run.search;

import configs.RozApp;
import org.testng.annotations.Test;

public class SearchTest extends RozApp {


    @Test
    public void searchTablet() {
        homepage.getSearchInput().val("tablet").pressEnter();
        searchResultPage.getFirst().click();
        storePage.getBlock(1).hover();
//        storePage.getBlockContent(1).click();
//        storePage.getBlockContent(2).hover();
//        storePage.getBlockContent(2).click();
//        storePage.getBlockContent(2).click();

        System.out.println(" ololo");
    }
}
