package org.mytests.tests.example;

import org.mytests.tests.TestsInit;
import org.mytests.tests.testng.TestNGListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.homePage;
//import static org.mytests.uiobjects.example.site.pages.HomePage.accessories;

@Listeners(TestNGListener.class)
public class IterationOneTests implements TestsInit {

    //@BeforeMethod
    //    public void before() {
    //        //shouldBeLoggedIn();
    //    }

    //Test case for adding a good in the basket
    @Test
    public void addGoodInTheBasket() {
        openUrl("https://apparel-uk.local:9002/ucstorefront/en");
        //openUrl(homePage.url);
        //shouldBeOpened();
        //accessories.click();
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
