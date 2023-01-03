package org.mytests.uiobjects.example.model;

import org.mytests.uiobjects.example.site.pages.CartPage;
import org.mytests.uiobjects.example.site.sections.AddToCartForm;

import static org.mytests.uiobjects.example.site.sections.AddToCartForm.itemName;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.itemPrice;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.itemQuantity;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.itemSize;

public class ProductItemFactory {

    //CartPage cartPage = new CartPage();

    public static ProductItem getProductToBeAddedToCart() {
        return new ProductItem(AddToCartForm.getItemName().getText(), itemSize.getText(), itemQuantity.getText(), itemPrice.getText());
    }

    public static ProductItem getAddedToCartItem() {
        return new ProductItem(
                CartPage.getItemName().getText(),
                CartPage.getItemSize().getText(),
                CartPage.getItemQuantity().getCssValue("value"),
                CartPage.getItemPrice().getText()
        );
    }
}
