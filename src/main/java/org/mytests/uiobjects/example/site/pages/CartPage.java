package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import javax.swing.*;

@Url("cart")
@Data
@Getter
public class CartPage extends WebPage {

    @Getter
    @Css(".item__name")
    private static WebElement itemName;

    @Getter
    @Css("//strong[text()='Size:']/following-sibling::span")
    public static WebElement itemSize;

    @Getter
    @Css("#quantity_0")//get "value" attribute value
    public static WebElement itemQuantity;

    @Getter
    @Css(".item__price")
    public static WebElement itemPrice;
}
