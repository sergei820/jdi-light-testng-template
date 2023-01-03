package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import lombok.Data;
import org.openqa.selenium.WebElement;

@Url("cart")
@Data
public class CartPage extends WebPage {

    @Css(".item__name")
    public WebElement itemName;

    @Css("//strong[text()='Size:']/following-sibling::span")
    public WebElement itemSize;

    @Css("#quantity_0")//get "value" attribute value
    public WebElement itemQuantity;

    @Css(".item__price")
    public WebElement itemPrice;
}
