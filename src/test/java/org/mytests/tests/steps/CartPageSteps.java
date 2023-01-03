package org.mytests.tests.steps;

import org.mytests.uiobjects.example.model.ProductItem;
import org.mytests.uiobjects.example.site.pages.CartPage;

public class CartPageSteps {

    CartPage cartPage = new CartPage();

    public ProductItem getAddedToCartItem() {
        return new ProductItem(
            cartPage.getItemName().getText(),
            cartPage.getItemSize().getText(),
            cartPage.getItemQuantity().getCssValue("value"),
            cartPage.getItemPrice().getText()
        );
    }
}
