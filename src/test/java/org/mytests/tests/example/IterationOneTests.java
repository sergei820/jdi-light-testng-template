package org.mytests.tests.example;

import org.mytests.tests.TestsInit;
import org.mytests.tests.testng.TestNGListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static org.mytests.tests.states.States.shouldBeLoggedIn;
import static org.mytests.uiobjects.example.site.SiteJdi.homePage;

@Listeners(TestNGListener.class)
public class IterationOneTests implements TestsInit {

    @BeforeMethod
    public void before() {
        shouldBeLoggedIn();
        homePage.shouldBeOpened();
    }

    public void addGoodInTheBasket() {

    }

    //Test case for adding a good in the basket
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
