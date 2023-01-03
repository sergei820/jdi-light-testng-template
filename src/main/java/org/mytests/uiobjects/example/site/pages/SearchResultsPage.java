package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import org.openqa.selenium.WebElement;

@Url("/search/?text=shirt")
public class SearchResultsPage extends WebPage {

    @Css(".results>h1")
    public static WebElement searchResultsMessage;
}
