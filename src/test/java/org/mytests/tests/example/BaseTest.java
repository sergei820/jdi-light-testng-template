package org.mytests.tests.example;

import org.mytests.tests.steps.AccessoriesPageSteps;
import org.mytests.tests.steps.AddToCartFormSteps;
import org.mytests.tests.steps.CartPageSteps;
import org.mytests.tests.steps.FilterFormSteps;
import org.mytests.tests.steps.HomePageSteps;
import org.mytests.tests.steps.MainHeaderSteps;
import org.mytests.tests.steps.SearchResultsPageSteps;
import org.mytests.uiobjects.example.site.ApparelSiteUK;
import org.mytests.uiobjects.example.site.pages.AccessoriesPage;
import org.mytests.uiobjects.example.site.pages.CartPage;
import org.mytests.uiobjects.example.site.pages.HomePage;
import org.mytests.uiobjects.example.site.pages.SearchResultsPage;
import org.mytests.uiobjects.example.site.sections.AddToCartForm;
import org.mytests.uiobjects.example.site.sections.FilterForm;
import org.mytests.uiobjects.example.site.sections.MainHeader;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    CartPageSteps cartPageSteps;
    HomePageSteps homePageSteps;
    MainHeaderSteps mainHeaderSteps;
    SearchResultsPageSteps searchResultsPageSteps;
    AddToCartFormSteps addToCartFormSteps;
    AccessoriesPageSteps accessoriesPageSteps;
    FilterFormSteps filterFormSteps;

    @BeforeSuite
    public void setUp() {
        homePageSteps = new HomePageSteps();
        mainHeaderSteps = new MainHeaderSteps();
        searchResultsPageSteps = new SearchResultsPageSteps();
        addToCartFormSteps = new AddToCartFormSteps();
        cartPageSteps = new CartPageSteps();
        accessoriesPageSteps = new AccessoriesPageSteps();
        filterFormSteps = new FilterFormSteps();

        ApparelSiteUK.homePage = new HomePage();
        ApparelSiteUK.cartPage = new CartPage();
        ApparelSiteUK.accessoriesPage = new AccessoriesPage();
        ApparelSiteUK.searchResultsPage = new SearchResultsPage();
        ApparelSiteUK.addToCartForm = new AddToCartForm();
        ApparelSiteUK.mainHeader = new MainHeader();
        ApparelSiteUK.filterForm = new FilterForm();
    }

    @AfterSuite
    public void tearDown() {
    }
}
