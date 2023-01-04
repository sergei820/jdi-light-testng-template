package org.mytests.uiobjects.example.model;

import org.mytests.uiobjects.example.site.pages.CartPage;
import org.mytests.uiobjects.example.site.sections.AddToCartForm;

public class ProductItemFactory {

    //CartPage cartPage = new CartPage();

    public static ProductItem getProductToBeAddedToCart() {
        return new ProductItem(
                AddToCartForm.getItemName().getText(),
                AddToCartForm.getItemSize().getText(),
                AddToCartForm.getItemQuantity().getText(),
                AddToCartForm.getItemPrice().getText()
        );
    }

    public static ProductItem getAddedToCartItem() {
        return new ProductItem(
                CartPage.getItemName().getText(),
                CartPage.getItemSize().getText(),
                CartPage.getItemQuantity().getAttribute("value"),
                CartPage.getItemPrice().getText()
        );
    }
}
