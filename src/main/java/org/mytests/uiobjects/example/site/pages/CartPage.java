package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Url("/cart")
@Getter
public class CartPage extends WebPage {

    @Getter
    @UI(".item__name")
    private static WebElement itemName;

    @Getter
    @UI("//strong[text()='Size:']/following-sibling::span")
    public static WebElement itemSize;

    @Getter
    @UI("#quantity_0")
    public static WebElement itemQuantity;

    @Getter
    @UI(".item__list--item .item__price")
    public static WebElement itemPrice;

    @UI("span[class='glyphicon glyphicon-option-vertical']")
    public static WebElement itemAction;

    @UI("//a[text()='Remove']")
    public static WebElement removeItemFromCartButton;
}
