package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.mytests.uiobjects.example.site.pages.BasePage.compileLocator;

@Url("search/")
public class SearchResultsPage extends WebPage {

    public static final String SEARCH_RESULTS = "//ul[@class='product__listing product__grid']/div[REPLACE]";
    public static final String ADD_TO_CART_FROM_GRID = "/div[@class='addtocart']//form[@class='add_to_cart_form']";
    public static final String PRODUCT_NAME = "//div[@class='product-item'][REPLACE]//a[@class='name']";
    public static final String PRODUCT_PRICE = "//div[@class='product-item'][REPLACE]//div[@class='price']";

    @UI(".results>h1")
    public static WebElement searchResultsMessage;

    @UI("*[class='product__listing product__grid'] > div")
    public static List<WebElement> searchResults;

    public String getProductNameForItemNumber(int itemNumber) {
        return $(compileLocator(PRODUCT_NAME, String.valueOf(itemNumber))).getText();
    }

    public String getProductPriceForItemNumber(int itemNumber) {
        return $(compileLocator(PRODUCT_PRICE, String.valueOf(itemNumber))).getText();
    }
}
