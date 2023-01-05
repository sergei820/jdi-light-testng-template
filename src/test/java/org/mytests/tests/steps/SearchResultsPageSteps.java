package org.mytests.tests.steps;

import org.openqa.selenium.WebElement;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.mytests.tests.steps.BasePageSteps.compileLocator;
import static org.mytests.uiobjects.example.model.ProductItemFactory.getItemOnSearchResultsPage;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.ADD_TO_CART_FROM_GRID;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.PRODUCT_NAME;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.PRODUCT_PRICE;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.SEARCH_RESULTS;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.searchResults;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.searchResultsMessage;
import static org.testng.Assert.assertEquals;

public class SearchResultsPageSteps {

    public void checkSearchResultHeader(String searchResultHeader) {
        assertEquals(searchResultsMessage.getText(), searchResultHeader);
    }

    public void addItemToCart(String itemType) {
        String shirtItemLocator = null;
        /*WebElement shirtItem;
        shirtItem = searchResults
                .stream()
                .filter(item -> item.getText().contains(itemType))
                .findFirst()
                .orElse(null);
        shirtItem.click();*/
        for(int i = 1; i < searchResults.size(); i++) {
            WebElement itemInGrid = $(compileLocator(SEARCH_RESULTS, String.valueOf(i)) + "/a");
            if(itemInGrid.getAttribute("title").contains(itemType)) {
                shirtItemLocator = compileLocator(SEARCH_RESULTS, String.valueOf(i));
                break;
            }
        }
        $(shirtItemLocator + ADD_TO_CART_FROM_GRID).click();
    }

    public void rememberItemParameters(int itemNumber) {
        getItemOnSearchResultsPage(itemNumber);
    }
}
