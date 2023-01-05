package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import lombok.Data;
import org.openqa.selenium.WebElement;

@Data
public class ItemPage extends WebPage {

    @Css("div[class='product-details page-title'] .name")
    private WebElement itemName;

    @Css(".product-details .price")
    private WebElement itemPrice;
}
