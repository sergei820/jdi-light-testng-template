package org.mytests.tests.example;

import com.epam.jdi.light.asserts.generic.TextAssert.*;
import com.epam.jdi.light.elements.composite.WebPage;
import org.mytests.tests.TestsInit;
import org.mytests.tests.testng.TestNGListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.homePage;
import static org.mytests.uiobjects.example.site.pages.HomePage.searchButton;
import static org.mytests.uiobjects.example.site.pages.HomePage.searchInput;
import static org.mytests.uiobjects.example.site.pages.HomePage.searchResultsMessage;
import static org.testng.Assert.assertEquals;

@Listeners(TestNGListener.class)
public class IterationOneTests implements TestsInit {

    //@BeforeMethod
    //    public void before() {
    //        //shouldBeLoggedIn();
    //    }

    //Test case for adding a good in the basket
    @Test
    public void addGoodInTheBasket() {
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://apparel-uk.local:9002/ucstorefront/en");
        WebPage.openUrl("https://apparel-uk.local:9002/ucstorefront/en");
        if($("button#details-button").isVisible()) {
            $("button#details-button").click();
            $("a#proceed-link").click();
        }
        //WebPage.openUrl("https://apparel-uk.local:9002/ucstorefront/en");
        homePage.shouldBeOpened();
        //searchInput.sendKeys("shirt");
        $("input#js-site-search-input").input("shirt");
        //searchInput.sendKeys("shirt");
        searchButton.click();
        assertEquals(searchResultsMessage.getText(), "You searched for \"shirt\"");
        //Go to Home page
        //In the global header search field, type “shirt”
        //Click search icon next to the field
        //Expected: a search results page is displayed with “You searched for “shirt”” header
        //Click cart button under some shirt
        //Expected: “Added to your shopping bag” popup is displayed
        //Remember item name, size, quantity, and price
        //Click Check Out
        //Expected: Cart page is displayed
        //Validate that data of the added item is correct: name, size, quantity, price
    }



}
