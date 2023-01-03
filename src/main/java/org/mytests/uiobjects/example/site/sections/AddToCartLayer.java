package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import org.openqa.selenium.WebElement;

public class AddToCartLayer {

    @Css("#cboxTitle span")
    public static WebElement addToCartLayerHeader;

    @Css("#cboxLoadedContent .name")
    public static WebElement itemName;

    @Css("#cboxLoadedContent .qty")
    public static WebElement itemQuantity;

    @Css("#cboxLoadedContent .itemSize")
    public static WebElement itemSize;

    @Css("#cboxLoadedContent .price")
    public static WebElement itemPrice;

    @Css("#cboxLoadedContent a[class~=add-to-cart-button]")
    public static WebElement checkoutButton;
}
