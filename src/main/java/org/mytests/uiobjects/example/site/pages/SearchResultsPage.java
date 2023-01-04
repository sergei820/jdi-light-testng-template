package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import org.openqa.selenium.WebElement;

import java.util.List;

@Url("search/")
public class SearchResultsPage extends WebPage {

    public static final String SEARCH_RESULTS = "//ul[@class='product__listing product__grid']/div[REPLACE]";
    public static final String ADD_TO_CART_FROM_GRID = "/div[@class='addtocart']//form[@class='add_to_cart_form']";

    @Css(".results>h1")
    public static WebElement searchResultsMessage;

    @XPath("//ul[@class='product__listing product__grid']/div")
    public static List<WebElement> searchResults;
}
