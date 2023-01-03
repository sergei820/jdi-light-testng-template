package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Data
public class AddToCartForm {

    @Css("#cboxTitle span")
    public static WebElement addToCartLayerHeader;

    @Getter
    @Css("#cboxLoadedContent .name")
    public static WebElement itemName;

    @Getter
    @Css("#cboxLoadedContent .qty")
    public static WebElement itemQuantity;

    @Getter
    @Css("#cboxLoadedContent .itemSize")
    public static WebElement itemSize;

    @Getter
    @Css("#cboxLoadedContent .price")
    public static WebElement itemPrice;

    @Css("#cboxLoadedContent a[class~=add-to-cart-button]")
    public static WebElement checkoutButton;
}
