package org.mytests.uiobjects.example.model;

import static org.mytests.uiobjects.example.site.sections.AddToCartLayer.itemName;
import static org.mytests.uiobjects.example.site.sections.AddToCartLayer.itemPrice;
import static org.mytests.uiobjects.example.site.sections.AddToCartLayer.itemQuantity;
import static org.mytests.uiobjects.example.site.sections.AddToCartLayer.itemSize;

public class ProductItemFactory {

    public static ProductItem createAddedToCartProduct() {
        return new ProductItem(itemName.getText(), itemSize.getText(), itemQuantity.getText(), itemPrice.getText());
    }
}
