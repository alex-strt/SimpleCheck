package configs;

import pages.homepage.Homepage;
import pages.searchResult.SearchResultPage;
import pages.store.StorePage;

public class RozApp extends BeforeClass{

    public Homepage homepage = new Homepage();
    public SearchResultPage searchResultPage = new SearchResultPage();
    public StorePage storePage = new StorePage();
}
