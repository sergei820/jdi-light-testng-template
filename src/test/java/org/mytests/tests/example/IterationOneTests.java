package org.mytests.tests.example;

import com.epam.jdi.light.elements.composite.WebPage;
import org.mytests.tests.TestsInit;
import org.mytests.tests.testng.TestNGListener;
import org.mytests.uiobjects.example.model.ProductItem;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.mytests.tests.steps.BasePageSteps.compileLocator;
import static org.mytests.uiobjects.example.model.ProductItemFactory.getProductToBeAddedToCart;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.cartPage;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.homePage;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.ADD_TO_CART_FROM_GRID;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.SEARCH_RESULTS;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.searchResults;
import static org.mytests.uiobjects.example.site.pages.SearchResultsPage.searchResultsMessage;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.addToCartLayerHeader;
import static org.mytests.uiobjects.example.site.sections.AddToCartForm.checkoutButton;
import static org.mytests.uiobjects.example.site.sections.MainHeader.searchButton;
import static org.mytests.uiobjects.example.site.sections.MainHeader.searchInput;
import static org.testng.Assert.assertEquals;

@Listeners(TestNGListener.class)
public class IterationOneTests extends BaseTest implements TestsInit {

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
        String shirtItemLocator = null;
        WebElement shirtItem;
        shirtItem = searchResults
                .stream()
                .filter(item -> item.getText().contains("shirt"))
                .findFirst()
                .orElse(null);
        shirtItem.click();

        for(int i = 0; i < searchResults.size(); i++) {
            if($(compileLocator(SEARCH_RESULTS, String.valueOf(i)) + "/a").getText().contains("shirt")) {
                shirtItemLocator = compileLocator(SEARCH_RESULTS, String.valueOf(i));
                break;
            }
        }
        //Click cart button under some shirt
        $(shirtItemLocator + ADD_TO_CART_FROM_GRID).click();




        //Expected: “Added to your shopping bag” popup is displayed
        assertEquals(addToCartLayerHeader.getText(), "Added to your shopping bag");
        //Remember item name, size, quantity, and price
        ProductItem itemToBuy = getProductToBeAddedToCart();
        //Click Check Out
        checkoutButton.click();
        //Expected: Cart page is displayed
        cartPage.shouldBeOpened();
        //Validate that data of the added item is correct: name, size, quantity, price
        ProductItem itemInCart = cartPageSteps.getAddedToCartItem();
    }


    //Testcase 2
    //Testcase for writing a review for the good
    //Go to Home page
    //Click “Accessories” in the global header
    //Expected: Page with accessories item cards is displayed
    //Apply “Shop by price” filter: select £0-£19.99 and £20-£49.99 values
    //In the “Sort by” dropdown, select “Price (lowest first)” option
    //Remember name and price of the first item
    //Click first item
    //Expected: item page has correct item name and price
    //Click Reviews at the bottom of the page
    //Click Write a review
    //Fill in the form with the following data:
    //Review title: “My review”
    //Review description: “I’m so excited, I would buy it one more time”
    //Rating: 5
    //Your name: “John”
    //Click Submit review
    //Expected: “Thank you for your review” message is displayed on top of the page




    //Testcase 3
    //Test case for login with mistake(!)
    //Go to Home page
    //Expected: tab title is “Apparel Site UK | Homepage”
    //Click “Sign In / Register” link in the global header
    //Expected: Login page is displayed
    //Fill in the form in the “Returning customer” section with the following data: email address: example@mail.ru password: 1234
    //Click Log in
    //Expected: you were successfully logged in, Login page is no more displayed ! Actual (the mistake will be here): “Your username or password
    //was incorrect.” message is displayed on top of the page, you are still on the Login page”



}
