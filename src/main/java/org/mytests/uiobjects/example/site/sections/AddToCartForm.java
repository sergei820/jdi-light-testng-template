package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Data
public class AddToCartForm extends WebPage {

    @UI("#cboxTitle span")
    public static WebElement addToCartLayerHeader;

    @Getter
    @UI("#cboxLoadedContent .name")
    public static WebElement itemName;

    @Getter
    @UI("#cboxLoadedContent .qty")
    public static WebElement itemQuantity;

    @Getter
    @UI("#cboxLoadedContent .itemSize")
    public static WebElement itemSize;

    @Getter
    @UI("#cboxLoadedContent .price")
    public static WebElement itemPrice;

    @UI("#cboxLoadedContent a[class~=add-to-cart-button]")
    public static WebElement checkoutButton;
}
