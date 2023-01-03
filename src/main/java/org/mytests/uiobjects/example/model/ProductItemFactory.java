package org.mytests.uiobjects.example.model;

import org.mytests.uiobjects.example.site.pages.CartPage;

import static org.mytests.uiobjects.example.site.sections.AddToCartForm.itemName;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.itemPrice;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.itemQuantity;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.itemSize;

public class ProductItemFactory {

    CartPage cartPage = new CartPage();

    public static ProductItem getProductToBeAddedToCart() {
        return new ProductItem(itemName.getText(), itemSize.getText(), itemQuantity.getText(), itemPrice.getText());
    }


}
