package org.mytests.tests.example;

import org.hamcrest.Matchers;
import org.mytests.tests.TestsInit;
import org.mytests.tests.testng.TestNGListener;
import org.mytests.uiobjects.example.site.ApparelSiteUK;
import org.mytests.uiobjects.example.site.pages.ItemPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.epam.jdi.light.asserts.core.SoftAssert.jdiAssert;
import static com.epam.jdi.light.elements.composite.WebPage.openSite;
import static org.hamcrest.Matchers.containsString;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.itemPage;

@Listeners(TestNGListener.class)
public class IterationOneTests extends BaseTest {

    //Test case for adding a good in the basket
    @Test
    public void addGoodInTheBasket() {
        homePageSteps.openHomePage();
        mainHeaderSteps.searchOnSite("shirt");
        searchResultsPageSteps.checkSearchResultHeader("You searched for \"shirt\"");
        searchResultsPageSteps.addItemToCart("Shirt");
        addToCartFormSteps.checkPopupText("Added to Your Shopping Bag");
        addToCartFormSteps.rememberItemParameters();
        addToCartFormSteps.checkOut();
        cartPageSteps.checkThatPageIsDisplayed();
        cartPageSteps.compareItemToBuyWithItemInCart();
    }

    //Testcase for writing a review for the good
    @Test
    public void writeReviewTest() {
        //Go to Home page
        homePageSteps.openHomePage();
        mainHeaderSteps.clickMenuItem("Accessories");
        accessoriesPageSteps.checkThatPageIsDisplayed();
        filterFormSteps.clickFilterCheckbox("£0-£19.99");
        filterFormSteps.clickFilterCheckbox("£20-£49.99");
        filterFormSteps.selectSortByDropdownValue("Price (lowest first)");
        searchResultsPageSteps.rememberItemParameters(1);
        searchResultsPageSteps.clickOnItem(1);
        itemPageSteps.compareSearchedItemWithItemOnItemPage();
        itemPageSteps.clickReviews();
        itemPageSteps.clickWriteReview();
        itemPageSteps.fillInReviewSection("My review", "I’m so excited, I would buy it one more time", "5", "John");
        itemPageSteps.clickSubmitReviewButton();
        itemPageSteps.checkActionResultMessage("Thank you for your review.");
    }

    //Test case for login with mistake(!)
    @Test
    public void loginWithMistake() {
        homePageSteps.openHomePage();
        homePageSteps.checkPageTitle("Apparel Site UK | Homepage");
        mainHeaderSteps.clickLoginRegisterButton();
        loginPageSteps.checkThatPageIsDisplayed();
        loginPageSteps.fillInLogInForm("example@mail.ru", "1234");
        loginPageSteps.clickLogInButton();
        String resultMessage = ItemPage.postReviewResultMessage.getText();
        jdiAssert(resultMessage, containsString("you were successfully logged in, Login page is no more displayed !"));
        //loginPageSteps.checkActionResultMessage("you were successfully logged in, Login page is no more displayed !");
        //loginPageSteps.checkThatPageIsDisplayed();
    }
}
