package org.mytests.tests.example;

import org.mytests.tests.steps.AddToCartFormSteps;
import org.mytests.tests.steps.CartPageSteps;
import org.mytests.tests.steps.HomePageSteps;
import org.mytests.tests.steps.MainHeaderSteps;
import org.mytests.tests.steps.SearchResultsPageSteps;
import org.mytests.uiobjects.example.site.ApparelSiteUK;
import org.mytests.uiobjects.example.site.pages.CartPage;
import org.mytests.uiobjects.example.site.pages.SearchResultsPage;
import org.mytests.uiobjects.example.site.sections.AddToCartForm;
import org.mytests.uiobjects.example.site.sections.MainHeader;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    CartPageSteps cartPageSteps;
    HomePageSteps homePageSteps;
    MainHeaderSteps mainHeaderSteps;
    SearchResultsPageSteps searchResultsPageSteps;
    AddToCartFormSteps addToCartFormSteps;

    @BeforeSuite
    public void setUp() {
        homePageSteps = new HomePageSteps();
        mainHeaderSteps = new MainHeaderSteps();
        searchResultsPageSteps = new SearchResultsPageSteps();
        addToCartFormSteps = new AddToCartFormSteps();


        ApparelSiteUK.cartPage = new CartPage();
        ApparelSiteUK.mainHeader = new MainHeader();
        cartPageSteps = new CartPageSteps();
        ApparelSiteUK.searchResultsPage = new SearchResultsPage();
        ApparelSiteUK.addToCartForm = new AddToCartForm();
    }

    @AfterSuite
    public void tearDown() {
    }
}
