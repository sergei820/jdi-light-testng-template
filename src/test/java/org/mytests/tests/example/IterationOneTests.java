package org.mytests.tests.example;

import org.mytests.tests.TestsInit;
import org.mytests.tests.testng.TestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class IterationOneTests extends BaseTest implements TestsInit {

    //Test case for adding a good in the basket
    @Test
    public void addGoodInTheBasket() {
        //Go to Home page
        homePageSteps.openHomePage();
        //In the global header search field, type “shirt”
        mainHeaderSteps.searchOnSite("shirt");
        //Expected: a search results page is displayed with “You searched for “shirt”” header
        searchResultsPageSteps.checkSearchResultHeader("You searched for \"shirt\"");
        //Click cart button under some shirt
        searchResultsPageSteps.addItemToCart("Shirt");
        //Expected: “Added to your shopping bag” popup is displayed
        addToCartFormSteps.checkPopupText("Added to Your Shopping Bag");
        //Remember item name, size, quantity, and price
        addToCartFormSteps.rememberItemParameters();
        //Click Check Out
        addToCartFormSteps.checkOut();
        //Expected: Cart page is displayed
        cartPageSteps.checkThatPageIsDisplayed();
        //Validate that data of the added item is correct: name, size, quantity, price
        cartPageSteps.compareItemToBuyWithItemInCart();
    }

    //Testcase for writing a review for the good
    @Test
    public void writeReviewTest() {
        //Go to Home page
        homePageSteps.openHomePage();
        //Click “Accessories” in the global header
        mainHeaderSteps.clickMenuItem("Accessories");
        //Expected: Page with accessories item cards is displayed
        accessoriesPageSteps.checkThatPageIsDisplayed();
        //Apply “Shop by price” filter: select £0-£19.99 and £20-£49.99 values
        filterFormSteps.clickFilterCheckbox("£0-£19.99");
        filterFormSteps.clickFilterCheckbox("£20-£49.99");
        //In the “Sort by” dropdown, select “Price (lowest first)” option
        filterFormSteps.selectSortByDropdownValue("Price (lowest first)");
        //Remember name and price of the first item
        searchResultsPageSteps.rememberItemParameters(1);
        //Click first item
        searchResultsPageSteps.clickOnItem(1);
        //Expected: item page has correct item name and price
        itemPageSteps.compareSearchedItemWithItemOnItemPage();
        //Click Reviews at the bottom of the page
        itemPageSteps.clickReviews();
        //Click Write a review
        itemPageSteps.clickWriteReview();
        //Fill in the form with the following data:
            //Review title: “My review”
            //Review description: “I’m so excited, I would buy it one more time”
            //Rating: 5
            //Your name: “John”
        itemPageSteps.fillInReviewSection("My review", "I’m so excited, I would buy it one more time", "5", "John");
        //Click Submit review
        itemPageSteps.clickSubmitReviewButton();
        //Expected: “Thank you for your review” message is displayed on top of the page
        itemPageSteps.checkActionResultMessage("Thank you for your review.");
    }

    //Test case for login with mistake(!)
    @Test
    public void loginWithMistake() {
        //Go to Home page
        homePageSteps.openHomePage();
        //Expected: tab title is “Apparel Site UK | Homepage”
        homePageSteps.checkPageTitle("Apparel Site UK | Homepage");
        //Click “Sign In / Register” link in the global header
        mainHeaderSteps.clickLoginRegisterButton();
        //Expected: Login page is displayed
        loginPageSteps.checkThatPageIsDisplayed();
        //Fill in the form in the “Returning customer” section with the following data: email address: example@mail.ru password: 1234
        loginPageSteps.fillInLogInForm("example@mail.ru", "1234");
        //Click Log in
        loginPageSteps.clickLogInButton();
        //Expected: you were successfully logged in, Login page is no more displayed !
        //Actual (the mistake will be here): “Your username or password was incorrect.”
        loginPageSteps.checkActionResultMessage("you were successfully logged in, Login page is no more displayed !");
        //message is displayed on top of the page, you are still on the Login page”
        loginPageSteps.checkThatPageIsDisplayed();
    }
}
