package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Url("/cart")
@Getter
public class CartPage extends WebPage {

    @Getter
    @Css(".item__name")
    private static WebElement itemName;

    @Getter
    @XPath("//strong[text()='Size:']/following-sibling::span")
    public static WebElement itemSize;

    @Getter
    @Css("#quantity_0")
    public static WebElement itemQuantity;

    @Getter
    @Css(".item__list--item .item__price")
    public static WebElement itemPrice;
}
