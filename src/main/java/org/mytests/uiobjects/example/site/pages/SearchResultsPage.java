package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import org.openqa.selenium.WebElement;

import java.util.List;

@Url("/search/?text=shirt")
public class SearchResultsPage extends WebPage {

    @Css(".results>h1")
    public static WebElement searchResultsMessage;

    @Css("ul[class='product__listing product__grid']>div>a")
    public static List<WebElement> searchResults;
}
