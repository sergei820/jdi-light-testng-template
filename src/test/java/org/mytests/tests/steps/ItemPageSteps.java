package org.mytests.tests.steps;

import org.mytests.uiobjects.example.model.ProductItem;

import static org.mytests.tests.steps.SearchResultsPageSteps.itemOnSearchResultsPage;
import static org.mytests.uiobjects.example.model.ProductItemFactory.getItemOnSearchResultsPage;
import static org.mytests.uiobjects.example.model.ProductItemFactory.getItemParametersOnItemPage;
import static org.testng.AssertJUnit.assertEquals;

public class ItemPageSteps {

    public ProductItem itemPageProductItem;

    public void compareSearchedItemWithItemOnItemPage() {
        itemPageProductItem = getItemParametersOnItemPage();
        assertEquals(itemOnSearchResultsPage.getName().substring(0, 24), itemPageProductItem.getName().substring(0, 24));
        assertEquals(itemOnSearchResultsPage.getPrice(), itemPageProductItem.getPrice());
    }
}
