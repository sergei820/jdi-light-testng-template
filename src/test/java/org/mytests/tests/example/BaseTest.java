package org.mytests.tests.example;

import org.mytests.tests.steps.CartPageSteps;
import org.mytests.uiobjects.example.site.pages.CartPage;
import org.mytests.uiobjects.example.site.pages.SearchResultsPage;
import org.mytests.uiobjects.example.site.sections.AddToCartForm;
import org.mytests.uiobjects.example.site.sections.MainHeader;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    CartPageSteps cartPageSteps;
    MainHeader mainHeader;
    SearchResultsPage searchResultsPage;
    AddToCartForm addToCartForm;

    @BeforeSuite
    public void setUp() {
        mainHeader = new MainHeader();
        cartPageSteps = new CartPageSteps();
        searchResultsPage = new SearchResultsPage();
        addToCartForm = new AddToCartForm();
    }

    @AfterSuite
    public void tearDown() {
    }
}
