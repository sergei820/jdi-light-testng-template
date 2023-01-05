package org.mytests.uiobjects.example.model;

import lombok.Data;

@Data
public class ProductItem {

    String name, size, quantity, price;

    public ProductItem(String name, String size, String quantity, String price) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public ProductItem(String name, String price) {
        this.name = name;
        this.price = price;
    }

}
