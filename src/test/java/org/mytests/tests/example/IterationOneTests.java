package org.mytests.tests.example;

import com.epam.jdi.light.elements.composite.WebPage;
import org.mytests.tests.TestsInit;
import org.mytests.tests.testng.TestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.homePage;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.searchResultsMessage;
import static org.mytests.uiobjects.example.site.sections.MainHeader.searchButton;
import static org.mytests.uiobjects.example.site.sections.MainHeader.searchInput;
import static org.testng.Assert.assertEquals;

@Listeners(TestNGListener.class)
public class IterationOneTests implements TestsInit {

    //Test case for adding a good in the basket
    @Test
    public void addGoodInTheBasket() {
        WebPage.openUrl("https://apparel-uk.local:9002/ucstorefront/en");
        if($("button#details-button").isVisible()) {
            $("button#details-button").click();
            $("a#proceed-link").click();
        }
        //Go to Home page
        //In the global header search field, type “shirt”
        //Click search icon next to the field
        //Expected: a search results page is displayed with “You searched for “shirt”” header
        homePage.shouldBeOpened();
        searchInput.sendKeys("shirt");
        searchButton.click();
        assertEquals(searchResultsMessage.getText(), "You searched for \"shirt\"");

        //Click cart button under some shirt
        //Expected: “Added to your shopping bag” popup is displayed
        //Remember item name, size, quantity, and price
        //Click Check Out
        //Expected: Cart page is displayed
        //Validate that data of the added item is correct: name, size, quantity, price
    }



}
