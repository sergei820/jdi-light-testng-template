package org.mytests.tests.steps;

import org.mytests.uiobjects.example.model.ProductItem;

import static org.mytests.uiobjects.example.model.ProductItemFactory.getProductToBeAddedToCart;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.addToCartLayerHeader;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.checkoutButton;
import static org.testng.Assert.assertEquals;

public class AddToCartFormSteps {

    public static ProductItem itemToBuy;
    public static ProductItem itemOnSearchResultsPage;

    public void checkPopupText(String popupText) {
        assertEquals(addToCartLayerHeader.getText(), popupText);
    }

    public void rememberItemParameters() {
        itemToBuy = getProductToBeAddedToCart();
    }

    public void rememberItemParametersOnSearchResultsPage() {
        itemToBuy = getProductToBeAddedToCart();
    }

    public void checkOut() {
        checkoutButton.click();
    }
}
