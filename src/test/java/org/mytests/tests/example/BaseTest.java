package org.mytests.tests.example;

import org.mytests.tests.TestsInit;
import org.mytests.tests.steps.AccessoriesPageSteps;
import org.mytests.tests.steps.AddToCartFormSteps;
import org.mytests.tests.steps.CartPageSteps;
import org.mytests.tests.steps.FilterFormSteps;
import org.mytests.tests.steps.HomePageSteps;
import org.mytests.tests.steps.ItemPageSteps;
import org.mytests.tests.steps.LoginPageSteps;
import org.mytests.tests.steps.MainHeaderSteps;
import org.mytests.tests.steps.SearchResultsPageSteps;
import org.mytests.uiobjects.example.site.ApparelSiteUK;
import org.mytests.uiobjects.example.site.pages.AccessoriesPage;
import org.mytests.uiobjects.example.site.pages.CartPage;
import org.mytests.uiobjects.example.site.pages.HomePage;
import org.mytests.uiobjects.example.site.pages.ItemPage;
import org.mytests.uiobjects.example.site.pages.LoginPage;
import org.mytests.uiobjects.example.site.pages.SearchResultsPage;
import org.mytests.uiobjects.example.site.sections.AddToCartForm;
import org.mytests.uiobjects.example.site.sections.FilterForm;
import org.mytests.uiobjects.example.site.sections.MainHeader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.epam.jdi.light.elements.init.PageFactory.initSite;

public class BaseTest implements TestsInit {

    static CartPageSteps cartPageSteps;
    static HomePageSteps homePageSteps;
    static MainHeaderSteps mainHeaderSteps;
    static SearchResultsPageSteps searchResultsPageSteps;
    static AddToCartFormSteps addToCartFormSteps;
    static AccessoriesPageSteps accessoriesPageSteps;
    static FilterFormSteps filterFormSteps;
    static ItemPageSteps itemPageSteps;
    static LoginPageSteps loginPageSteps;

    @BeforeMethod
    public void setUp() {
        homePageSteps = new HomePageSteps();
        mainHeaderSteps = new MainHeaderSteps();
        searchResultsPageSteps = new SearchResultsPageSteps();
        addToCartFormSteps = new AddToCartFormSteps();
        cartPageSteps = new CartPageSteps();
        accessoriesPageSteps = new AccessoriesPageSteps();
        filterFormSteps = new FilterFormSteps();
        itemPageSteps = new ItemPageSteps();
        loginPageSteps = new LoginPageSteps();

        ApparelSiteUK.homePage = new HomePage();
        ApparelSiteUK.cartPage = new CartPage();
        ApparelSiteUK.accessoriesPage = new AccessoriesPage();
        ApparelSiteUK.searchResultsPage = new SearchResultsPage();
        ApparelSiteUK.addToCartForm = new AddToCartForm();
        ApparelSiteUK.mainHeader = new MainHeader();
        ApparelSiteUK.filterForm = new FilterForm();
        ApparelSiteUK.itemPage = new ItemPage();
        ApparelSiteUK.loginPage = new LoginPage();

        initSite(ApparelSiteUK.class);
    }

    @AfterMethod
    public void tearDown() {
    }
}
